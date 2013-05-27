package com.example.cirkusset;

import java.util.ArrayList;

import com.example.Model.Card;
import com.example.Model.CardsOnPad;
import com.example.Model.Deck;
import com.example.experiment.R;
//import com.example.gridtest.R;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class ImageAdapter extends BaseAdapter {
	Context context; //Denna referens till Context fungerar genom att "p�minna" programmet om vad som h�nt. Typ. 
	private CardsOnPad onPad; //Referens till de kort som skall vara p� paddan, allts� en referens till klassen CardsOnPad 
    public ImageAdapter(Context c, CardsOnPad onPad) { // Konstruktor som tar emot och "Startar" info om context och onPad
    	
    	Log.i("Cirkus","In Adapter ");
    	this.context = c; 
    	this.onPad = onPad; //Samma lista som i GridTestActivity.

    }

	@Override
	public int getCount() { //Metod f�r att f� antalet kort
		
		// TODO Ange hur m�nga grejor som skall snurras
		Log.i("Cirkus","Antal kort: "+ onPad.getCards().size());
		return onPad.getCards().size();
		
	}

	@Override
	public Object getItem(int position) { //Logga position f�r ett kort
		
		Log.i("Cirkus","In getItem" + position);
		return 0;
		
	}

	@Override
	public long getItemId(int position) {
		
		Log.i("Cirkus","In getItemId");
		return 0;
		
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) { //Denna k�rs f�r varje ruta p� spelplanen
		
		Log.i("Cirkus","Position: "+position); //Logg
		ImageView imageView; //V�r imageview som anv�nds f�r att visa bilderna
        if (convertView == null) {  //if it's not recycled, initialize some attributes
            imageView = new ImageView(context); //Koppla v�r context (p�minnelse-grej) med imageviewen
            imageView.setLayoutParams(new GridView.LayoutParams(230, 230)); //H�r skapar vi det nya elementet med GridView
            imageView.setScaleType(ImageView.ScaleType.FIT_START);  //Centrera de bilder vi l�gger in
            imageView.setPadding(2, 2, 2, 2); //Fluff
        } else {
            imageView = (ImageView) convertView; // Om inget har �ndrats �teranv�nder vi gammal bild
        }
        
         Card ca = onPad.getCard(position); //Skapa en Card-klass referens (c) och ge den v�ra kort fr�n CardsOnPad klassen
         if (ca != null){ //Om card objektet inte �r tomt s� k�r f�ljande:
        	 imageView.setImageResource(ca.getCardImage()); //H�R l�gger vi in v�ra kort i imageviewen
         }else{
        	
         }
         
         return imageView;

	}  
}
