package com.example.cirkusset;

import com.example.Model.Card;
import com.example.Model.CardsOnPad;
import com.example.Model.Deck;
import com.example.Model.PointCounter;
import com.example.Model.RuleLogic;
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
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private GridView gr; //Skapa en referens (gridview)
	private ImageAdapter im; //Skapa en referens (im) s� att man kan komma �t ImageAdapter klassen
	private CardsOnPad onPad; //Referens till de kort som skall vara p� paddan 
	private RuleLogic logic;
	private int counter;
	private static int PRESSED_LIMIT = 3;
	private boolean setCards;
	private Deck aDeck;
	private Button shuffleButton;
	private PointCounter pointCounter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid_test); //S�tt layouten som content f�r appen
		
		onPad = new CardsOnPad(); //K�r ig�ng CardsOnPad klassen genom att anropa konstruktorn (CardsOnPad()) med referensen onPad
		gr = (GridView) findViewById(R.id.gridviewTest); //Koppla gridview till layouten 
		im = new ImageAdapter(this,onPad); //Skicka CardsOnPad referensen onPad till ImageAdapters konstruktor
		logic = new RuleLogic();
		
		gr.setAdapter(im); //Skapa adapter skicka in v�ra kort 
		gr.setOnItemClickListener(new OnItemClickListener() { //Kolla efter "Klick" med OnItemClickListener() och koppla till gridviewen
			
		public void onItemClick(AdapterView<?> parent, View v, int position, long id) { //Denna k�r ig�ng n�r man klickat n�got och anv�nder sig av en adaptor
			counter = 0;
			Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show(); //En toast med info om position
			Card ca = onPad.getCard(position); //H�mta kortet som klickats via dess position p� br�det
			ca.pressCard(); //Tryck in kortet och byt dess bild
			
			for(int i = 0; i < onPad.getCards().size(); i++){
				
				if(onPad.getCard(i).isPressed()==true){
					
					counter = counter + 1;
					
					if(counter == PRESSED_LIMIT){
						
						setCards = logic.getRules(onPad.getPressedCards());
						
						if(setCards == true){
							//pointCounter.Counter(setCards);
							onPad.getNewHand();
							
						}
						
						for(int a = 0; a < onPad.getCards().size(); a++){
							if(onPad.getCard(a).isPressed()==true){
								
								onPad.getCard(a).pressCard();
								
							}
						}
						
						im.notifyDataSetChanged();
						
					}
					
				}
				
			}
			
			im.notifyDataSetChanged();//Efter att ett kort klickas ska spelplanen ritas om f�r att visa dennna f�r�ndring
			
			}
		});
		
	}
}
