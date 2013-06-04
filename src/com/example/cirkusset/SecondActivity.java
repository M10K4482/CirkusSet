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
	private TextView player2;	
	private TextView text;
	private VideoView mVideoView;
	private ImageButton lollipopButton;
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
		// animation
		lollipopbounce = AnimationUtils.loadAnimation(this, R.anim.lollipopbounce);
		counter = new MyCount(50000, 1000);
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
		sounds = new SoundPlayer(this);
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
						new CountDownTimer(1000, 1000){
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
									player1 = (TextView) findViewById(R.id.spelare1);
									player1.setText(""+points.getPlayerOneScore());
									player2 = (TextView) findViewById(R.id.spelare2);
									player2.setText(""+points.getPlayerTwoScore());
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
	}
	
	private void restart() {
		mVideoView.setVisibility(VideoView.INVISIBLE);
		lollipopButton.setAlpha(0f);
		lollipopButton.setClickable(false);
		changePlayer = !changePlayer;
		points.setWhichPlayer(changePlayer);
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
	protected void onResume() {
		super.onResume();
		
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
			if(gameCounter == 1){
				Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
				intent.putExtra("input1", Integer.toString(points.getPlayerOneScore()));
				intent.putExtra("input2", Integer.toString(points.getPlayerTwoScore()));
				startActivity(intent);
				finish();
			}else{
				gameCounter++;
			}
			shuffleButton.setClickable(false);
			shuffleButton.setAlpha(0f);
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
		restart();
	}
	
	}
