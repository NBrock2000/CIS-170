package com.nathan.test.hangman;

import java.util.Random;

public class Main {

	private static String[] wordList = {"Horse", "Dog", "Honda", "Lamborghini"};
	public static String word;
	

	public static void main(String[] args) {
		Logic l = new Logic();
		
		
		while(true) {
			int wordNumber = new Random().nextInt(wordList.length);
			word = wordList[wordNumber];
			
			while(l.keepRunning()) {
				l.checkStatus();
				l.createMask();
				l.promptGuess();
				l.getInput();
				//l.outputInput();
				
			}
		}
	} 
}




// prompt player to guess
// - print game layout

// prompt player with mask (generate mask

// get input

// recalculate mask

// generate the hangman
// - After main functions are complete
