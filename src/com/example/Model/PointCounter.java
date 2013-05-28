package com.example.Model;

public class PointCounter {

	int playerOneScore = 0;
	int playerTwoScore = 0;

	public void setPlayerScore(int number, boolean kindOfPoints){
		
		if(kindOfPoints == true){
			playerOneScore =+ number;
		}else if(kindOfPoints == false){
			playerTwoScore =- number;
		}
		
		System.out.println("player one: "+playerOneScore);
		System.out.println("player one: "+playerTwoScore);
	}

	public int getPlayerOneScore(){
		return playerOneScore;
	}
	
	public int getPlayerTwoScore(){
		return playerTwoScore;
	}
	
}
