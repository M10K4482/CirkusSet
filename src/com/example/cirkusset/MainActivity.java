package com.example.cirkusset;

import com.example.Model.Card;
import com.example.Model.CardsOnPad;
import com.example.cirkusset.ImageAdapter;
import com.example.cirkusset.MainActivity;
import com.example.experiment.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private GridView gr; //Skapa en referens (gridview)
	private ImageAdapter im; //Skapa en referens (im) s� att man kan komma �t ImageAdapter klassen
	private CardsOnPad onPad; //Referens till de kort som skall vara p� paddan 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid_test); //S�tt layouten som content f�r appen
		onPad = new CardsOnPad(); //K�r ig�ng CardsOnPad klassen genom att anropa konstruktorn (CardsOnPad()) med referensen onPad
		gr = (GridView) findViewById(R.id.gridviewTest); //Koppla gridview till layouten 
		im = new ImageAdapter(this,onPad); //Skicka CardsOnPad referensen onPad till ImageAdapters konstruktor
		gr.setAdapter(im); //Skapa adapter skicka in v�ra kort 
		gr.setOnItemClickListener(new OnItemClickListener() { //Kolla efter "Klick" med OnItemClickListener() och koppla till gridviewen
			
		public void onItemClick(AdapterView<?> parent, View v, int position, long id) { //Denna k�r ig�ng n�r man klickat n�got och anv�nder sig av en adaptor
			Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show(); //En toast med info om position
			Card ca = onPad.getCard(position); //H�mta kortet som klickats via dess position p� br�det
			ca.pressCard(); //Tryck in kortet och byt dess bild
			Log.i("Cirkus","Image: "+ ca.getCardImage()); //
			im.notifyDataSetChanged();//Efter att ett kort klickas ska spelplanen ritas om f�r att visa dennna f�r�ndring
			}
		});
		
	}
}
