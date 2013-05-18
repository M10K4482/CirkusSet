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
	Context context; //Denna referens till Context fungerar genom att "påminna" programmet om vad som hänt. Typ. 
	private CardsOnPad onPad; //Referens till de kort som skall vara på paddan, alltså en referens till klassen CardsOnPad 
    public ImageAdapter(Context c, CardsOnPad onPad) { // Konstruktor som tar emot och "Startar" info om context och onPad
    	
    	Log.i("Cirkus","In Adapter ");
    	this.context = c; 
    	this.onPad = onPad; //Samma lista som i GridTestActivity.

    }

	@Override
	public int getCount() { //Metod för att få antalet kort
		
		// TODO Ange hur många grejor som skall snurras
		Log.i("Cirkus","Antal kort: "+ onPad.getCards().size());
		return onPad.getCards().size();
		
	}

	@Override
	public Object getItem(int position) { //Logga position för ett kort
		
		Log.i("Cirkus","In getItem" + position);
		return 0;
		
	}

	@Override
	public long getItemId(int position) {
		
		Log.i("Cirkus","In getItemId");
		return 0;
		
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) { //Denna körs för varje ruta på spelplanen
		
		Log.i("Cirkus","Position: "+position); //Logg
		ImageView imageView; //Vår imageview som används för att visa bilderna
        if (convertView == null) {  //if it's not recycled, initialize some attributes
            imageView = new ImageView(context); //Koppla vår context (påminnelse-grej) med imageviewen
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85)); //Här skapar vi det nya elementet med GridView
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);  //Centrera de bilder vi lägger in
            imageView.setPadding(2, 2, 2, 2); //Fluff
        } else {
            imageView = (ImageView) convertView; // Om inget har ändrats återanvänder vi gammal bild
        }
        
         Card ca = onPad.getCard(position); //Skapa en Card-klass referens (c) och ge den våra kort från CardsOnPad klassen
         if (ca != null){ //Om card objektet inte är tomt så kör följande:
        	 Log.i("Cirkus","ImageNbr: "+ca.getCardImage()); //Lite info om bildens namn
        	 imageView.setImageResource(ca.getCardImage()); //HÄR lägger vi in våra kort i imageviewen
         }else{ //Om card objektet är tomt
        	 Log.i("Cirkus","DummyImage: "+ R.drawable.empty); //Info om bilden som används för en tom ruta
        	 imageView.setImageResource(R.drawable.empty); //OM platsen är tom så lägg bilden "empty", som är utan något djur
         }
         
         return imageView;

	}
}
