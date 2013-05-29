package com.example.Model;

public class PointCounter {

	int playerOneScore;
	int playerTwoScore;
	int number;
	boolean kindOfPoints;
	
	public PointCounter(){
		playerOneScore = 0;
		playerTwoScore = 0;
	}

	public void setPlayerScore(int number, boolean kindOfPoints){
		this.number = number;
		this.kindOfPoints = kindOfPoints;
		
		if(kindOfPoints == true){
			playerOneScore += number;
		}else if(kindOfPoints == false){
			playerOneScore -= number;
		}
		
	}

	public int getPlayerOneScore(){
		return playerOneScore;
	}
	
	public int getPlayerTwoScore(){
		return playerTwoScore;
	}
	
}
