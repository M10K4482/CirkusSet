/**Namn: CirkusSet
 * Skapare: Mark Wibom, Max Moberg, Annebell Larsson, Andrea Edström, 
 * Daniel Sofinet, Maja Mercedes Boström, Alexander Moe Ditlevsen 
 * Programm: IDK12
 * Kurs: Programmering för interaktionsdesign 3: Mobila appar*/

package com.example.cirkusset;

import com.example.cirkusset.MainActivity;

import com.example.Model.Card;

import com.example.Model.CardsOnPad;
import com.example.Model.Deck;
import com.example.Model.PointCounter;
import com.example.Model.RuleLogic;
import com.example.Model.SoundPlayer;
import com.example.CirkusSetApp.R;
import com.example.CirkusSetApp.R.anim;
import com.example.CirkusSetApp.R.id;
import com.example.CirkusSetApp.R.layout;
import com.example.CirkusSetApp.R.raw;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class SecondActivity extends Activity implements OnCompletionListener{
	
	/*En massa variabler för kommande grejjer*/
	private GridView gr; 
	private ImageAdapter im; 
	private CardsOnPad onPad; 
	private RuleLogic logic;
	private int cardCounter;
	private static int PRESSED_LIMIT = 3;
	private boolean setCards;
	private ImageButton shuffleButton;
	private SoundPlayer sounds;
	private PointCounter points;
	private boolean changePlayer = true;
	private TextView player1;
	private TextView player1dimm;
	private TextView player2;
	private TextView player2dimm;
	private TextView text;
	private VideoView mVideoView;
	private ImageButton lollipopButton;
	private ImageView teamOneUnmarked;
	private ImageView teamTwoUnMarked;
	private ImageView teamOneMarked;
	private ImageView teamTwoMarked;
	private TextView teamOnePoints;
	private TextView teamTwoPoints;
	private TextView teamOnePointsDimm;
	private TextView teamTwoPointsDimm;
	private ImageView blinkTeamOne;
	private ImageView blinkTeamTwo;
	private Animation lollipopbounce;
	private int gameCounter;
	private MyCount counter;
	private long newTime;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		gameCounter = 0; //En räknare för att räkna totallt antal rundor
		points = new PointCounter(); //Referens till poängräknar-klassen
		mVideoView = (VideoView) findViewById(R.id.surface_view); //Används för att spela videon
		lollipopButton = (ImageButton) findViewById(R.id.imageButton2); //Knappen för att starta nästa lags runda
		mVideoView.setOnCompletionListener(this);
		lollipopbounce = AnimationUtils.loadAnimation(this, R.anim.lollipopbounce);
		restart(); //Kör igång metod med tidräknare
		
		/*Shuffle-knappen med en klick-lyssnare*/
		this.shuffleButton = (ImageButton)this.findViewById(R.id.imageButton1);
		this.shuffleButton.setOnClickListener(new OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    	decreaseTime(); //Kalla på metoden för att minska tiden varje gång man trycker på shuffle-knappen
		    	onPad.getNewHand(); //Byt alla korten på brädet
		    	im.notifyDataSetChanged(); //Rita om brädet
		    }
		});
		
		onPad = new CardsOnPad(); //Kör igång CardsOnPad klassen genom att anropa konstruktorn (CardsOnPad()) med referensen onPad
		gr = (GridView) findViewById(R.id.gridviewTest); //Koppla gridview till layouten 
		im = new ImageAdapter(this,onPad); //Skicka CardsOnPad referensen onPad till ImageAdapters konstruktor
		logic = new RuleLogic();
		gr.setAdapter(im); //Skapa adapter skicka in våra kort 
		sounds = new SoundPlayer(this, true); //Kör igång ljudet
		points = new PointCounter();
				
		gr.setOnItemClickListener(new OnItemClickListener() { //Kolla efter "Klick" med OnItemClickListener() och koppla till gridviewen
					
		/*Denna kör igång när man klickat något i gridViewen*/
		public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
			cardCounter = 0; //En räknare för antal nertryckta kort
			Card ca = onPad.getCard(position); //Hämta kortet som klickats via dess position på brädet
			ca.pressCard(); //Tryck in kortet och byt dess bild
			sounds.getSound(3); //Spela "klick"-ljud när något klickas i gridViewen
			im.notifyDataSetChanged(); //Rita om brädet
			
			/*Kod som kollar om ett set är rätt eller fel.*/
			for(int i = 0; i < onPad.getCards().size(); i++){	
				if(onPad.getCard(i).isPressed()==true){	
					cardCounter += 1; //Varje gång ett kort är klickat så plussa på ett 
					if(cardCounter == PRESSED_LIMIT){ //Om antal klickade kort är lika med tre så gå vidare
						new CountDownTimer(200, 1000){ //Gör en lite paus så att man hinner se att det tredje kortet klickas ner
							
							public void onTick(long millisUntilFinished){			
							}
							
							/**När tiden för pausen är slut så kör vidare i denna onFinish metod*/
							public void onFinish(){
								
								setCards = logic.getRules(onPad.getPressedCards()); //Anropa klassen med regler och skicka med de tre klickade korten	
								
								/*Efter det så gå igenom korten och "avklicka" de som är klickade*/
								for(int a = 0; a < onPad.getCards().size(); a++){ 
									if(onPad.getCard(a).isPressed()==true){						
										onPad.getCard(a).pressCard();					
									}
									
								}	
								
								/*Är korten som klickats ett sett så gå in här*/
								if(setCards == true){
									points.setPlayerScore(1); //Ge rätt spelare ett poäng
									sounds.getSound(1); //Spela ett vinnare-ljud
									onPad.getThreeCards(); //Ersätt setet med tre nya kort
									/*Beroende på om changePlayer är true eller false så ska olika grejjer i grafiken "tändas" eller "släckas"*/
									if(changePlayer == true){ 
										player1 = (TextView) findViewById(R.id.spelare1);
										player1.setText(""+points.getPlayerOneScore());
										player2dimm = (TextView) findViewById(R.id.spelare2dimm);
										player2dimm.setText(""+points.getPlayerTwoScore());
									}else if(changePlayer == false){
										player2 = (TextView) findViewById(R.id.spelare2);
										player2.setText(""+points.getPlayerTwoScore());
										player1dimm = (TextView) findViewById(R.id.spelare1dimm);
										player1dimm.setText(""+points.getPlayerOneScore());	
									}
									
								}else{
									sounds.getSound(2); //Är det inte ett set så spela ett förlorar-ljud
								}
								im.notifyDataSetChanged(); //Rita om brädet
							}
					}.start();
					}	
				}	
			}
		}
		});
		
		/*Kod som sköter blinkandet av lyktor runt poängräknarna*/
		ImageView img = (ImageView)findViewById(R.id.scoreboardlag1);
		img.setBackgroundResource(R.drawable.spin_animation2);
		AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
		frameAnimation.start();
		ImageView img2 = (ImageView)findViewById(R.id.scoreboardlag2);
		img2.setBackgroundResource(R.drawable.spin_animation2);
		AnimationDrawable frameAnimation2 = (AnimationDrawable) img2.getBackground();
		frameAnimation2.start();
		
	}
	
	/**En metod som, berodende på vilken spelare som är vald, aktiverar och avaktiverar olika 
	 * grafiska grejjer samt kör igång tid-nedräkningen*/
	private void restart() {
		
		mVideoView.setVisibility(VideoView.INVISIBLE);
		lollipopButton.setAlpha(0f);
		lollipopButton.setClickable(false);
		teamOneMarked = (ImageView)this.findViewById(R.id.imageView3);
		teamOneUnmarked = (ImageView)this.findViewById(R.id.imageView1);
		teamTwoUnMarked = (ImageView)this.findViewById(R.id.imageView2);
		teamTwoMarked = (ImageView)this.findViewById(R.id.imageView4);
		teamOnePoints = (TextView)this.findViewById(R.id.spelare1);
		teamTwoPoints = (TextView)this.findViewById(R.id.spelare2);
		teamOnePointsDimm = (TextView)this.findViewById(R.id.spelare1dimm);
		teamTwoPointsDimm = (TextView)this.findViewById(R.id.spelare2dimm);
		blinkTeamOne = (ImageView)this.findViewById(R.id.scoreboardlag1);
		blinkTeamTwo = (ImageView)this.findViewById(R.id.scoreboardlag2);
		
		if(changePlayer){			
			teamOneUnmarked.setAlpha(1.0f);
			teamOneMarked.setAlpha(0f);
			teamTwoUnMarked.setAlpha(0f);
			teamTwoMarked.setAlpha(1.0f);
			teamOnePoints.setAlpha(1.0f);
			teamOnePointsDimm.setAlpha(0f);
			teamTwoPoints.setAlpha(0f);
			teamTwoPointsDimm.setAlpha(1.0f);
			player1 = (TextView) findViewById(R.id.spelare1);
			player1.setText(""+points.getPlayerOneScore());
			player2dimm = (TextView) findViewById(R.id.spelare2dimm);
			player2dimm.setText(""+points.getPlayerTwoScore());
			blinkTeamOne.setAlpha(1.0f);
			blinkTeamTwo.setAlpha(0f);
		}else{
			teamTwoUnMarked.setAlpha(1.0f);
			teamTwoMarked.setAlpha(0f);
			teamOneUnmarked.setAlpha(0f);
			teamOneMarked.setAlpha(1.0f);
			teamTwoPoints.setAlpha(1.0f);
			teamTwoPointsDimm.setAlpha(0f);
			teamOnePoints.setAlpha(0f);
			teamOnePointsDimm.setAlpha(1.0f);
			player2 = (TextView) findViewById(R.id.spelare2);
			player2.setText(""+points.getPlayerTwoScore());
			player1dimm = (TextView) findViewById(R.id.spelare1dimm);
			player1dimm.setText(""+points.getPlayerOneScore());	
			blinkTeamTwo.setAlpha(1.0f);
			blinkTeamOne.setAlpha(0f);
		}
		
		points.setWhichPlayer(changePlayer); //Sätter vilken spelare som ska få poäng
		counter = new MyCount(50000, 1000); //Sätter upp ett objekt för att räkna tiden
		counter.start(); //Startar nedräkningen
		
	}
	
	/**En metod för att spela upp "byte lag"-videon*/
	private void runvideo() {
		mVideoView.setVisibility(VideoView.VISIBLE);
		mVideoView = (VideoView) findViewById(R.id.surface_view);
		mVideoView.setVideoURI(Uri.parse("android.resource://"
				+ getPackageName() + "/" + R.raw.nestelag));
		mVideoView.setMediaController(new MediaController(this));
		mVideoView.requestFocus();
		mVideoView.start();
	}

	/**En metod för att minska tiden vid varje shuffling*/
	public void decreaseTime(){
		newTime = newTime - 10000;
		counter.cancel();
		counter = new MyCount(newTime, 1000);
		counter.start();	
	}
	
	/**Metod för att pausa ljudet när man lämmnar spelet*/
	@Override
	protected void onPause(){
		super.onPause();
		sounds.stopBackgroundMusic();
	}
	
	/**Metod för att fortsätta ljudet när man fortsätter spelet*/
	@Override
	protected void onResume() {
		super.onResume();
		sounds.startBackgroundMusic();
	}

	/**Metod för tidräknaren*/
	public class MyCount extends CountDownTimer {
		public MyCount(long millisInFuture, long countDownInterval) {
			super(millisInFuture, countDownInterval);
		}
		
		/**Metod som när tiden ar ute sa spelas bla. filmen o knappen dyker upp*/
		@Override
		public void onFinish() {
			text.setText("0");
			/*Om gameCounter blivit fem (alltså att fem rundor förflutit) så starta en ny intent 
			 * för den sista sidan och gå till denna istället*/
			if(gameCounter == 5) {
				Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
				intent.putExtra("input1", Integer.toString(points.getPlayerOneScore()));
				intent.putExtra("input2", Integer.toString(points.getPlayerTwoScore()));
				startActivity(intent);
				overridePendingTransition(R.anim.bottomin, R.anim.topout);
				finish();
			}else{
				gameCounter++; //Om gameCounter inte blivit fem (alltså att fem rundor inte förflutit) så plussa på gameCounter
			}
			shuffleButton.setClickable(false); //Gör så att man inte kan råka trycka ner shuffleButton
			shuffleButton.setAlpha(0f);
			/*Om det inte redan gjorts så avtryck nedtryckta kort*/
			for(int i = 0; i < onPad.getCards().size(); i++){	
				if(onPad.getCard(i).isPressed()==true){
				onPad.getCard(i).pressCard();	
				}
			}
			im.notifyDataSetChanged(); //Rita om brädet
			gr.setClickable(false);  //Gör GridViewen oklickbar tillsvidare
			runvideo(); //Spela upp video
		}

		@Override
		public void onTick(long millisUntilFinished) {
			text = (TextView) findViewById(R.id.clock);	
			text.setText("" + millisUntilFinished/ 1000);
			newTime = millisUntilFinished;
		}
	}

	public void onCompletion(MediaPlayer mp) {
		lollipopButton.setAlpha(1.0f);
		lollipopButton.startAnimation(lollipopbounce);
		lollipopButton.setClickable(true);
	}
	
	/**Metod för när man trycker på "nästa-lags-tur" knappen, byter bland annat changePlayer till true/false*/
	public void restartClick(View v) {
		shuffleButton.setClickable(true);
		shuffleButton.setAlpha(1.0f);
		gr.setClickable(true);
		changePlayer = !changePlayer;
		restart();
	}
	
	}
