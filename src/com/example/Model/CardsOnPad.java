package com.example.Model;

import java.util.ArrayList;

import android.util.Log;

//I denna klassen skall allt som har med det som finns på plattan ligga
public class CardsOnPad {

	private static int NBR_OF_CARDS = 9; //Antalet kort som ska finnas på brädet
	private static int THREE_CARDS = 3;
	private Deck deck; //referens till kortleken
	private ArrayList<Card> onHand; //En array för alla korten som ska finnas på brädet
	private ArrayList<Card> pressedCards;
	
	public CardsOnPad() {			
		deck = new Deck(); //Skapa kortlek
		onHand = deck.getNbrOfCards(NBR_OF_CARDS); //Hämta rätt antal kort
	}
		
	public ArrayList<Card> getCards(){ //Returnera arrayen 
		return onHand;
	}
		
	public ArrayList<Card> getPressedCards(){ //Returnera arrayen 		
		pressedCards = new ArrayList<Card>();	
		for(int i = 0; i < onHand.size(); i++){		
			if(onHand.get(i).isPressed() == true){			
				pressedCards.add(onHand.get(i));			
			}		
		}	
		return pressedCards;	
	}
		
	public Card getCard(int i){ //Returnera ett visst objekt (kort alltså)
			return onHand.get(i);
	}
	
	public void getNewHand(){ //Returnera ett visst objekt (kort alltså)
		deck.shuffle();
		onHand = deck.getNbrOfCards(NBR_OF_CARDS);
	}
	
	public void getThreeCards(){ //Returnera ett visst objekt (kort alltså)
		deck.shuffle();
		onHand = deck.getThreeNewCards(pressedCards);
	}
	
}

