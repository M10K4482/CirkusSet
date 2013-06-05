package com.example.Model;

import android.util.Log;

public class PointCounter {

	int playerOneScore;
	int playerTwoScore;
	int number;
	boolean whichPlayer;
	
	public PointCounter(){
		playerOneScore = 0;
		playerTwoScore = 0;
		whichPlayer = true;
	}

	public void setPlayerScore(int number){
		this.number = number;
		Log.i("PlayerKnapp2", ""+whichPlayer);
		if(whichPlayer == true){
			playerOneScore += number;
		}else if(whichPlayer == false){
			playerTwoScore += number;
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
