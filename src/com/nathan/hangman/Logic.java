package com.nathan.hangman;

public class Logic {

	String w = Arrays.word;

	public void createMask() {
		if(g.newGame == true) {
			for(int i = 0; i < w.length(); i++) {
				System.out.print("*");
			}
			System.out.println();
			g.inProgress = true;
		}
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
		} else if(w.equalsIgnoreCase("Honda") || w.equalsIgnoreCase("Lamborghini")) {
			hint = "Car Brand";
		} else {
			hint = "";
		}
		return hint;

	}

	GameState g  = new GameState();
	
	public boolean keepRunning() {
		if(g.getWin() == false && g.getLoss() == false && g.getInProgress() == true) {
			return true;
		} else {
			return false;
		}
	}

	public String input;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
		input = System.in.toString();
	}

	public static int correct = 0;
	public static int incorrect = 0;
	
	public void checkStatus() {
		if(correct == w.length()) {
			g.win = true;
			g.inProgress = false;
			correct = 0;
			incorrect = 0;
		} else if(incorrect == 5) {
			
			
			
			correct = 0;
			incorrect = 0;
		}
	}
	
	public void calculateMask() {
		if(w.contains(input)) {
			for(int i = 0; i < w.length(); i++) {
				char c = w.charAt(i);
				String s = Character.toString(c);
				if(s == input) {
					
				}
			}
		} else { 
			
		}
	}
}
