package com.nathan.week3.hangman;

public class Main {

	public static void main(String[] args) {
		Util u = new Util();
		Input in = new Input();
		
		u.createMask();
		u.promptGuess();
		while(u.keepRunning()) {
			in.getInput();
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
