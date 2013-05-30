package com.example.Model;

import com.example.Model.Card.CardAmount;
import com.example.Model.Card.CardAnimal;
import com.example.Model.Card.CardColor;
import com.example.Model.Card.CardFill;

public class Card {
	
	//Fï¿½rdelen med detta ï¿½r att man bara kan avï¿½nda dessa orden sï¿½ att det inte kan bli missfï¿½rstï¿½nd. Lï¿½s om enum
	public static enum CardAnimal{LION,APE,SEAL}; //Anvï¿½nds fï¿½r att beskriva varje korts typ av djur
	public static enum CardFill{CLEAN,DOTS,STRIPES}; //Anvï¿½nds fï¿½r att beskriva varje korts bakgrund
	public static enum CardAmount{ONE,TWO,THREE}; //Anvï¿½nds fï¿½r att beskriva varje korts antal av djur
	public static enum CardColor{PINK,TURQUOIS,GREEN}; //Anvï¿½nds fï¿½r att beskriva varje korts antal av djur
	
	private int cardPressed; //Ett vï¿½rde som kommer anvï¿½ndas fï¿½r att spara id fï¿½r ett nertryckt kort
	private int cardNormal; //Ett vï¿½rde som kommer anvï¿½ndas fï¿½r att spara id fï¿½r ett normallt kort
	private CardFill fill; //Hï¿½r sï¿½ger vi att vi bara accepterar vï¿½ra fyllnader
	private CardAnimal animal;
	private CardAmount amount;
	private CardColor color;
    private boolean isPressed; //En true/false fï¿½r att senare kunna avgï¿½ra om ett kort tryckts eller ej
    
	/**En konstruktor dï¿½r man skapar ett kort och sparar bilder (eller r.id.xx fï¿½r bilderna) samt typen av bild*/
	public Card(int cardNormal, int cardPressed, CardFill fill, CardAnimal animal, CardColor color, CardAmount amount) {

		//lagra i privata instansvariabler
		this.cardNormal = cardNormal;
		this.cardPressed = cardPressed;
		this.animal = animal;
		this.fill = fill;
		this.amount = amount;
		this.color = color;
		
	}

	public int getCardImage() { //Hï¿½r sï¿½tts bilden (tryckt eller normal) som ska ritas ut fï¿½r ett visst kort	
		int cardImage = cardNormal;
		if (isPressed){
			cardImage = cardPressed;
		}
		return cardImage;	
	}
	
	//Dessa "get..." metoder anvï¿½nds fï¿½r att returnera typerna fï¿½r varje objekt (kort alltsï¿½)
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
	
	public void pressCard(){ //Nï¿½r ett kort trycks anropas denna metod fï¿½r det tryckta objektet (kortet)	
		isPressed =! isPressed; //Byter true och false beroende pï¿½ vad det fï¿½r tillfï¿½llet ï¿½r 
	}

	public boolean isPressed(){ //Returnera true/false 
		return isPressed;
	}
	
}
