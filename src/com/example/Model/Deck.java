/**Namn: CirkusSet
 * Skapare: Mark Wibom, Max Moberg, Annebell Larsson, Andrea Edström, 
 * Daniel Sofinet, Maja Mercedes Boström, Alexander Moe Ditlevsen 
 * Programm: IDK12
 * Kurs: Programmering för interaktionsdesign 3: Mobila appar*/

package com.example.Model;

import com.example.CirkusSetApp.R;
import java.util.ArrayList;
import java.util.Collections;
import android.util.Log;

/**Klass där korten skapas och hanteras*/
public class Deck {
	
	private ArrayList<Card> myDeck;
	ArrayList<Card> returnDeck;
	
	/**Konstruktor där alla korten och deras attribut läggs in, en efter en*/
	public Deck() {
		
		returnDeck = new ArrayList<Card>();
		myDeck = new ArrayList<Card>();	
		//Skapa alla korten
		
		//FIRST DECK-CARDS:
		/*1*/Card c = new Card(R.drawable.green_lion_clean_2,R.drawable.green_lion_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.TWO);
		myDeck.add(c);
		/*2*/myDeck.add(new Card(R.drawable.pink_lion_clean_2,R.drawable.pink_lion_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*3*/myDeck.add(new Card(R.drawable.turquois_seal_dots_2,R.drawable.turquois_seal_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		/*4*/myDeck.add(new Card(R.drawable.pink_ape_clean_2,R.drawable.pink_ape_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*5*/myDeck.add(new Card(R.drawable.turquois_seal_stripes_3,R.drawable.turquois_seal_stripes_3_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));
		/*6*/myDeck.add(new Card(R.drawable.green_lion_dots_1,R.drawable.green_lion_dots_1_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*7*/myDeck.add(new Card(R.drawable.turquois_lion_clean_1,R.drawable.turquois_lion_clean_1_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
		/*8*/myDeck.add(new Card(R.drawable.pink_ape_stripes_1,R.drawable.pink_ape_stripes_1_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.ONE));
		/*9*/myDeck.add(new Card(R.drawable.turquois_seal_clean_1,R.drawable.turquois_seal_clean_1_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
		
		//LION GREEN:
		/*10*/myDeck.add(new Card(R.drawable.green_lion_stripes_1,R.drawable.green_lion_stripes_1_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*11*/myDeck.add(new Card(R.drawable.green_lion_stripes_2,R.drawable.green_lion_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*12*/myDeck.add(new Card(R.drawable.green_lion_stripes_3,R.drawable.green_lion_stripes_3_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		/*13*/myDeck.add(new Card(R.drawable.green_lion_clean_1,R.drawable.green_lion_clean_1_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*14*/myDeck.add(new Card(R.drawable.green_lion_clean_3,R.drawable.green_lion_clean_3_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		/*15*/myDeck.add(new Card(R.drawable.green_lion_dots_2,R.drawable.green_lion_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*16*/myDeck.add(new Card(R.drawable.green_lion_dots_3,R.drawable.green_lion_dots_3_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		//LION TURQUOIS:
		/*17*/myDeck.add(new Card(R.drawable.turquois_lion_clean_2,R.drawable.turquois_lion_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		/*18*/myDeck.add(new Card(R.drawable.turquois_lion_clean_3,R.drawable.turquois_lion_clean_3_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));
		
		/*19*/myDeck.add(new Card(R.drawable.turquois_lion_dots_1,R.drawable.turquois_lion_dots_1_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
		/*20*/myDeck.add(new Card(R.drawable.turquois_lion_dots_2,R.drawable.turquois_lion_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		/*21*/myDeck.add(new Card(R.drawable.turquois_lion_dots_3,R.drawable.turquois_lion_dots_3_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));
		
		/*22*/myDeck.add(new Card(R.drawable.turquois_lion_stripes_1,R.drawable.turquois_lion_stripes_1_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
		/*23*/myDeck.add(new Card(R.drawable.turquois_lion_stripes_2,R.drawable.turquois_lion_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		/*24*/myDeck.add(new Card(R.drawable.turquois_lion_stripes_3,R.drawable.turquois_lion_stripes_3_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));
		
		//LION RED:
		/*25*/myDeck.add(new Card(R.drawable.pink_lion_clean_1,R.drawable.pink_lion_clean_1_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.PINK,Card.CardAmount.ONE));
		/*26*/myDeck.add(new Card(R.drawable.pink_lion_clean_3,R.drawable.pink_lion_clean_3_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.PINK,Card.CardAmount.THREE));
		
		/*27*/myDeck.add(new Card(R.drawable.pink_lion_dots_1,R.drawable.pink_lion_dots_1_click, Card.CardFill.DOTS, Card.CardAnimal.LION, Card.CardColor.PINK, Card.CardAmount.ONE));
		/*28*/myDeck.add(new Card(R.drawable.pink_lion_dots_2,R.drawable.pink_lion_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*29*/myDeck.add(new Card(R.drawable.pink_lion_dots_3,R.drawable.pink_lion_dots_3_click,Card. CardFill.DOTS, Card.CardAnimal.LION, Card.CardColor.PINK, Card.CardAmount.THREE));
		
		/*30*/myDeck.add(new Card(R.drawable.pink_lion_stripes_1,R.drawable.pink_lion_stripes_1_click, Card.CardFill.STRIPES, Card.CardAnimal.LION, Card.CardColor.PINK, Card.CardAmount.ONE));
		/*31*/myDeck.add(new Card(R.drawable.pink_lion_stripes_2,R.drawable.pink_lion_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*32*/myDeck.add(new Card(R.drawable.pink_lion_stripes_3,R.drawable.pink_lion_stripes_3_click,Card. CardFill.STRIPES, Card.CardAnimal.LION, Card.CardColor.PINK, Card.CardAmount.THREE));
		
		//SEAL TURQUOIS
		/*33*/myDeck.add(new Card(R.drawable.turquois_seal_clean_2,R.drawable.turquois_seal_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		/*34*/myDeck.add(new Card(R.drawable.turquois_seal_clean_3,R.drawable.turquois_seal_clean_3_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));
		
		/*35*/myDeck.add(new Card(R.drawable.turquois_seal_dots_1,R.drawable.turquois_seal_dots_1_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
		/*37*/myDeck.add(new Card(R.drawable.turquois_seal_dots_3,R.drawable.turquois_seal_dots_3_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));
		
		/*38*/myDeck.add(new Card(R.drawable.turquois_seal_stripes_1,R.drawable.turquois_seal_stripes_1_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
		/*39*/myDeck.add(new Card(R.drawable.turquois_seal_stripes_2,R.drawable.turquois_seal_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		
		//SEAL RED:
		/*40*/myDeck.add(new Card(R.drawable.pink_seal_clean_1,R.drawable.pink_seal_clean_1_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.ONE));
		/*41*/myDeck.add(new Card(R.drawable.pink_seal_clean_2,R.drawable.pink_seal_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*42*/myDeck.add(new Card(R.drawable.pink_seal_clean_3,R.drawable.pink_seal_clean_3_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.THREE));
		
		/*43*/myDeck.add(new Card(R.drawable.pink_seal_stripes_1,R.drawable.pink_seal_stripes_1_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.ONE));
		/*44*/myDeck.add(new Card(R.drawable.pink_seal_stripes_2,R.drawable.pink_seal_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*45*/myDeck.add(new Card(R.drawable.pink_seal_stripes_3,R.drawable.pink_seal_stripes_3_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.THREE));
		
		/*46*/myDeck.add(new Card(R.drawable.pink_seal_dots_1,R.drawable.pink_seal_dots_1_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.ONE));
		/*47*/myDeck.add(new Card(R.drawable.pink_seal_dots_2,R.drawable.pink_seal_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*48*/myDeck.add(new Card(R.drawable.pink_seal_dots_3,R.drawable.pink_seal_dots_3_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.THREE));
		
		//SEAL GREEN:
		/*49*/myDeck.add(new Card(R.drawable.green_seal_clean_1,R.drawable.green_seal_clean_1_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*50*/myDeck.add(new Card(R.drawable.green_seal_clean_2,R.drawable.green_seal_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*51*/myDeck.add(new Card(R.drawable.green_seal_clean_3,R.drawable.green_seal_clean_3_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		/*52*/myDeck.add(new Card(R.drawable.green_seal_stripes_1,R.drawable.green_seal_stripes_1_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*53*/myDeck.add(new Card(R.drawable.green_seal_stripes_2,R.drawable.green_seal_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*54*/myDeck.add(new Card(R.drawable.green_seal_stripes_3,R.drawable.green_seal_stripes_3_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		/*55*/myDeck.add(new Card(R.drawable.green_seal_dots_1,R.drawable.green_seal_dots_1_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*56*/myDeck.add(new Card(R.drawable.green_seal_dots_2,R.drawable.green_seal_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*57*/myDeck.add(new Card(R.drawable.green_seal_dots_3,R.drawable.green_seal_dots_3_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.THREE));		
		
		//APE RED:
		/*58*/myDeck.add(new Card(R.drawable.pink_ape_dots_1,R.drawable.pink_ape_dots_1_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.ONE));
		/*59*/myDeck.add(new Card(R.drawable.pink_ape_dots_2,R.drawable.pink_ape_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*60*/myDeck.add(new Card(R.drawable.pink_ape_dots_3,R.drawable.pink_ape_dots_3_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.THREE));
		
		/*61*/myDeck.add(new Card(R.drawable.pink_ape_clean_1,R.drawable.pink_ape_clean_1_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.ONE));
		/*62*/myDeck.add(new Card(R.drawable.pink_ape_clean_3,R.drawable.pink_ape_clean_3_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.THREE));
		
		/*63*/myDeck.add(new Card(R.drawable.pink_ape_stripes_2,R.drawable.pink_ape_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*64*/myDeck.add(new Card(R.drawable.pink_ape_stripes_3,R.drawable.pink_ape_stripes_3_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.THREE));
		
		//APE TURQUOIS:
		/*65*/myDeck.add(new Card(R.drawable.turquois_ape_dots_1,R.drawable.turquois_ape_dots_1_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
		/*66*/myDeck.add(new Card(R.drawable.turquois_ape_dots_2,R.drawable.turquois_ape_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		/*67*/myDeck.add(new Card(R.drawable.turquois_ape_dots_3,R.drawable.turquois_ape_dots_3_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));
		
		/*68*/myDeck.add(new Card(R.drawable.turquois_ape_clean_1,R.drawable.turquois_ape_clean_1_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
		/*69*/myDeck.add(new Card(R.drawable.turquois_ape_clean_2,R.drawable.turquois_ape_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		/*70*/myDeck.add(new Card(R.drawable.turquois_ape_clean_3,R.drawable.turquois_ape_clean_3_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));
		
		/*71*/myDeck.add(new Card(R.drawable.turquois_ape_stripes_1,R.drawable.turquois_ape_stripes_1_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
		/*72*/myDeck.add(new Card(R.drawable.turquois_ape_stripes_2,R.drawable.turquois_ape_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		/*73*/myDeck.add(new Card(R.drawable.turquois_ape_stripes_3,R.drawable.turquois_ape_stripes_3_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));	
		
		//APE GREEN:
		/*74*/myDeck.add(new Card(R.drawable.green_ape_dots_1,R.drawable.green_ape_dots_1_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*75*/myDeck.add(new Card(R.drawable.green_ape_dots_2,R.drawable.green_ape_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*76*/myDeck.add(new Card(R.drawable.green_ape_dots_3,R.drawable.green_ape_dots_3_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		/*77*/myDeck.add(new Card(R.drawable.green_ape_clean_1,R.drawable.green_ape_clean_1_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*78*/myDeck.add(new Card(R.drawable.green_ape_clean_2,R.drawable.green_ape_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*79*/myDeck.add(new Card(R.drawable.green_ape_clean_3,R.drawable.green_ape_clean_3_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.THREE));
		
		/*80*/myDeck.add(new Card(R.drawable.green_ape_stripes_1,R.drawable.green_ape_stripes_1_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*81*/myDeck.add(new Card(R.drawable.green_ape_stripes_2,R.drawable.green_ape_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*82*/myDeck.add(new Card(R.drawable.green_ape_stripes_3,R.drawable.green_ape_stripes_3_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.THREE));	

	}
	
	/**Metod där korten blandas*/
	public void shuffle(){ 
		
		Collections.shuffle(myDeck);
		
	}
	
	/**Metod där kort läggs till i returnDeck och tas bort ur myDeck för att kunna returneras ochvisas i gridViewen*/
	public ArrayList<Card> getNbrOfCards(int nbr){
		
		if(myDeck.size() <= 8){	
			reloadDeck();	
		}
		
		returnDeck.removeAll(returnDeck);		
		
		for(int insert = 0; insert < nbr; insert++){
			returnDeck.add(myDeck.get(insert));
		}
		
		for(int firstArray = 0; firstArray < nbr; firstArray++){
			for(int secondArray = 0; secondArray < myDeck.size(); secondArray++){
				if(myDeck.get(secondArray).equals(returnDeck.get(firstArray))){
					myDeck.remove(secondArray);	
				}
			}
		}
		
		return returnDeck;
		
	}
	
	/**Metod där tre nya kort läggs till i returnDeck, tas bort ur myDeck och sedan returneras*/
	public ArrayList<Card> getThreeNewCards(ArrayList<Card> pressedCards){
		
		if(myDeck.size() <= 3){	
			reloadDeck();	
		}
		
		for(int pressed = 0; pressed < pressedCards.size(); pressed++){
			for(int exchange = 0; exchange < returnDeck.size(); exchange++){
				if(returnDeck.get(exchange).equals(pressedCards.get(pressed))){
				
					returnDeck.remove(exchange);
					returnDeck.add(exchange, myDeck.get(0));
					myDeck.remove(0);
					
				}
			}
		}
		
		return returnDeck;
		
	}
	
	/**Metod där alla korten åter igen laddas in i myDeck arrayen för att undvika nullpointer*/
	public void reloadDeck(){		
		
		//FIRST DECK-CARDS:
		/*1*/Card c = new Card(R.drawable.green_lion_clean_2,R.drawable.green_lion_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.TWO);
		myDeck.add(c);
		/*2*/myDeck.add(new Card(R.drawable.pink_lion_clean_2,R.drawable.pink_lion_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*3*/myDeck.add(new Card(R.drawable.turquois_seal_dots_2,R.drawable.turquois_seal_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		/*4*/myDeck.add(new Card(R.drawable.pink_ape_clean_2,R.drawable.pink_ape_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*5*/myDeck.add(new Card(R.drawable.turquois_seal_stripes_3,R.drawable.turquois_seal_stripes_3_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));
		/*6*/myDeck.add(new Card(R.drawable.green_lion_dots_1,R.drawable.green_lion_dots_1_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*7*/myDeck.add(new Card(R.drawable.turquois_lion_clean_1,R.drawable.turquois_lion_clean_1_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
		/*8*/myDeck.add(new Card(R.drawable.pink_ape_stripes_1,R.drawable.pink_ape_stripes_1_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.ONE));
		/*9*/myDeck.add(new Card(R.drawable.turquois_seal_clean_1,R.drawable.turquois_seal_clean_1_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
				
		//LION GREEN:
		/*10*/myDeck.add(new Card(R.drawable.green_lion_stripes_1,R.drawable.green_lion_stripes_1_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*11*/myDeck.add(new Card(R.drawable.green_lion_stripes_2,R.drawable.green_lion_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*12*/myDeck.add(new Card(R.drawable.green_lion_stripes_3,R.drawable.green_lion_stripes_3_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.THREE));
				
		/*13*/myDeck.add(new Card(R.drawable.green_lion_clean_1,R.drawable.green_lion_clean_1_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*14*/myDeck.add(new Card(R.drawable.green_lion_clean_3,R.drawable.green_lion_clean_3_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.THREE));
				
		/*15*/myDeck.add(new Card(R.drawable.green_lion_dots_2,R.drawable.green_lion_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*16*/myDeck.add(new Card(R.drawable.green_lion_dots_3,R.drawable.green_lion_dots_3_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.GREEN,Card.CardAmount.THREE));
				
		//LION TURQUOIS:
		/*17*/myDeck.add(new Card(R.drawable.turquois_lion_clean_2,R.drawable.turquois_lion_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		/*18*/myDeck.add(new Card(R.drawable.turquois_lion_clean_3,R.drawable.turquois_lion_clean_3_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));
				
		/*19*/myDeck.add(new Card(R.drawable.turquois_lion_dots_1,R.drawable.turquois_lion_dots_1_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
		/*20*/myDeck.add(new Card(R.drawable.turquois_lion_dots_2,R.drawable.turquois_lion_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		/*21*/myDeck.add(new Card(R.drawable.turquois_lion_dots_3,R.drawable.turquois_lion_dots_3_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));
				
		/*22*/myDeck.add(new Card(R.drawable.turquois_lion_stripes_1,R.drawable.turquois_lion_stripes_1_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
		/*23*/myDeck.add(new Card(R.drawable.turquois_lion_stripes_2,R.drawable.turquois_lion_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		/*24*/myDeck.add(new Card(R.drawable.turquois_lion_stripes_3,R.drawable.turquois_lion_stripes_3_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));
				
		//LION RED:
		/*25*/myDeck.add(new Card(R.drawable.pink_lion_clean_1,R.drawable.pink_lion_clean_1_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.PINK,Card.CardAmount.ONE));
		/*26*/myDeck.add(new Card(R.drawable.pink_lion_clean_3,R.drawable.pink_lion_clean_3_click,Card.CardFill.CLEAN,Card.CardAnimal.LION,Card.CardColor.PINK,Card.CardAmount.THREE));
				
		/*27*/myDeck.add(new Card(R.drawable.pink_lion_dots_1,R.drawable.pink_lion_dots_1_click, Card.CardFill.DOTS, Card.CardAnimal.LION, Card.CardColor.PINK, Card.CardAmount.ONE));
		/*28*/myDeck.add(new Card(R.drawable.pink_lion_dots_2,R.drawable.pink_lion_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.LION,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*29*/myDeck.add(new Card(R.drawable.pink_lion_dots_3,R.drawable.pink_lion_dots_3_click,Card. CardFill.DOTS, Card.CardAnimal.LION, Card.CardColor.PINK, Card.CardAmount.THREE));
				
		/*30*/myDeck.add(new Card(R.drawable.pink_lion_stripes_1,R.drawable.pink_lion_stripes_1_click, Card.CardFill.STRIPES, Card.CardAnimal.LION, Card.CardColor.PINK, Card.CardAmount.ONE));
		/*31*/myDeck.add(new Card(R.drawable.pink_lion_stripes_2,R.drawable.pink_lion_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.LION,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*32*/myDeck.add(new Card(R.drawable.pink_lion_stripes_3,R.drawable.pink_lion_stripes_3_click,Card. CardFill.STRIPES, Card.CardAnimal.LION, Card.CardColor.PINK, Card.CardAmount.THREE));
				
		//SEAL TURQUOIS
		/*33*/myDeck.add(new Card(R.drawable.turquois_lion_clean_2,R.drawable.turquois_lion_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		/*34*/myDeck.add(new Card(R.drawable.turquois_lion_clean_3,R.drawable.turquois_lion_clean_3_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));
				
		/*35*/myDeck.add(new Card(R.drawable.turquois_seal_dots_1,R.drawable.turquois_seal_dots_1_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
		/*36*/myDeck.add(new Card(R.drawable.turquois_seal_dots_2,R.drawable.turquois_seal_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		/*37*/myDeck.add(new Card(R.drawable.turquois_seal_dots_3,R.drawable.turquois_seal_dots_3_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));
				
		/*38*/myDeck.add(new Card(R.drawable.turquois_seal_stripes_1,R.drawable.turquois_seal_stripes_1_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
		/*39*/myDeck.add(new Card(R.drawable.turquois_seal_stripes_2,R.drawable.turquois_seal_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
				
		//SEAL RED:
		/*40*/myDeck.add(new Card(R.drawable.pink_seal_clean_1,R.drawable.pink_seal_clean_1_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.ONE));
		/*41*/myDeck.add(new Card(R.drawable.pink_seal_clean_2,R.drawable.pink_seal_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*42*/myDeck.add(new Card(R.drawable.pink_seal_clean_3,R.drawable.pink_seal_clean_3_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.THREE));
				
		/*43*/myDeck.add(new Card(R.drawable.pink_seal_stripes_1,R.drawable.pink_seal_stripes_1_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.ONE));
		/*44*/myDeck.add(new Card(R.drawable.pink_seal_stripes_2,R.drawable.pink_seal_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*45*/myDeck.add(new Card(R.drawable.pink_seal_stripes_3,R.drawable.pink_seal_stripes_3_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.THREE));
				
		/*46*/myDeck.add(new Card(R.drawable.pink_seal_dots_1,R.drawable.pink_seal_dots_1_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.ONE));
		/*47*/myDeck.add(new Card(R.drawable.pink_seal_dots_2,R.drawable.pink_seal_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*48*/myDeck.add(new Card(R.drawable.pink_seal_dots_3,R.drawable.pink_seal_dots_3_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.PINK,Card.CardAmount.THREE));
				
		//SEAL GREEN:
		/*49*/myDeck.add(new Card(R.drawable.green_seal_clean_1,R.drawable.green_seal_clean_1_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*50*/myDeck.add(new Card(R.drawable.green_seal_clean_2,R.drawable.green_seal_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*51*/myDeck.add(new Card(R.drawable.green_seal_clean_3,R.drawable.green_seal_clean_3_click,Card.CardFill.CLEAN,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.THREE));
				
		/*52*/myDeck.add(new Card(R.drawable.green_seal_stripes_1,R.drawable.green_seal_stripes_1_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*53*/myDeck.add(new Card(R.drawable.green_seal_stripes_2,R.drawable.green_seal_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*54*/myDeck.add(new Card(R.drawable.green_seal_stripes_3,R.drawable.green_seal_stripes_3_click,Card.CardFill.STRIPES,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.THREE));
				
		/*55*/myDeck.add(new Card(R.drawable.green_seal_dots_1,R.drawable.green_seal_dots_1_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*56*/myDeck.add(new Card(R.drawable.green_seal_dots_2,R.drawable.green_seal_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*57*/myDeck.add(new Card(R.drawable.green_seal_dots_3,R.drawable.green_seal_dots_3_click,Card.CardFill.DOTS,Card.CardAnimal.SEAL,Card.CardColor.GREEN,Card.CardAmount.THREE));		
				
		//APE RED:
		/*58*/myDeck.add(new Card(R.drawable.pink_ape_dots_1,R.drawable.pink_ape_dots_1_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.ONE));
		/*59*/myDeck.add(new Card(R.drawable.pink_ape_dots_2,R.drawable.pink_ape_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*60*/myDeck.add(new Card(R.drawable.pink_ape_dots_3,R.drawable.pink_ape_dots_3_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.THREE));
				
		/*61*/myDeck.add(new Card(R.drawable.pink_ape_clean_1,R.drawable.pink_ape_dots_1_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.ONE));
		/*62*/myDeck.add(new Card(R.drawable.pink_ape_dots_3,R.drawable.pink_ape_dots_3_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.THREE));
				
		/*63*/myDeck.add(new Card(R.drawable.pink_ape_stripes_2,R.drawable.pink_ape_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.TWO));
		/*64*/myDeck.add(new Card(R.drawable.pink_ape_stripes_3,R.drawable.pink_ape_stripes_3_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.PINK,Card.CardAmount.THREE));
				
		//APE TURQUOIS:
		/*65*/myDeck.add(new Card(R.drawable.turquois_ape_dots_1,R.drawable.turquois_ape_dots_1_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
		/*66*/myDeck.add(new Card(R.drawable.turquois_ape_dots_2,R.drawable.turquois_ape_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		/*67*/myDeck.add(new Card(R.drawable.turquois_ape_dots_3,R.drawable.turquois_ape_dots_3_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));
				
		/*68*/myDeck.add(new Card(R.drawable.turquois_ape_clean_1,R.drawable.turquois_ape_clean_1_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
		/*69*/myDeck.add(new Card(R.drawable.turquois_ape_clean_2,R.drawable.turquois_ape_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		/*70*/myDeck.add(new Card(R.drawable.turquois_ape_clean_3,R.drawable.turquois_ape_clean_3_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));
				
		/*71*/myDeck.add(new Card(R.drawable.turquois_ape_stripes_1,R.drawable.turquois_ape_stripes_1_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.ONE));
		/*72*/myDeck.add(new Card(R.drawable.turquois_ape_stripes_2,R.drawable.turquois_ape_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.TWO));
		/*73*/myDeck.add(new Card(R.drawable.turquois_ape_stripes_3,R.drawable.turquois_ape_stripes_3_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.TURQUOIS,Card.CardAmount.THREE));	
				
		//APE GREEN:
		/*74*/myDeck.add(new Card(R.drawable.green_ape_dots_1,R.drawable.green_ape_dots_1_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*75*/myDeck.add(new Card(R.drawable.green_ape_dots_2,R.drawable.green_ape_dots_2_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*76*/myDeck.add(new Card(R.drawable.green_ape_dots_3,R.drawable.green_ape_dots_3_click,Card.CardFill.DOTS,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.THREE));
				
		/*77*/myDeck.add(new Card(R.drawable.green_ape_clean_1,R.drawable.green_ape_clean_1_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*78*/myDeck.add(new Card(R.drawable.green_ape_clean_2,R.drawable.green_ape_clean_2_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*79*/myDeck.add(new Card(R.drawable.green_ape_clean_3,R.drawable.green_ape_clean_3_click,Card.CardFill.CLEAN,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.THREE));
				
		/*80*/myDeck.add(new Card(R.drawable.green_ape_stripes_1,R.drawable.green_ape_stripes_1_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.ONE));
		/*81*/myDeck.add(new Card(R.drawable.green_ape_stripes_2,R.drawable.green_ape_stripes_2_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.TWO));
		/*82*/myDeck.add(new Card(R.drawable.green_ape_stripes_3,R.drawable.green_ape_stripes_3_click,Card.CardFill.STRIPES,Card.CardAnimal.APE,Card.CardColor.GREEN,Card.CardAmount.THREE));	
	
	}
}
