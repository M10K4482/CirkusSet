/**Namn: CirkusSet
 * Skapare: Mark Wibom, Max Moberg, Annebell Larsson, Andrea Edström, 
 * Daniel Sofinet, Maja Mercedes Boström, Alexander Moe Ditlevsen 
 * Programm: IDK12
 * Kurs: Programmering för interaktionsdesign 3: Mobila appar*/

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
