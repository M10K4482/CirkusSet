/**Namn: CirkusSet
 * Skapare: Mark Wibom, Max Moberg, Annebell Larsson, Andrea Edstr�m, 
 * Daniel Sofinet, Maja Mercedes Bostr�m, Alexander Moe Ditlevsen 
 * Programm: IDK12
 * Kurs: Programmering f�r interaktionsdesign 3: Mobila appar*/

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
	
	/*En massa variabler f�r kommande grejjer*/
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
		gameCounter = 0; //En r�knare f�r att r�kna totallt antal rundor
		points = new PointCounter(); //Referens till po�ngr�knar-klassen
		mVideoView = (VideoView) findViewById(R.id.surface_view); //Anv�nds f�r att spela videon
		lollipopButton = (ImageButton) findViewById(R.id.imageButton2); //Knappen f�r att starta n�sta lags runda
		mVideoView.setOnCompletionListener(this);
		lollipopbounce = AnimationUtils.loadAnimation(this, R.anim.lollipopbounce);
		restart(); //K�r ig�ng metod med tidr�knare
		
		/*Shuffle-knappen med en klick-lyssnare*/
		this.shuffleButton = (ImageButton)this.findViewById(R.id.imageButton1);
		this.shuffleButton.setOnClickListener(new OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    	decreaseTime(); //Kalla p� metoden f�r att minska tiden varje g�ng man trycker p� shuffle-knappen
		    	onPad.getNewHand(); //Byt alla korten p� br�det
		    	im.notifyDataSetChanged(); //Rita om br�det
		    }
		});
		
		onPad = new CardsOnPad(); //K�r ig�ng CardsOnPad klassen genom att anropa konstruktorn (CardsOnPad()) med referensen onPad
		gr = (GridView) findViewById(R.id.gridviewTest); //Koppla gridview till layouten 
		im = new ImageAdapter(this,onPad); //Skicka CardsOnPad referensen onPad till ImageAdapters konstruktor
		logic = new RuleLogic();
		gr.setAdapter(im); //Skapa adapter skicka in v�ra kort 
		sounds = new SoundPlayer(this, true); //K�r ig�ng ljudet
		points = new PointCounter();
				
		gr.setOnItemClickListener(new OnItemClickListener() { //Kolla efter "Klick" med OnItemClickListener() och koppla till gridviewen
					
		/*Denna k�r ig�ng n�r man klickat n�got i gridViewen*/
		public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
			cardCounter = 0; //En r�knare f�r antal nertryckta kort
			Card ca = onPad.getCard(position); //H�mta kortet som klickats via dess position p� br�det
			ca.pressCard(); //Tryck in kortet och byt dess bild
			sounds.getSound(3); //Spela "klick"-ljud n�r n�got klickas i gridViewen
			im.notifyDataSetChanged(); //Rita om br�det
			
			/*Kod som kollar om ett set �r r�tt eller fel.*/
			for(int i = 0; i < onPad.getCards().size(); i++){	
				if(onPad.getCard(i).isPressed()==true){	
					cardCounter += 1; //Varje g�ng ett kort �r klickat s� plussa p� ett 
					if(cardCounter == PRESSED_LIMIT){ //Om antal klickade kort �r lika med tre s� g� vidare
						new CountDownTimer(200, 1000){ //G�r en lite paus s� att man hinner se att det tredje kortet klickas ner
							
							public void onTick(long millisUntilFinished){			
							}
							
							/**N�r tiden f�r pausen �r slut s� k�r vidare i denna onFinish metod*/
							public void onFinish(){
								
								setCards = logic.getRules(onPad.getPressedCards()); //Anropa klassen med regler och skicka med de tre klickade korten	
								
								/*Efter det s� g� igenom korten och "avklicka" de som �r klickade*/
								for(int a = 0; a < onPad.getCards().size(); a++){ 
									if(onPad.getCard(a).isPressed()==true){						
										onPad.getCard(a).pressCard();					
									}
									
								}	
								
								/*�r korten som klickats ett sett s� g� in h�r*/
								if(setCards == true){
									points.setPlayerScore(1); //Ge r�tt spelare ett po�ng
									sounds.getSound(1); //Spela ett vinnare-ljud
									onPad.getThreeCards(); //Ers�tt setet med tre nya kort
									/*Beroende p� om changePlayer �r true eller false s� ska olika grejjer i grafiken "t�ndas" eller "sl�ckas"*/
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
									sounds.getSound(2); //�r det inte ett set s� spela ett f�rlorar-ljud
								}
								im.notifyDataSetChanged(); //Rita om br�det
							}
					}.start();
					}	
				}	
			}
		}
		});
		
		/*Kod som sk�ter blinkandet av lyktor runt po�ngr�knarna*/
		ImageView img = (ImageView)findViewById(R.id.scoreboardlag1);
		img.setBackgroundResource(R.drawable.spin_animation2);
		AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
		frameAnimation.start();
		ImageView img2 = (ImageView)findViewById(R.id.scoreboardlag2);
		img2.setBackgroundResource(R.drawable.spin_animation2);
		AnimationDrawable frameAnimation2 = (AnimationDrawable) img2.getBackground();
		frameAnimation2.start();
		
	}
	
	/**En metod som, berodende p� vilken spelare som �r vald, aktiverar och avaktiverar olika 
	 * grafiska grejjer samt k�r ig�ng tid-nedr�kningen*/
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
		
		points.setWhichPlayer(changePlayer); //S�tter vilken spelare som ska f� po�ng
		counter = new MyCount(50000, 1000); //S�tter upp ett objekt f�r att r�kna tiden
		counter.start(); //Startar nedr�kningen
		
	}
	
	/**En metod f�r att spela upp "byte lag"-videon*/
	private void runvideo() {
		mVideoView.setVisibility(VideoView.VISIBLE);
		mVideoView = (VideoView) findViewById(R.id.surface_view);
		mVideoView.setVideoURI(Uri.parse("android.resource://"
				+ getPackageName() + "/" + R.raw.nestelag));
		mVideoView.setMediaController(new MediaController(this));
		mVideoView.requestFocus();
		mVideoView.start();
	}

	/**En metod f�r att minska tiden vid varje shuffling*/
	public void decreaseTime(){
		newTime = newTime - 10000;
		counter.cancel();
		counter = new MyCount(newTime, 1000);
		counter.start();	
	}
	
	/**Metod f�r att pausa ljudet n�r man l�mmnar spelet*/
	@Override
	protected void onPause(){
		super.onPause();
		sounds.stopBackgroundMusic();
	}
	
	/**Metod f�r att forts�tta ljudet n�r man forts�tter spelet*/
	@Override
	protected void onResume() {
		super.onResume();
		sounds.startBackgroundMusic();
	}

	/**Metod f�r tidr�knaren*/
	public class MyCount extends CountDownTimer {
		public MyCount(long millisInFuture, long countDownInterval) {
			super(millisInFuture, countDownInterval);
		}
		
		/**Metod som n�r tiden ar ute sa spelas bla. filmen o knappen dyker upp*/
		@Override
		public void onFinish() {
			text.setText("0");
			/*Om gameCounter blivit fem (allts� att fem rundor f�rflutit) s� starta en ny intent 
			 * f�r den sista sidan och g� till denna ist�llet*/
			if(gameCounter == 5) {
				Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
				intent.putExtra("input1", Integer.toString(points.getPlayerOneScore()));
				intent.putExtra("input2", Integer.toString(points.getPlayerTwoScore()));
				startActivity(intent);
				overridePendingTransition(R.anim.bottomin, R.anim.topout);
				finish();
			}else{
				gameCounter++; //Om gameCounter inte blivit fem (allts� att fem rundor inte f�rflutit) s� plussa p� gameCounter
			}
			shuffleButton.setClickable(false); //G�r s� att man inte kan r�ka trycka ner shuffleButton
			shuffleButton.setAlpha(0f);
			/*Om det inte redan gjorts s� avtryck nedtryckta kort*/
			for(int i = 0; i < onPad.getCards().size(); i++){	
				if(onPad.getCard(i).isPressed()==true){
				onPad.getCard(i).pressCard();	
				}
			}
			im.notifyDataSetChanged(); //Rita om br�det
			gr.setClickable(false);  //G�r GridViewen oklickbar tillsvidare
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
	
	/**Metod f�r n�r man trycker p� "n�sta-lags-tur" knappen, byter bland annat changePlayer till true/false*/
	public void restartClick(View v) {
		shuffleButton.setClickable(true);
		shuffleButton.setAlpha(1.0f);
		gr.setClickable(true);
		changePlayer = !changePlayer;
		restart();
	}
	
	}
