package com.example.Model;

import com.example.experiment.R;
import java.util.ArrayList;

import android.util.Log;

//Class that handles a deck of cards
public class Deck {
	private ArrayList<Card> myDeck;
	public Deck() {
		//Skapa alla korten
		myDeck = new ArrayList<Card>();
		//Detta kommer bli en lite lång lista men så länge funkar det.
		//myDeck = new ArrayList<Card>();
		Card c = new Card(R.drawable.seal,R.drawable.seal_red,Card.CardFill.CLEAN); //Ett kort (alltså ett objekt av typen Card) skapas
		myDeck.add(c);
		myDeck.add(new Card(R.drawable.lion,R.drawable.lion_red,Card.CardFill.CLEAN));
		myDeck.add(new Card(R.drawable.ape,R.drawable.ape_red,Card.CardFill.CLEAN));
		myDeck.add(new Card(R.drawable.seal,R.drawable.seal_red,Card.CardFill.CLEAN));
		myDeck.add(new Card(R.drawable.lion,R.drawable.lion_red,Card.CardFill.CLEAN));
		myDeck.add(new Card(R.drawable.ape,R.drawable.ape_red,Card.CardFill.CLEAN));
		myDeck.add(new Card(R.drawable.seal,R.drawable.seal_red,Card.CardFill.CLEAN));
		myDeck.add(new Card(R.drawable.lion,R.drawable.lion_red,Card.CardFill.CLEAN));
		myDeck.add(new Card(R.drawable.ape,R.drawable.ape_red,Card.CardFill.CLEAN));
		//OSV för alla kort
	}
	
	public void shuffle(){ //Här kommer korten blandas så småningom
		//Shuffle the cards
	}
	
	public ArrayList<Card> getNbrOfCards(int nbr){
		//Här lägger man till och tar bort kort från brädet
		//Lägger först till kort
		ArrayList<Card> c = new ArrayList<Card>();
		c.add(myDeck.get(0));
		c.add(myDeck.get(1));
		c.add(myDeck.get(2));
		c.add(myDeck.get(3));
		c.add(myDeck.get(4));
	     /*c.add(myDeck.get(5));
		 c.add(myDeck.get(6));
		 c.add(myDeck.get(7));
		 c.add(myDeck.get(8));
		 */
		//Ta bort dem från ursprungliga
		myDeck.remove(0);
		myDeck.remove(1);
		myDeck.remove(2);
		myDeck.remove(3);
		myDeck.remove(4);
		/*myDeck.remove(5);
		  myDeck.remove(6);
		  myDeck.remove(7);
		  myDeck.remove(8);
		 */
		return c;
	}
	
	public ArrayList<Card> getArray(){
		
		return myDeck;
		
	}

	public void printInfo() {
		// TODO Auto-generated method stub
		Log.i("Mark","Info om deck");
		//osv
	}
	
	public String getInfo() {
		// TODO Auto-generated method stub
		return "A lot of info om leken alla kort etc etc";
	}
	
}
