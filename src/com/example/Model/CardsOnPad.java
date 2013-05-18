package com.example.Model;

import java.util.ArrayList;


//I denna klassen skall allt som har med det som finns p� plattan ligga
public class CardsOnPad {

	private static int NBR_OF_CARDS=9; //Antalet kort som ska finnas p� br�det
	private Deck deck; //referens till kortleken
	private ArrayList<Card> onHand; //En array f�r alla korten som ska finnas p� br�det
	
		public CardsOnPad() {
			
			deck = new Deck(); //Skapa kortlek
			onHand = deck.getNbrOfCards(NBR_OF_CARDS); //H�mta r�tt antal kort
			
		}
		
		public ArrayList<Card> getCards(){ //Returnera arrayen 
			return onHand;
		}
		
		public Card getCard(int i){ //Returnera ett visst objekt (kort allts�)
			return onHand.get(i);
		}
}
