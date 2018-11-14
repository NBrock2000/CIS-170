package com.nathan.projects.hangman;

import com.nathan.projects.hangman.Logic;

public class Main {

	public static void main(String[] args) {
		Logic l = new Logic();
		
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

// prompt player with mask (generate mask)

// get input

// recalculate mask

// generate the hangman
// - After main functions are complete
