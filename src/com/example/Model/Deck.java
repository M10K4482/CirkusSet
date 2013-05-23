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
		Card c = new Card
		/*0*/(R.drawable.greenlejonstreck1,R.drawable.green_stripes_lion1_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.ONE); //Ett kort (allts� ett objekt av typen Card) skapas
		myDeck.add(c);
		/*1*/myDeck.add(new Card(R.drawable.greenlejonstreck2,R.drawable.green_stripes_lion2_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*2*/myDeck.add(new Card(R.drawable.greenlejonstreck3,R.drawable.green_stripes_lion3_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		/*3*/myDeck.add(new Card(R.drawable.greenlejonkort1,R.drawable.green_filled_lion1_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*4*/myDeck.add(new Card(R.drawable.greenlejonkort2,R.drawable.green_filled_lion2_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*5*/myDeck.add(new Card(R.drawable.greenlejonkort3,R.drawable.green_filled_lion3_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		/*6*/myDeck.add(new Card(R.drawable.greenlejonprickar1,R.drawable.green_dots_lion1_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*7*/myDeck.add(new Card(R.drawable.greenlejonprickar2,R.drawable.green_dots_lion2_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*8*/myDeck.add(new Card(R.drawable.greenlejonprickar3,R.drawable.green_dots_lion3_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		//LEJON BLÅ:
		/*9*/myDeck.add(new Card(R.drawable.turkoslejonkort1,R.drawable.blue_filled_lion1_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.ONE));
		/*10*/myDeck.add(new Card(R.drawable.turkoslejonkort2,R.drawable.blue_filled_lion2_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.TWO));
		/*11*/myDeck.add(new Card(R.drawable.turkoslejonkort3,R.drawable.blue_filled_lion3_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.THREE));
		
		/*12*/myDeck.add(new Card(R.drawable.turkoslejonprickar1,R.drawable.blue_dots_lion1_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.ONE));
		/*13*/myDeck.add(new Card(R.drawable.turkoslejonprickar2,R.drawable.blue_dots_lion2_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.TWO));
		/*14*/myDeck.add(new Card(R.drawable.turkoslejonprickar3,R.drawable.blue_dots_lion3_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.THREE));
		
		/*15*/myDeck.add(new Card(R.drawable.turkoslejonstreck1,R.drawable.blue_stripes_lion1_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.ONE));
		/*16*/myDeck.add(new Card(R.drawable.turkoslejonstreck2,R.drawable.blue_stripes_lion2_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.TWO));
		/*17*/myDeck.add(new Card(R.drawable.turkoslejonstreck3,R.drawable.blue_stripes_lion3_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.BLUE,Card.CardAmount.THREE));
		
		//LEJON RÖD:
		/*18*/myDeck.add(new Card(R.drawable.rosalejonkort1,R.drawable.pink_filled_lion1_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.RED,Card.CardAmount.ONE));
		/*19*/myDeck.add(new Card(R.drawable.rosalejonkort2,R.drawable.pink_filled_lion2_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.RED,Card.CardAmount.TWO));
		/*20*/myDeck.add(new Card(R.drawable.rosalejonkort3,R.drawable.pink_filled_lion3_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.RED,Card.CardAmount.THREE));
		
		/*21*/myDeck.add(new Card(R.drawable.rosalejonprickar2,R.drawable.pink_dots_lion2_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.RED,Card.CardAmount.TWO));
		/*22*/myDeck.add(new Card(R.drawable.rosalejonprickar3,R.drawable.pink_dots_lion3_click,Card. CardFill.DOTS, Card.CardAnimal.LION, Card.CardColor.RED, Card.CardAmount.THREE));
		/*23*/myDeck.add(new Card(R.drawable.rosalejonprickar1,R.drawable.pink_dots_lion1_click, Card.CardFill.DOTS, Card.CardAnimal.LION, Card.CardColor.RED, Card.CardAmount.ONE));
		
		/*24*/myDeck.add(new Card(R.drawable.rosalejonstreck2,R.drawable.pink_stripes_lion2_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.RED,Card.CardAmount.ONE));
		/*25*/myDeck.add(new Card(R.drawable.rosalejonstreck3,R.drawable.pink_stripes_lion3_click,Card. CardFill.STRIPES, Card.CardAnimal.LION, Card.CardColor.RED, Card.CardAmount.THREE));
		/*26*/myDeck.add(new Card(R.drawable.rosalejonstreck1,R.drawable.pink_stripes_lion1_click, Card.CardFill.STRIPES, Card.CardAnimal.LION, Card.CardColor.RED, Card.CardAmount.ONE));
		
		//SÄL BLÅ
		/*27*/myDeck.add(new Card(R.drawable.turkossalkort1,R.drawable.blue_filled_seal1_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.ONE));
		/*28*/myDeck.add(new Card(R.drawable.turkossalkort2,R.drawable.blue_filled_seal2_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.TWO));
		/*29*/myDeck.add(new Card(R.drawable.turkossalkort3,R.drawable.blue_filled_seal3_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.THREE));
		
		/*30*/myDeck.add(new Card(R.drawable.turkossalprickar1,R.drawable.blue_dots_seal1_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.ONE));
		/*31*/myDeck.add(new Card(R.drawable.turkossalprickar2,R.drawable.blue_dots_seal2_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.TWO));
		/*32*/myDeck.add(new Card(R.drawable.turkossalprickar3,R.drawable.blue_dots_seal3_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.THREE));
		
		/*33*/myDeck.add(new Card(R.drawable.turkossalstreck1,R.drawable.blue_stripes_seal1_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.ONE));
		/*34*/myDeck.add(new Card(R.drawable.turkossalstreck2,R.drawable.blue_stripes_seal2_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.TWO));
		/*35*/myDeck.add(new Card(R.drawable.turkossalstreck3,R.drawable.blue_stripes_seal3_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.BLUE,Card.CardAmount.THREE));
		
		//SÄL RÖD:
		/*36*/myDeck.add(new Card(R.drawable.rosasalkort1,R.drawable.pink_filled_seal1_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.ONE));
		/*37*/myDeck.add(new Card(R.drawable.rosasalkort2,R.drawable.pink_filled_seal2_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.TWO));
		/*38*/myDeck.add(new Card(R.drawable.rosasalkort3,R.drawable.pink_filled_seal3_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.THREE));
		
		/*39*/myDeck.add(new Card(R.drawable.pinktstripe_oneseal,R.drawable.pink_stripes_seal1,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.ONE));
		/*40*/myDeck.add(new Card(R.drawable.pinkstripe_twoseal,R.drawable.pink_stripes_seal2,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.TWO));
		/*41*/myDeck.add(new Card(R.drawable.rosasalstreck3,R.drawable.pink_stripes_seal3_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.THREE));
		
		/*42*/myDeck.add(new Card(R.drawable.pinkdot_oneseal,R.drawable.pink_dots_seal1_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.ONE));
		/*43*/myDeck.add(new Card(R.drawable.pinkdot_twoseal,R.drawable.pink_dots_seal2_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.TWO));
		/*44*/myDeck.add(new Card(R.drawable.rosasalprickar3,R.drawable.pink_dots_seal3_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.RED,Card.CardAmount.THREE));
		
		//SÄL GRÖN:
		/*45*/myDeck.add(new Card(R.drawable.greenfill_oneseal,R.drawable.green_filled_seal1_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*46*/myDeck.add(new Card(R.drawable.greenfill_twoseal,R.drawable.green_filled_seal2_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*47*/myDeck.add(new Card(R.drawable.greenfill_threeseal,R.drawable.green_filled_seal3_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		/*48*/myDeck.add(new Card(R.drawable.greenstripe_oneseal,R.drawable.green_stripes_seal1_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*49*/myDeck.add(new Card(R.drawable.greenstripe_twoseal,R.drawable.green_stripes_seal2_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*50*/myDeck.add(new Card(R.drawable.greenstripe_threeseal,R.drawable.green_stripes_seal3_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		/*51*/myDeck.add(new Card(R.drawable.greendot_oneseal,R.drawable.green_dots_seal1_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*52*/myDeck.add(new Card(R.drawable.greendot_twoseal,R.drawable.green_dots_seal2_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*53*/myDeck.add(new Card(R.drawable.greendot_threeseal,R.drawable.green_dots_seal3_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.THREE));		
		
		//APA RÖD:
		/*54*/myDeck.add(new Card(R.drawable.rosaapaprickar1,R.drawable.pink_dots_monkey1_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.ONE));
		/*55*/myDeck.add(new Card(R.drawable.rosaapaprickar2,R.drawable.pink_dots_monkey2_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.TWO));
		/*56*/myDeck.add(new Card(R.drawable.rosaapaprickar3,R.drawable.pink_dots_monkey3_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.THREE));
		
		/*57*/myDeck.add(new Card(R.drawable.pinkfill_onemonkey,R.drawable.pink_filled_monkey1_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.ONE));
		/*58*/myDeck.add(new Card(R.drawable.pinkfill_twomonkey,R.drawable.pink_filled_monkey2_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.TWO));
		/*59*/myDeck.add(new Card(R.drawable.pinkfill_threemonkey,R.drawable.pink_filled_monkey3_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.THREE));
		
		/*60*/myDeck.add(new Card(R.drawable.rosaapastreck1,R.drawable.pink_stripes_monkey1_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.ONE));
		/*61*/myDeck.add(new Card(R.drawable.rosaapastreck2,R.drawable.pink_stripes_monkey2_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.TWO));
		/*62*/myDeck.add(new Card(R.drawable.rosaapastreck3,R.drawable.pink_stripes_monkey3_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.RED,Card.CardAmount.THREE));
		
		//APA BLÅ:
		/*63*/myDeck.add(new Card(R.drawable.turkosapaprickar1,R.drawable.blue_dots_monkey1_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.ONE));
		/*64*/myDeck.add(new Card(R.drawable.turkosapaprickar2,R.drawable.blue_dots_monkey2_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.TWO));
		/*65*/myDeck.add(new Card(R.drawable.turkosapaprickar3,R.drawable.blue_dots_monkey3_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.THREE));
		
		/*66*/myDeck.add(new Card(R.drawable.turkosapakort1,R.drawable.blue_filled_monkey1_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.ONE));
		/*67*/myDeck.add(new Card(R.drawable.turkosapakort2,R.drawable.blue_filled_monkey2_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.TWO));
		/*68*/myDeck.add(new Card(R.drawable.turkosapakort3,R.drawable.blue_filled_monkey3_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.THREE));
		
		/*69*/myDeck.add(new Card(R.drawable.turkosapastreck1,R.drawable.blue_stripes_monkey1_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.ONE));
		/*70*/myDeck.add(new Card(R.drawable.turkosapastreck2,R.drawable.blue_stripes_monkey2_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.TWO));
		/*71*/myDeck.add(new Card(R.drawable.turkosapastreck3,R.drawable.blue_stripes_monkey3_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.BLUE,Card.CardAmount.THREE));	
		
		//APA GRÖN:
		/*72*/myDeck.add(new Card(R.drawable.greenapaprickar1,R.drawable.green_dots_monkey1_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*73*/myDeck.add(new Card(R.drawable.greenapaprickar2,R.drawable.green_dots_monkey2_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*74*/myDeck.add(new Card(R.drawable.greenapaprickar3,R.drawable.green_dots_monkey3_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		/*75*/myDeck.add(new Card(R.drawable.greenapakort1,R.drawable.green_filled_monkey1_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*76*/myDeck.add(new Card(R.drawable.greenapakort2,R.drawable.green_filled_monkey2_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*77*/myDeck.add(new Card(R.drawable.greenapakort3,R.drawable.green_filled_monkey3_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		/*78*/myDeck.add(new Card(R.drawable.greenapastreck1,R.drawable.green_stripes_monkey1_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*79*/myDeck.add(new Card(R.drawable.greenapastreck2,R.drawable.green_stripes_monkey2_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*80*/myDeck.add(new Card(R.drawable.greenapastreck3,R.drawable.green_stripes_monkey3_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.THREE));	
		
		//OSV f�r alla kort
	}
	
	public void shuffle(){ //H�r kommer korten blandas s� sm�ningom
		//Shuffle the cards
	}
	
	public ArrayList<Card> getNbrOfCards(int nbr){
		//H�r l�gger man till och tar bort kort fr�n br�det
		//L�gger f�rst till kort
		ArrayList<Card> c = new ArrayList<Card>();
		c.add(myDeck.get(4));
		c.add(myDeck.get(19));
		c.add(myDeck.get(31));
		c.add(myDeck.get(58));
		c.add(myDeck.get(35));
	    c.add(myDeck.get(6));
		c.add(myDeck.get(9));
		c.add(myDeck.get(60));
		c.add(myDeck.get(27));
		 
		//Ta bort dem fr�n ursprungliga
		myDeck.remove(27);
		myDeck.remove(60);
		myDeck.remove(9);
		myDeck.remove(6);
		myDeck.remove(35);
		myDeck.remove(58);
		myDeck.remove(31);
		myDeck.remove(19);
		myDeck.remove(4);
		 
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
