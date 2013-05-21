package com.example.Model;

import java.util.ArrayList;

import com.example.Model.Card.CardAmount;
import com.example.Model.Card.CardAnimal;
import com.example.Model.Card.CardColor;
import com.example.Model.Card.CardFill;
import com.example.cirkusset.ImageAdapter;

import android.util.Log;

public class SetRules {
	
	private CardAnimal animal_1;
	private CardAnimal animal_2;
	private CardAnimal animal_3;
	private CardFill fill_1;
	private CardFill fill_2;
	private CardFill fill_3;
	private CardAmount amount_1;
	private CardAmount amount_2;
	private CardAmount amount_3;
	private CardColor color_1;
	private CardColor color_2;
	private CardColor color_3;
	
	
	public SetRules(CardAnimal animal_1, CardAnimal animal_2, CardAnimal animal_3, CardFill fill_1, CardFill fill_2, CardFill fill_3, 
			CardAmount amount_1, CardAmount amount_2, CardAmount amount_3, CardColor color_1, CardColor color_2, CardColor color_3){
		
		this.animal_1 = animal_1;
		this.animal_2 = animal_2;
		this.animal_3 = animal_3;
		this.fill_1 = fill_1;
		this.fill_2 = fill_2;
		this.fill_3 = fill_3;
		this.amount_1 = amount_1;
		this.amount_2 = amount_2;
		this.amount_3 = amount_3;
		this.color_1 = color_1;
		this.color_2 = color_2;
		this.color_3 = color_3;
		
	}
	
	public CardFill getRuleFillOne() {
		return fill_1;
	}
	
	public CardFill getRuleFillTwo() {
		return fill_2;
	}
	
	public CardFill getRuleFillThree() {
		return fill_3;
	}
	
	public CardAnimal getRuleAnimalOne() {
		return animal_1;
	}
	
	public CardAnimal getRuleAnimalTwo() {
		return animal_2;
	}
	
	public CardAnimal getRuleAnimalThree() {
		return animal_3;
	}
	
	public CardAmount getRuleAmountOne() {
		return amount_1;
	}
	
	public CardAmount getRuleAmountTwo() {
		return amount_2;
	}
	
	public CardAmount getRuleAmountThree() {
		return amount_3;
	}
	
	public CardColor getRuleColorOne() {
		return color_1;
	}
	
	public CardColor getRuleColorTwo() {
		return color_2;
	}
	
	public CardColor getRuleColorThree() {
		return color_3;
	}

}
