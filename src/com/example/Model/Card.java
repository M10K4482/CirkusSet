/**Namn: CirkusSet
 * Skapare: Mark Wibom, Max Moberg, Annebell Larsson, Andrea Edström, 
 * Daniel Sofinet, Maja Mercedes Boström, Alexander Moe Ditlevsen 
 * Programm: IDK12
 * Kurs: Programmering för interaktionsdesign 3: Mobila appar*/

package com.example.Model;

public class Card {
	
	public static enum CardAnimal{LION,APE,SEAL}; //Används för att beskriva varje korts typ av djur
	public static enum CardFill{CLEAN,DOTS,STRIPES}; //Används för att beskriva varje korts bakgrund
	public static enum CardAmount{ONE,TWO,THREE}; //Används för att beskriva varje korts antal av djur
	public static enum CardColor{PINK,TURQUOIS,GREEN}; //Används för att beskriva varje korts antal av djur
	
	private int cardPressed; //Ett värde som kommer användas för att spara id för ett nertryckt kort
	private int cardNormal; //Ett värde som kommer användas för att spara id för ett normallt kort
	private CardFill fill; //Här säger vi att vi bara accepterar våa fyllnader
	private CardAnimal animal;
	private CardAmount amount;
	private CardColor color;
    private boolean isPressed; //En true/false för att senare kunna avgöra om ett kort tryckts eller ej
    
	/**En konstruktor där man skapar ett kort och sparar bilder*/
	public Card(int cardNormal, int cardPressed, CardFill fill, CardAnimal animal, CardColor color, CardAmount amount) {

		/*Lagra i privata instansvariabler*/
		this.cardNormal = cardNormal;
		this.cardPressed = cardPressed;
		this.animal = animal;
		this.fill = fill;
		this.amount = amount;
		this.color = color;
		
	}

	/**I denna metod sätts bilden (tryckt eller normal) som ska ritas ut för ett visst kort och returneras*/
	public int getCardImage() {	
		int cardImage = cardNormal;
		if (isPressed){
			cardImage = cardPressed;
		}
		return cardImage;	
	}
	
	/**Dessa "get..." metoder används för att returnera typerna för varje objekt (kort alltså)*/
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
	
	/**När ett kort trycks anropas denna metod för det tryckta objektet (kortet)*/
	public void pressCard(){	
		isPressed =! isPressed; //Byter true och false beroende på vad det för tillfället är 
	}

	public boolean isPressed(){ 
		return isPressed; //Returnera true/false
	}
	
}
