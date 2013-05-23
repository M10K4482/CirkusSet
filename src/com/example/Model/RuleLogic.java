package com.example.Model;

import java.util.ArrayList;

import android.util.Log;

import com.example.experiment.R; //För att slippa skriva 

import static com.example.Model.Card.CardAnimal.*; //Hänvisningar för Enums CardAnimal, CardFill, CardAmount, CardColor
import static com.example.Model.Card.CardFill.*;
import static com.example.Model.Card.CardAmount.*;
import static com.example.Model.Card.CardColor.*;



public class RuleLogic {
	
	private ArrayList<SetRules> mySets;
	private CardsOnPad onPad;
	boolean colorOne;
	boolean colorTwo;
	boolean colorThree;
	boolean animalOne;
	boolean animalTwo;
	boolean animalThree;
	boolean fillOne;
	boolean fillTwo;
	boolean fillThree;
	boolean amountOne;
	boolean amountTwo;
	boolean amountThree;
	
	public RuleLogic() {
		
		mySets = new ArrayList<SetRules>();
		SetRules l = new SetRules(SEAL, SEAL, SEAL, CLEAN, CLEAN, CLEAN, 
				ONE, TWO, THREE, BLUE, BLUE, BLUE); //RÄTT SET
		mySets.add(l);		
		
		mySets.add(new SetRules(SEAL, SEAL, SEAL, CLEAN, CLEAN, CLEAN, 
				ONE, TWO, THREE, GREEN, GREEN, GREEN));
				
		mySets.add(new SetRules(SEAL, SEAL, SEAL, CLEAN, CLEAN, CLEAN, 
				ONE, TWO, THREE, RED, RED, RED));
		
		mySets.add(new SetRules(SEAL, SEAL, SEAL, CLEAN, CLEAN, CLEAN, 
				ONE, TWO, THREE, BLUE, BLUE, BLUE));
		
		mySets.add(new SetRules(LION, LION, LION, DOTS, DOTS, DOTS, 
				ONE, TWO, THREE, RED, RED, RED));
		
		mySets.add(new SetRules(APE, LION, SEAL, STRIPES, DOTS, CLEAN,   //RÄTT SET
				ONE, ONE, ONE, RED, GREEN, BLUE));
		
		

		
		
		
		
	}
	
	public void getRules(ArrayList<Card> pressedCards){
		
		colorOne = false;
		colorTwo = false;
		colorThree = false;
		animalOne = false;
		animalTwo = false;
		animalThree = false;
		fillOne = false;
		fillTwo = false;
		fillThree = false;
		amountOne = false;
		amountTwo = false;
		amountThree = false;
		
		for(int a = 0; a < mySets.size(); a++){
			
			for(int i = 0; i < pressedCards.size(); i++){
				
				if(pressedCards.get(i).getCardColor() == mySets.get(a).getRuleColorOne()){
					colorOne = true;
				}
				if(pressedCards.get(i).getCardColor() == mySets.get(a).getRuleColorTwo()){
					colorTwo = true;
				}
				if(pressedCards.get(i).getCardColor() == mySets.get(a).getRuleColorThree()){
					colorThree = true;
				}
				if(pressedCards.get(i).getCardAnimal() == mySets.get(a).getRuleAnimalOne()){
					animalOne = true;
				}
				if(pressedCards.get(i).getCardAnimal() == mySets.get(a).getRuleAnimalTwo()){
					animalTwo = true;
				}
				if(pressedCards.get(i).getCardAnimal() == mySets.get(a).getRuleAnimalThree()){
					animalThree = true;
				}
				if(pressedCards.get(i).getCardFill() == mySets.get(a).getRuleFillOne()){
					fillOne = true;
				}
				if(pressedCards.get(i).getCardFill() == mySets.get(a).getRuleFillTwo()){
					fillTwo = true;
				}
				if(pressedCards.get(i).getCardFill() == mySets.get(a).getRuleFillThree()){
					fillThree = true;
				}
				if(pressedCards.get(i).getCardAmount() == mySets.get(a).getRuleAmountOne()){
					amountOne = true;
				}
				if(pressedCards.get(i).getCardAmount() == mySets.get(a).getRuleAmountTwo()){
					amountTwo = true;
				}
				if(pressedCards.get(i).getCardAmount() == mySets.get(a).getRuleAmountThree()){
					amountThree = true;
				}
				
			}
			
			if(colorOne && colorTwo && colorThree && animalOne && animalTwo && animalThree && amountOne && amountTwo && amountThree
					&& fillOne && fillTwo && fillThree){
				
				Log.i("BOOLEAN", "GRATTIS!");
				for(int r = 0; r < pressedCards.size(); r++){
					pressedCards.get(r).setTaken(true);
				}
				break;
				
			}
			
		}
		
	}
	
	public ArrayList<SetRules> getArray(){
		
		return mySets;
		
	}

}
