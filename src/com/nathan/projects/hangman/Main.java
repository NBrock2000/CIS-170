package com.nathan.projects.hangman;

public class Main {

	public static void main(String[] args) {
		Logic l = new Logic();
		GameState g = new GameState();
		
		System.out.println("hello");
		l.createMask();
		l.promptGuess();
		while(g.getWin() == true || g.getLoss() == true) {
			l.newGame();
		}
		
		while(l.keepRunning()) {
			l.getInput();
			l.checkStatus();
			//l.promptGuess();
			
			l.calculateMask();
			
			//l.printScreen();
			
			
			
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
