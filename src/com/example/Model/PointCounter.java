package com.example.Model;

public class PointCounter {

	int playerOneScore = 0;
	boolean setCards;
	
	public void Counter (boolean setCards){
		this.setCards = setCards;
		if (setCards == true){
			playerOneScore =+ 1;
			System.out.println("player one: "+playerOneScore);
		}
	}
	public int getPlayerOneScore(){
		
		return playerOneScore;
	}
		
		
	
}
