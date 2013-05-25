package com.example.Model;

import java.util.ArrayList;

import android.util.Log;

import com.example.experiment.R;

public class RuleLogic {
	
	public RuleLogic() {
		
	}
	
	public boolean getRules(ArrayList<Card> pressedCards){
		
		/*H�r j�mf�rs de tre markerade korten (0,1,2) med varandra. 
		F�r varje if-sats j�mf�rs en specefik grejj s�som f�rg, fyllnad, djur etc. */
		if(!((pressedCards.get(0).getCardColor() == pressedCards.get(1).getCardColor()) && 
			(pressedCards.get(1).getCardColor() == pressedCards.get(2).getCardColor()) || 
			(pressedCards.get(0).getCardColor() != pressedCards.get(1).getCardColor()) && 
			(pressedCards.get(1).getCardColor() != pressedCards.get(2).getCardColor()) && 
			(pressedCards.get(0).getCardColor() != pressedCards.get(2).getCardColor()))){
			Log.i("R�ttar set", "Fel f�rg!");
			return false;
		}

		if(!((pressedCards.get(0).getCardAnimal() == pressedCards.get(1).getCardAnimal()) && 
			(pressedCards.get(1).getCardAnimal() == pressedCards.get(2).getCardAnimal()) || 
			(pressedCards.get(0).getCardAnimal() != pressedCards.get(1).getCardAnimal()) && 
			(pressedCards.get(1).getCardAnimal() != pressedCards.get(2).getCardAnimal()) && 
			(pressedCards.get(0).getCardAnimal() != pressedCards.get(2).getCardAnimal()))){
			Log.i("R�ttar set", "Fel djur!");
			return false;
		}
			
		if(!((pressedCards.get(0).getCardFill() == pressedCards.get(1).getCardFill()) && 
			(pressedCards.get(1).getCardFill() == pressedCards.get(2).getCardFill()) || 
			(pressedCards.get(0).getCardFill() != pressedCards.get(1).getCardFill()) && 
			(pressedCards.get(1).getCardFill() != pressedCards.get(2).getCardFill()) && 
			(pressedCards.get(0).getCardFill() != pressedCards.get(2).getCardFill()))){
			Log.i("R�ttar set", "Fel fyllnad!");
			return false;
		}
			
		if(!((pressedCards.get(0).getCardAmount() == pressedCards.get(1).getCardAmount()) && 
			(pressedCards.get(1).getCardAmount() == pressedCards.get(2).getCardAmount()) || 
			(pressedCards.get(0).getCardAmount() != pressedCards.get(1).getCardAmount()) && 
			(pressedCards.get(1).getCardAmount() != pressedCards.get(2).getCardAmount()) && 
			(pressedCards.get(0).getCardAmount() != pressedCards.get(2).getCardAmount()))){
			Log.i("R�ttar set", "Fel antal!");
			return false;
		}
			
		Log.i("R�ttar set", "Setet �r r�tt!");
		return true;
		
	}

}

