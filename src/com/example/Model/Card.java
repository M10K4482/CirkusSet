package com.example.Model;

import com.example.Model.Card.CardAmount;
import com.example.Model.Card.CardAnimal;
import com.example.Model.Card.CardColor;
import com.example.Model.Card.CardFill;

public class Card {
	
	//F�rdelen med detta �r att man bara kan av�nda dessa orden s� att det inte kan bli missf�rst�nd. L�s om enum
	public static enum CardAnimal{LION,APE,SEAL}; //Anv�nds f�r att beskriva varje korts typ av djur
	public static enum CardFill{CLEAN,DOTS,STRIPES}; //Anv�nds f�r att beskriva varje korts bakgrund
	public static enum CardAmount{ONE,TWO,THREE}; //Anv�nds f�r att beskriva varje korts antal av djur
	public static enum CardColor{RED,BLUE,GREEN}; //Anv�nds f�r att beskriva varje korts antal av djur
	
	private int cardPressed; //Ett v�rde som kommer anv�ndas f�r att spara id f�r ett nertryckt kort
	private int cardNormal; //Ett v�rde som kommer anv�ndas f�r att spara id f�r ett normallt kort
	private CardFill fill; //H�r s�ger vi att vi bara accepterar v�ra fyllnader
	private CardAnimal animal;
	private CardAmount amount;
	private CardColor color;
    private boolean isPressed; //En true/false f�r att senare kunna avg�ra om ett kort tryckts eller ej
    
	/**En konstruktor d�r man skapar ett kort och sparar bilder (eller r.id.xx f�r bilderna) samt typen av bild*/
	public Card(int cardNormal, int cardPressed, CardFill fill, CardAnimal animal, CardColor color, CardAmount amount) {

		//lagra i privata instansvariabler
		this.cardNormal = cardNormal;
		this.cardPressed = cardPressed;
		this.animal = animal;
		this.fill = fill;
		this.amount = amount;
		this.color = color;
		
	}

	public int getCardImage() { //H�r s�tts bilden (tryckt eller normal) som ska ritas ut f�r ett visst kort	
		int cardImage = cardNormal;
		if (isPressed){
			cardImage = cardPressed;
		}
		return cardImage;	
	}
	
	//Dessa "get..." metoder anv�nds f�r att returnera typerna f�r varje objekt (kort allts�)
	public CardFill getCardFill() {
		return fill;
	}
	
	public CardAmount getCardAmount() {
		return amount;
	}
	
	public CardAnimal getCardAnimal() {
		return animal;
	}
	
	public CardColor getCardColor() {
		return color;
	}
	
	public void pressCard(){ //N�r ett kort trycks anropas denna metod f�r det tryckta objektet (kortet)	
		isPressed =! isPressed; //Byter true och false beroende p� vad det f�r tillf�llet �r 
	}

	public boolean isPressed(){ //Returnera true/false 
		return isPressed;
	}
	
}
