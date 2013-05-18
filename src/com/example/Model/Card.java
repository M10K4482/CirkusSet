package com.example.Model;

public class Card {
	//Fördelen med detta är att man bara kan avända dessa orden så att det inte kan bli missförstånd. Läs om enum
	public static enum CardAnimal{LION,APE,SEAL}; //Används för att beskriva varje korts typ av djur
	public static enum CardFill{CLEAN,DOTS,STRIPES}; //Används för att beskriva varje korts bakgrund
	public static enum CardAmount{ONE,TWO,THREE}; //Används för att beskriva varje korts antal av djur
	public static enum CardColor{RED,BLUE,GREEN}; //Används för att beskriva varje korts antal av djur
	
	private int cardPressed; //Ett värde som kommer användas för att spara id för ett nertryckt kort
	private int cardNormal; //Ett värde som kommer användas för att spara id för ett normallt kort
	private CardFill fill; //Här säger vi att vi bara accepterar våra fyllnader
	private CardAnimal animal;
	private CardAmount amount;
	private CardColor color;
    private boolean isPressed; //En true/false för att senare kunna avgöra om ett kort tryckts eller ej
    
	/**En konstruktor där man skapar ett kort och sparar bilder (eller r.id.xx för bilderna) samt typen av bild*/
	public Card(int cardNormal, int cardPressed,CardFill type) {

		//lagra i privata instansvariabler
		this.cardNormal = cardNormal;
		this.cardPressed = cardPressed;
		
	}

	public int getCardImage() { //Här sätts bilden (tryckt eller normal) som ska ritas ut för ett visst kort
		
		int cardImage = cardNormal;
		if (isPressed){
			cardImage = cardPressed;
		}
		return cardImage;
		
	}
	
	//Dessa "get..." metoder används för att returnera typerna för varje objekt (kort alltså)
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
	
	public void pressCard(){ //När ett kort trycks anropas denna metod för det tryckta objektet (kortet)	
		isPressed =! isPressed; //Byter true och false beroende på vad det för tillfället är 
	}

	public boolean isPressed(){ //Returnera true/false 
		return isPressed;
	}

	//Plus fler metoder
	@Override
	public String toString() {
		return "Skriv info om korten";
	}
}
