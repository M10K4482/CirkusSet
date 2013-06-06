package com.example.cirkusset;
//Testar github 6/3
import com.example.cirkusset.MainActivity;

import com.example.Model.Card;

import com.example.Model.CardsOnPad;
import com.example.Model.Deck;
import com.example.Model.PointCounter;
import com.example.Model.RuleLogic;
import com.example.Model.SoundPlayer;
import com.example.experiment.R;
import com.example.experiment.R.anim;
import com.example.experiment.R.id;
import com.example.experiment.R.layout;
import com.example.experiment.R.raw;

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
	
	private GridView gr; //Skapa en referens (gridview)
	private ImageAdapter im; //Skapa en referens (im) så att man kan komma åt ImageAdapter klassen
	private CardsOnPad onPad; //Referens till de kort som skall vara på paddan 
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
		setContentView(R.layout.activity_grid_test); //Sätt layouten som content för appen
		gameCounter = 0;
		points = new PointCounter();
		mVideoView = (VideoView) findViewById(R.id.surface_view);
		lollipopButton = (ImageButton) findViewById(R.id.imageButton2);
		mVideoView.setOnCompletionListener(this);
		lollipopbounce = AnimationUtils.loadAnimation(this, R.anim.lollipopbounce);
		restart();
		
		this.shuffleButton = (ImageButton)this.findViewById(R.id.imageButton1);
		this.shuffleButton.setOnClickListener(new OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    	decreaseTime();
		    	onPad.getNewHand();
		    	im.notifyDataSetChanged();
		    }
		});
		
		onPad = new CardsOnPad(); //Kör igång CardsOnPad klassen genom att anropa konstruktorn (CardsOnPad()) med referensen onPad
		gr = (GridView) findViewById(R.id.gridviewTest); //Koppla gridview till layouten 
		im = new ImageAdapter(this,onPad); //Skicka CardsOnPad referensen onPad till ImageAdapters konstruktor
		logic = new RuleLogic();
		gr.setAdapter(im); //Skapa adapter skicka in våra kort 
		sounds = new SoundPlayer(this, true);
		points = new PointCounter();
				
		gr.setOnItemClickListener(new OnItemClickListener() { //Kolla efter "Klick" med OnItemClickListener() och koppla till gridviewen
					
		public void onItemClick(AdapterView<?> parent, View v, int position, long id) { //Denna kï¿½r igï¿½ng nï¿½r man klickat nï¿½got och anvï¿½nder sig av en adaptor
			cardCounter = 0;
			Card ca = onPad.getCard(position); //Hï¿½mta kortet som klickats via dess position pï¿½ brï¿½det
			ca.pressCard(); //Tryck in kortet och byt dess bild
			sounds.getSound(3);
			im.notifyDataSetChanged();
					
			for(int i = 0; i < onPad.getCards().size(); i++){	
				if(onPad.getCard(i).isPressed()==true){	
					cardCounter += 1;
					if(cardCounter == PRESSED_LIMIT){
						new CountDownTimer(200, 1000){
							public void onTick(long millisUntilFinished){
								
							}
							public void onFinish(){
								setCards = logic.getRules(onPad.getPressedCards());				
								for(int a = 0; a < onPad.getCards().size(); a++){
									if(onPad.getCard(a).isPressed()==true){						
										onPad.getCard(a).pressCard();					
									}
								}		
								if(setCards == true){
									points.setPlayerScore(1);
									sounds.getSound(1);
									onPad.getThreeCards();
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
									sounds.getSound(2);
								}
								im.notifyDataSetChanged();
							}
					}.start();
					}	
				}	
			}
		}
		});
		
		// Load the ImageView that will host the animation and
		// set its background to our AnimationDrawable XML resource.
		ImageView img = (ImageView)findViewById(R.id.scoreboardlag1);
		img.setBackgroundResource(R.drawable.spin_animation2);

		// Get the background, which has been compiled to an AnimationDrawable object.
		AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

		// Start the animation (looped playback by default).
		frameAnimation.start();


		// Load the ImageView that will host the animation and
		// set its background to our AnimationDrawable XML resource.
		ImageView img2 = (ImageView)findViewById(R.id.scoreboardlag2);
		img2.setBackgroundResource(R.drawable.spin_animation2);

		// Get the background, which has been compiled to an AnimationDrawable object.
		AnimationDrawable frameAnimation2 = (AnimationDrawable) img2.getBackground();

		// Start the animation (looped playback by default).
		frameAnimation2.start();
	}
	
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
		Log.i("PlayerKnapp", ""+changePlayer);
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
		points.setWhichPlayer(changePlayer);
		counter = new MyCount(50000, 1000);
		counter.start();
	}
	//Videospelaren for animationen
	private void runvideo() {
		mVideoView.setVisibility(VideoView.VISIBLE);
		mVideoView = (VideoView) findViewById(R.id.surface_view);
		mVideoView.setVideoURI(Uri.parse("android.resource://"
				+ getPackageName() + "/" + R.raw.nestelag));
		mVideoView.setMediaController(new MediaController(this));
		mVideoView.requestFocus();
		mVideoView.start();
	}

	public void decreaseTime(){
		newTime = newTime - 10000;
		counter.cancel();
		counter = new MyCount(newTime, 1000);
		counter.start();	
	}
	
	@Override
	protected void onPause(){
		super.onPause();
		sounds.stopBackgroundMusic();
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		sounds.startBackgroundMusic();
	}

	// RäknarN
	public class MyCount extends CountDownTimer {
		public MyCount(long millisInFuture, long countDownInterval) {
			super(millisInFuture, countDownInterval);
		}
		//Nar tiden ar ute sa spelas filmen o knappen dyker upp
		@Override
		public void onFinish() {
			text.setText("0");
			if(gameCounter == 5) {
				Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
				intent.putExtra("input1", Integer.toString(points.getPlayerOneScore()));
				intent.putExtra("input2", Integer.toString(points.getPlayerTwoScore()));
				startActivity(intent);
				overridePendingTransition(R.anim.bottomin, R.anim.topout);
				finish();
			}else{
				gameCounter++;
			}
			shuffleButton.setClickable(false);
			shuffleButton.setAlpha(0f);
			for(int i = 0; i < onPad.getCards().size(); i++){	
				if(onPad.getCard(i).isPressed()==true){
				onPad.getCard(i).pressCard();	
				}
			}
			im.notifyDataSetChanged();
			gr.setClickable(false);
			runvideo();
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
	
	//Nar man trycker pa spela-knappen onClick du vet
	public void restartClick(View v) {
		shuffleButton.setClickable(true);
		shuffleButton.setAlpha(1.0f);
		gr.setClickable(true);
		changePlayer = !changePlayer;
		restart();
	}
	
	}
