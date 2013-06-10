/**Namn: CirkusSet
 * Skapare: Mark Wibom, Max Moberg, Annebell Larsson, Andrea Edström, 
 * Daniel Sofinet, Maja Mercedes Boström, Alexander Moe Ditlevsen 
 * Programm: IDK12
 * Kurs: Programmering för interaktionsdesign 3: Mobila appar*/

package com.example.cirkusset;

import java.util.ArrayList;

import com.example.Model.Card;
import com.example.Model.CardsOnPad;
import com.example.Model.Deck;
import com.example.CirkusSetApp.R;

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
	
	Context context; 
	private CardsOnPad onPad; 
	
	/**En konstruktor för att initialisera bland annat vår context och vår referens till CardsOnPad*/
    public ImageAdapter(Context c, CardsOnPad onPad) { 
    	
    	/**Ge våra variabler värden*/
    	this.context = c; 
    	this.onPad = onPad; 

    }

    /**Tre nödvändiga metoder för en imageAdapter klass, dessa tre skickar tillbaks lite data klassen använder sig av*/   
	@Override
	public int getCount() { 
		
		Log.i("Cirkus","Antal kort: "+ onPad.getCards().size());
		return onPad.getCards().size();
		
	}

	@Override
	public Object getItem(int position) { 
		
		Log.i("Cirkus","In getItem" + position);
		return 0;
		
	}

	@Override
	public long getItemId(int position) {	
		
		Log.i("Cirkus","In getItemId");
		return 0;		
		
	}

	/**En view metod för att rita ut brädet*/
	@Override
	public View getView(int position, View convertView, ViewGroup parent) { 
		
		ImageView imageView; 
        if (convertView == null) {  
            imageView = new ImageView(context); 
            imageView.setLayoutParams(new GridView.LayoutParams(250, 173)); 
            imageView.setScaleType(ImageView.ScaleType.FIT_START);  
            imageView.setPadding(5, 5, 5, 5);
        } else {
            imageView = (ImageView) convertView; 
        }
        
        /**Kalla på de kort som ska ritas ut på brädet via onPad och rita ut dem i imageViewen*/
        Card ca = onPad.getCard(position); 
        imageView.setImageResource(ca.getCardImage()); 
         
        return imageView;

	}  
}
