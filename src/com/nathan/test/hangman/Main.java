package com.nathan.test.hangman;

public class Main {

	public static void main(String[] args) {
		Logic l = new Logic();
		Words w =  new Words();
		
		w.setWord();
		while(l.keepRunning()) {
			l.checkStatus();
			l.createMask();
			l.promptGuess();
			l.getInput();
			//l.outputInput();
			
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
