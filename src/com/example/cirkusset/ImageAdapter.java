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
	Context context; //Denna referens till Context fungerar genom att "pï¿½minna" programmet om vad som hï¿½nt. Typ. 
	private CardsOnPad onPad; //Referens till de kort som skall vara pï¿½ paddan, alltsï¿½ en referens till klassen CardsOnPad 
    public ImageAdapter(Context c, CardsOnPad onPad) { // Konstruktor som tar emot och "Startar" info om context och onPad
    	
    	Log.i("Cirkus","In Adapter "); //Mark Testar github 29/5
    	this.context = c; 
    	this.onPad = onPad; //Samma lista som i GridTestActivity.

    }

	@Override
	public int getCount() { //Metod fï¿½r att fï¿½ antalet kort
		
		// TODO Ange hur mï¿½nga grejor som skall snurras
		Log.i("Cirkus","Antal kort: "+ onPad.getCards().size());
		return onPad.getCards().size();
		
	}

	@Override
	public Object getItem(int position) { //Logga position fï¿½r ett kort
		
		Log.i("Cirkus","In getItem" + position);
		return 0;
		
	}

	@Override
	public long getItemId(int position) {
		
		Log.i("Cirkus","In getItemId");
		return 0;
		
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) { //Denna kï¿½rs fï¿½r varje ruta pï¿½ spelplanen
		
		Log.i("Cirkus","Position: "+position); //Logg
		ImageView imageView; //Vï¿½r imageview som anvï¿½nds fï¿½r att visa bilderna
        if (convertView == null) {  //if it's not recycled, initialize some attributes
            imageView = new ImageView(context); //Koppla vï¿½r context (pï¿½minnelse-grej) med imageviewen
            imageView.setLayoutParams(new GridView.LayoutParams(250, 173)); //Hï¿½r skapar vi det nya elementet med GridView
            imageView.setScaleType(ImageView.ScaleType.FIT_START);  //Centrera de bilder vi lï¿½gger in
            imageView.setPadding(5, 5, 5, 5); //Fluff
        } else {
            imageView = (ImageView) convertView; // Om inget har ï¿½ndrats ï¿½teranvï¿½nder vi gammal bild
        }
        
         Card ca = onPad.getCard(position); //Skapa en Card-klass referens (c) och ge den vï¿½ra kort frï¿½n CardsOnPad klassen
         if (ca != null){ //Om card objektet inte ï¿½r tomt sï¿½ kï¿½r fï¿½ljande:
        	 imageView.setImageResource(ca.getCardImage()); //Hï¿½R lï¿½gger vi in vï¿½ra kort i imageviewen
         }else{
        	
         }
         
         return imageView;

	}  
}
