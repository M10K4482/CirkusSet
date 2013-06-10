/**Namn: CirkusSet
 * Skapare: Mark Wibom, Max Moberg, Annebell Larsson, Andrea Edström, 
 * Daniel Sofinet, Maja Mercedes Boström, Alexander Moe Ditlevsen 
 * Programm: IDK12
 * Kurs: Programmering för interaktionsdesign 3: Mobila appar*/

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

import com.example.Model.SoundPlayer;
import com.example.CirkusSetApp.R;

/**En klass för den första meny-sidan*/
public class MainActivity extends Activity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		
		ImageButton imageButton1 = (ImageButton) findViewById(R.id.imagebutton1);
		imageButton1.setOnClickListener(this);

		ImageView img = (ImageView)findViewById(R.id.light_default);
		img.setBackgroundResource(R.drawable.spin_animation);

		AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

		frameAnimation.start();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


	@Override
	public void onClick(View v) {
		
		Intent intent = new Intent(MainActivity.this,SecondActivity.class);
		startActivity(intent);
		overridePendingTransition(R.anim.bottomin, R.anim.topout);
		finish();
		
	}



}