package com.example.cirkusset;

import com.example.Model.Card;

import com.example.Model.CardsOnPad;
import com.example.Model.Deck;
import com.example.Model.PointCounter;
import com.example.Model.RuleLogic;
import com.example.Model.SoundPlayer;
import com.example.cirkusset.ImageAdapter;
import com.example.cirkusset.MainActivity;
import com.example.experiment.R;

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

public class MainActivity extends Activity implements OnCompletionListener{
	
	private GridView gr; //Skapa en referens (gridview)
	private ImageAdapter im; //Skapa en referens (im) så att man kan komma åt ImageAdapter klassen
	private CardsOnPad onPad; //Referens till de kort som skall vara på paddan 
	private RuleLogic logic;
	private int counter;
	private static int PRESSED_LIMIT = 3;
	private boolean setCards;
	private Deck aDeck;
	private ImageButton shuffleButton;
	private SoundPlayer sounds;
	private PointCounter points;
	private boolean changePlayer = true;
	private TextView spelare1;
	private TextView spelare2;
	
	TextView text; // visa nedräkning

	private VideoView mVideoView;
	private ImageButton knapp;
	private Animation lollipopbounce;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid_test); //Sätt layouten som content för appen
		
		
		
		mVideoView = (VideoView) findViewById(R.id.surface_view);
		knapp = (ImageButton) findViewById(R.id.imageButton2);
		mVideoView.setOnCompletionListener(this);
		// animation
		lollipopbounce = AnimationUtils.loadAnimation(this,
				R.anim.lollipopbounce);
		restart();
		
		this.shuffleButton = (ImageButton)this.findViewById(R.id.imageButton1);
		  this.shuffleButton.setOnClickListener(new OnClickListener() {
		    @Override
		  public void onClick(View v) {
		      onPad.getNewHand();
		      im.notifyDataSetChanged();
		    }
		  });
		
		onPad = new CardsOnPad(); //Kör igång CardsOnPad klassen genom att anropa konstruktorn (CardsOnPad()) med referensen onPad
		gr = (GridView) findViewById(R.id.gridviewTest); //Koppla gridview till layouten 
		im = new ImageAdapter(this,onPad); //Skicka CardsOnPad referensen onPad till ImageAdapters konstruktor
		logic = new RuleLogic();
		gr.setAdapter(im); //Skapa adapter skicka in våra kort 
		// Ni har helt enkelt missat att initiera "getSounds" objektet - eftersom ni använder mediaplayer i Sounds klassen så måste ni även skicka med en referens till aktiviteten (alltså den kontext där ljuden skall spelas)
				sounds = new SoundPlayer(this);
				points = new PointCounter();
				
				gr.setOnItemClickListener(new OnItemClickListener() { //Kolla efter "Klick" med OnItemClickListener() och koppla till gridviewen
					
				public void onItemClick(AdapterView<?> parent, View v, int position, long id) { //Denna kï¿½r igï¿½ng nï¿½r man klickat nï¿½got och anvï¿½nder sig av en adaptor
					counter = 0;
					Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show(); //En toast med info om position
					Card ca = onPad.getCard(position); //Hï¿½mta kortet som klickats via dess position pï¿½ brï¿½det
					ca.pressCard(); //Tryck in kortet och byt dess bild
					sounds.getSound(3);
					
					for(int i = 0; i < onPad.getCards().size(); i++){	
						if(onPad.getCard(i).isPressed()==true){		
							counter = counter + 1;			
							if(counter == PRESSED_LIMIT){				
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
									spelare1 = (TextView) findViewById(R.id.spelare1);
									spelare1.setText("Lag 1: "+points.getPlayerOneScore());
									spelare2 = (TextView) findViewById(R.id.spelare1);
									spelare2.setText("Lag 1: "+points.getPlayerOneScore());
									Log.i("points", ""+points.getPlayerOneScore());
								}else{
									sounds.getSound(2);
								}
								im.notifyDataSetChanged();
							}	
						}	
					}
					im.notifyDataSetChanged();//Efter att ett kort klickas ska spelplanen ritas om fï¿½r att visa dennna fï¿½rï¿½ndring
					}
				});
			}
	
	private void restart() {
		mVideoView.setVisibility(VideoView.INVISIBLE);
		knapp.setAlpha(0f);
		knapp.setClickable(false);
		changePlayer = !changePlayer;
		MyCount counter = new MyCount(20000, 1000);
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
			text.setText("Stopp!");
			runvideo();
		}

		@Override
		public void onTick(long millisUntilFinished) {
			text = (TextView) findViewById(R.id.tv);
			text.setText("Tid kvar: " + millisUntilFinished / 1000);	
		}
	}

	public void onCompletion(MediaPlayer mp) {
		knapp.setAlpha(1.0f);
		knapp.startAnimation(lollipopbounce);
		knapp.setClickable(true);
		Log.i("plap", "I onCompletion");	
	}
	//Nar man trycker pa spela-knappen onClick du vet
	public void restartClick(View v) {
		changePlayer = !changePlayer;
		restart();
	}
	
	}