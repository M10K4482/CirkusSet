package com.example.Model;

public class PointCounter {

	int playerOneScore;
	int playerTwoScore;
	int number;
	boolean whichPlayer;
	
	public PointCounter(){
		playerOneScore = 0;
		playerTwoScore = 0;
	}

	public void setPlayerScore(int number){
		this.number = number;
		this.whichPlayer = whichPlayer;
		
		if(whichPlayer == true){
			playerOneScore += number;
		}else if(whichPlayer == false){
			playerOneScore += number;
		}
		
	}
	
	public void setWhichPlayer(boolean whichPlayer){
		
		this.whichPlayer = whichPlayer;
		
	}

	public int getPlayerOneScore(){
		return playerOneScore;
	}
	
	public int getPlayerTwoScore(){
		return playerTwoScore;
	}
	
}
