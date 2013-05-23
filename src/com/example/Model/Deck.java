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
		//Detta kommer bli en lite l�ng lista men s� l�nge funkar det.
		//myDeck = new ArrayList<Card>();
		
		//LEJON GRÖN:
		Card c = new Card(R.drawable.greenlejonstreck1,R.drawable.green_stripes_lion1_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.ONE); //Ett kort (allts� ett objekt av typen Card) skapas
		myDeck.add(c);
		myDeck.add(new Card(R.drawable.greenlejonstreck2,R.drawable.green_stripes_lion2_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.greenlejonstreck3,R.drawable.green_stripes_lion3_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		myDeck.add(new Card(R.drawable.greenlejonkort1,R.drawable.green_filled_lion1_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.greenlejonkort2,R.drawable.green_filled_lion2_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.greenlejonkort3,R.drawable.green_filled_lion3_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		myDeck.add(new Card(R.drawable.greenlejonprickar1,R.drawable.green_dots_lion1_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.greenlejonprickar2,R.drawable.green_dots_lion2_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.greenlejonprickar3,R.drawable.green_dots_lion3_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		//LEJON BLÅ:
		myDeck.add(new Card(R.drawable.turkoslejonkort1,R.drawable.blue_filled_lion1_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.turkoslejonkort2,R.drawable.blue_filled_lion2_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.turkoslejonkort3,R.drawable.blue_filled_lion3_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.THREE));
		
		myDeck.add(new Card(R.drawable.turkoslejonprickar1,R.drawable.blue_dots_lion1_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.turkoslejonprickar2,R.drawable.blue_dots_lion2_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.turkoslejonprickar3,R.drawable.blue_dots_lion3_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.THREE));
		
		myDeck.add(new Card(R.drawable.turkoslejonstreck1,R.drawable.blue_stripes_lion1_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.turkoslejonstreck2,R.drawable.blue_stripes_lion2_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.turkoslejonstreck3,R.drawable.blue_stripes_lion3_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.THREE));
		
		//LEJON RÖD:
		myDeck.add(new Card(R.drawable.rosalejonkort1,R.drawable.pink_filled_lion1_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.RED,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.rosalejonkort2,R.drawable.pink_filled_lion2_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.RED,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.rosalejonkort3,R.drawable.pink_filled_lion3_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.RED,Card.CardAmount.THREE));
		
		myDeck.add(new Card(R.drawable.rosalejonprickar2,R.drawable.pink_dots_lion2_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.RED,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.rosalejonprickar3,R.drawable.pink_dots_lion3_click,Card. CardFill.DOTS, Card.CardAnimal.LION, Card.CardColor.RED, Card.CardAmount.THREE));
		myDeck.add(new Card(R.drawable.rosalejonprickar1,R.drawable.pink_dots_lion1_click, Card.CardFill.DOTS, Card.CardAnimal.LION, Card.CardColor.RED, Card.CardAmount.ONE));
		
		myDeck.add(new Card(R.drawable.rosalejonstreck2,R.drawable.pink_stripes_lion2_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.RED,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.rosalejonstreck3,R.drawable.pink_stripes_lion3_click,Card. CardFill.STRIPES, Card.CardAnimal.LION, Card.CardColor.RED, Card.CardAmount.THREE));
		myDeck.add(new Card(R.drawable.rosalejonstreck1,R.drawable.pink_stripes_lion1_click, Card.CardFill.STRIPES, Card.CardAnimal.LION, Card.CardColor.RED, Card.CardAmount.ONE));
		
		//SÄL BLÅ
		myDeck.add(new Card(R.drawable.turkossalkort1,R.drawable.blue_filled_seal1_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.turkossalkort2,R.drawable.blue_filled_seal2_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.turkossalkort3,R.drawable.blue_filled_seal3_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.THREE));
		
		myDeck.add(new Card(R.drawable.turkossalprickar1,R.drawable.blue_dots_seal1_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.turkossalprickar2,R.drawable.blue_dots_seal2_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.turkossalprickar3,R.drawable.blue_dots_seal3_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.THREE));
		
		myDeck.add(new Card(R.drawable.turkossalstreck1,R.drawable.blue_stripes_seal1_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.turkossalstreck2,R.drawable.blue_stripes_seal2_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.turkossalstreck3,R.drawable.blue_stripes_seal3_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.THREE));
		
		//SÄL RÖD:
		myDeck.add(new Card(R.drawable.pinkfill_oneseal,R.drawable.pink_filled_seal1_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.pinkfill_oneseal,R.drawable.pink_filled_seal2_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.pinkfill_oneseal,R.drawable.pink_filled_seal3_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.THREE));
		
		myDeck.add(new Card(R.drawable.pinktstripe_oneseal,R.drawable.pink_stripes_seal1,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.pinkstripe_twoseal,R.drawable.pink_stripes_seal2,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.rosasalstreck3,R.drawable.pink_stripes_seal3_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.THREE));
		
		myDeck.add(new Card(R.drawable.pinkdot_oneseal,R.drawable.pink_dots_seal1_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.pinkdot_twoseal,R.drawable.pink_dots_seal2_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.rosasalprickar3,R.drawable.pink_dots_seal3_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.THREE));
		
		//SÄL GRÖN:
		myDeck.add(new Card(R.drawable.greenfill_oneseal,R.drawable.green_filled_seal1_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.greenfill_twoseal,R.drawable.green_filled_seal2_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.greenfill_threeseal,R.drawable.green_filled_seal3_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		myDeck.add(new Card(R.drawable.greenstripe_oneseal,R.drawable.green_stripes_seal1_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.greenstripe_twoseal,R.drawable.green_stripes_seal2_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.greenstripe_threeseal,R.drawable.green_stripes_seal3_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		myDeck.add(new Card(R.drawable.greendot_oneseal,R.drawable.green_dots_seal1_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.greendot_twoseal,R.drawable.green_dots_seal2_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.greendot_threeseal,R.drawable.green_dots_seal3_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.THREE));		
		
		//APA RÖD:
		myDeck.add(new Card(R.drawable.rosaapaprickar1,R.drawable.pink_dots_monkey1_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.rosaapaprickar2,R.drawable.pink_dots_monkey2_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.rosaapaprickar3,R.drawable.pink_dots_monkey3_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.THREE));
		
		myDeck.add(new Card(R.drawable.rosaapakort1,R.drawable.pink_filled_monkey1_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.rosaapakort2,R.drawable.pink_filled_monkey2_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.rosaapakort3,R.drawable.pink_filled_monkey3_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.THREE));
		
		myDeck.add(new Card(R.drawable.rosaapastreck1,R.drawable.pink_stripes_monkey1_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.rosaapastreck2,R.drawable.pink_stripes_monkey2_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.rosaapastreck3,R.drawable.pink_stripes_monkey3_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.THREE));
		
		//APA BLÅ:
		myDeck.add(new Card(R.drawable.turkosapaprickar1,R.drawable.blue_dots_monkey1_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.turkosapaprickar2,R.drawable.blue_dots_monkey2_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.turkosapaprickar3,R.drawable.blue_dots_monkey3_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.THREE));
		
		myDeck.add(new Card(R.drawable.turkosapakort1,R.drawable.blue_filled_monkey1_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.turkosapakort2,R.drawable.blue_filled_monkey2_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.turkosapakort3,R.drawable.blue_filled_monkey3_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.THREE));
		
		myDeck.add(new Card(R.drawable.turkosapastreck1,R.drawable.blue_stripes_monkey1_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.turkosapastreck2,R.drawable.blue_stripes_monkey2_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.turkosapastreck3,R.drawable.blue_stripes_monkey3_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.THREE));	
		
		//APA GRÖN:
		myDeck.add(new Card(R.drawable.greenapaprickar1,R.drawable.green_dots_monkey1_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.greenapaprickar2,R.drawable.green_dots_monkey2_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.greenapaprickar3,R.drawable.green_dots_monkey3_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		myDeck.add(new Card(R.drawable.greenapakort1,R.drawable.green_filled_monkey1_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.greenapakort2,R.drawable.green_filled_monkey2_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.greenapakort3,R.drawable.green_filled_monkey3_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		myDeck.add(new Card(R.drawable.greenapastreck1,R.drawable.green_stripes_monkey1_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.ONE));
		myDeck.add(new Card(R.drawable.greenapastreck2,R.drawable.green_stripes_monkey2_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.TWO));
		myDeck.add(new Card(R.drawable.greenapastreck3,R.drawable.green_stripes_monkey3_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.THREE));	
		//OSV f�r alla kort
	}
	
	public void shuffle(){ //H�r kommer korten blandas s� sm�ningom
		//Shuffle the cards
	}
	
	public ArrayList<Card> getNbrOfCards(int nbr){
		//H�r l�gger man till och tar bort kort fr�n br�det
		//L�gger f�rst till kort
		ArrayList<Card> c = new ArrayList<Card>();
		c.add(myDeck.get(0));
		c.add(myDeck.get(1));
		c.add(myDeck.get(2));
		c.add(myDeck.get(3));
		c.add(myDeck.get(4));
	    c.add(myDeck.get(5));
		c.add(myDeck.get(6));
		c.add(myDeck.get(7));
		c.add(myDeck.get(8));
		 
		//Ta bort dem fr�n ursprungliga
		myDeck.remove(8);
		myDeck.remove(7);
		myDeck.remove(6);
		myDeck.remove(5);
		myDeck.remove(4);
		myDeck.remove(3);
		myDeck.remove(2);
		myDeck.remove(1);
		myDeck.remove(0);
		 
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
