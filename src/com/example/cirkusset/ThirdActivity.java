package com.example.cirkusset;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.experiment.R;

public class ThirdActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		
		String stringInput1 = getIntent().getExtras().getString("input1");
		String stringInput2 = getIntent().getExtras().getString("input2");
		
		TextView text1 = (TextView) findViewById(R.id.lag1);
	    text1.setText("Lag tvås poäng: "+stringInput1);
	    
	    TextView text2 = (TextView) findViewById(R.id.lag2);
	    text2.setText("Lag etts poäng: " +stringInput2);
		
	    Button tillbaks = (Button) findViewById(R.id.tillbaks);
		tillbaks.setOnClickListener(this);
	    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


	@Override
	public void onClick(View v) {
		
		Intent intent = new Intent(ThirdActivity.this,MainActivity.class);
		startActivity(intent);
		overridePendingTransition(R.anim.bottomin, R.anim.topout);
		finish();
		
	}
}
