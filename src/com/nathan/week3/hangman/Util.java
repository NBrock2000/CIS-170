package com.nathan.week3.hangman;

public class Util {

	String w = Arrays.word;
	public void createMask() {
		for(int i = 0; i < w.length(); i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public void promptGuess() {
		System.out.println();
		System.out.println("Hint: " + hint());
		System.out.println();
		System.out.println("Enter a letter: ");
		
	}
	
	public String hint() {
		String hint = null;
		if(w.equalsIgnoreCase("Dog") || w.equalsIgnoreCase("Horse")) {
			hint = "Animal";
		} else if (w.equalsIgnoreCase("Honda") || w.equalsIgnoreCase("Lamborghini")) {
			hint = "Car Brand"; 
		} else {
			hint = "";
		}
		return hint;
		
	}
	
	public boolean keepRunning() {
		return true;
	}
	
}
