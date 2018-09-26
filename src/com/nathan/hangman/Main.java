package com.nathan.hangman;

public class Main {

	public static void main(String[] args) {
		Logic l = new Logic();
		
		l.createMask();
		l.promptGuess();
		while(l.keepRunning()) {
			l.getInput();
			
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
