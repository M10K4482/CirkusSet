/**Namn: CirkusSet
 * Skapare: Mark Wibom, Max Moberg, Annebell Larsson, Andrea Edström, 
 * Daniel Sofinet, Maja Mercedes Boström, Alexander Moe Ditlevsen 
 * Programm: IDK12
 * Kurs: Programmering för interaktionsdesign 3: Mobila appar*/

package com.example.Model;

import java.util.ArrayList;
import android.util.Log;
import com.example.CirkusSetApp.R;

public class RuleLogic {
	
	public RuleLogic() {
		
	}
	
	public boolean getRules(ArrayList<Card> pressedCards){
		
		/*Här jämförs de tre markerade korten (0,1,2) med varandra. 
		För varje if-sats jämförs en specefik grejj såsom färg, fyllnad, djur etc. */
		if(!((pressedCards.get(0).getCardColor() == pressedCards.get(1).getCardColor()) && 
			(pressedCards.get(1).getCardColor() == pressedCards.get(2).getCardColor()) || 
			(pressedCards.get(0).getCardColor() != pressedCards.get(1).getCardColor()) && 
			(pressedCards.get(1).getCardColor() != pressedCards.get(2).getCardColor()) && 
			(pressedCards.get(0).getCardColor() != pressedCards.get(2).getCardColor()))){
			Log.i("Rättar set", "Fel färg!");
			return false;
		}

		if(!((pressedCards.get(0).getCardAnimal() == pressedCards.get(1).getCardAnimal()) && 
			(pressedCards.get(1).getCardAnimal() == pressedCards.get(2).getCardAnimal()) || 
			(pressedCards.get(0).getCardAnimal() != pressedCards.get(1).getCardAnimal()) && 
			(pressedCards.get(1).getCardAnimal() != pressedCards.get(2).getCardAnimal()) && 
			(pressedCards.get(0).getCardAnimal() != pressedCards.get(2).getCardAnimal()))){
			Log.i("Rättar set", "Fel djur!");
			return false;
		}
			
		if(!((pressedCards.get(0).getCardFill() == pressedCards.get(1).getCardFill()) && 
			(pressedCards.get(1).getCardFill() == pressedCards.get(2).getCardFill()) || 
			(pressedCards.get(0).getCardFill() != pressedCards.get(1).getCardFill()) && 
			(pressedCards.get(1).getCardFill() != pressedCards.get(2).getCardFill()) && 
			(pressedCards.get(0).getCardFill() != pressedCards.get(2).getCardFill()))){
			Log.i("Rättar set", "Fel fyllnad!");
			return false;
		}
			
		if(!((pressedCards.get(0).getCardAmount() == pressedCards.get(1).getCardAmount()) && 
			(pressedCards.get(1).getCardAmount() == pressedCards.get(2).getCardAmount()) || 
			(pressedCards.get(0).getCardAmount() != pressedCards.get(1).getCardAmount()) && 
			(pressedCards.get(1).getCardAmount() != pressedCards.get(2).getCardAmount()) && 
			(pressedCards.get(0).getCardAmount() != pressedCards.get(2).getCardAmount()))){
			Log.i("Rättar set", "Fel antal!");
			return false;
		}
			
		Log.i("Rättar set", "Setet är rätt!");
		return true;
		
	}
}

