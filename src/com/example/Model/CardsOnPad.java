package com.example.Model;

import java.util.ArrayList;


//I denna klassen skall allt som har med det som finns på plattan ligga
public class CardsOnPad {

	private static int NBR_OF_CARDS=9; //Antalet kort som ska finnas på brädet
	private Deck deck; //referens till kortleken
	private ArrayList<Card> onHand; //En array för alla korten som ska finnas på brädet
	
		public CardsOnPad() {
			
			deck = new Deck(); //Skapa kortlek
			onHand = deck.getNbrOfCards(NBR_OF_CARDS); //Hämta rätt antal kort
			
		}
		
		public ArrayList<Card> getCards(){ //Returnera arrayen 
			return onHand;
		}
		
		public Card getCard(int i){ //Returnera ett visst objekt (kort alltså)
			return onHand.get(i);
		}
}
