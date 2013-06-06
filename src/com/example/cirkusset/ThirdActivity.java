package com.example.cirkusset;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.Model.SoundPlayer;
import com.example.experiment.R;

public class ThirdActivity extends Activity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		
		String stringInput1 = getIntent().getExtras().getString("input1");
		String stringInput2 = getIntent().getExtras().getString("input2");
		
		TextView text1 = (TextView) findViewById(R.id.lag1);
	    text1.setText("Lag 1 hittade "+stringInput1+" set!");
	    
	    TextView text2 = (TextView) findViewById(R.id.lag2);
	    text2.setText("Lag 2 hittade "+stringInput2+" set!");
		
		ImageButton spelaigen = (ImageButton) findViewById(R.id.spelaspeligen);
		spelaigen.setOnClickListener(this);
		
		// Load the ImageView that will host the animation and
		// set its background to our AnimationDrawable XML resource.
		ImageView img3 = (ImageView)findViewById(R.id.lights_default_end);
		img3.setBackgroundResource(R.drawable.spin_animation);

		// Get the background, which has been compiled to an AnimationDrawable object.
		AnimationDrawable frameAnimation3 = (AnimationDrawable) img3.getBackground();

		// Start the animation (looped playback by default).
		frameAnimation3.start();
	    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


	@Override
	public void onClick(View v) {
		
		Intent intent = new Intent(ThirdActivity.this,SecondActivity.class);
		startActivity(intent);
		overridePendingTransition(R.anim.bottomin, R.anim.topout);
		finish();
		
	}
}
