package com.nathan.projects.hangman;


import java.util.Arrays;
import java.util.Scanner;

public class Logic {

	Words wrd = new Words();
	String w = wrd.word;

	public void createMask() {
		if(g.getNewGame() == true && g.getInProgress() == false) {
			for(int i = 0; i < w.length(); i++) {
				System.out.print("*");
			}
			System.out.println();
			g.setInProgress(true);
			g.setNewGame(false);
		}
	}
		

	public void promptGuess() {
		System.out.println();
		System.out.println("Hint: " + hint());
		System.out.println();
		System.out.println("Enter a letter: ");

	}

	public String hint() {
		String hint = "";
		//if(incorrect > 0) {
			if(w.equalsIgnoreCase("Dog") || w.equalsIgnoreCase("Horse")) {
				hint = "Animal";
				return hint;
			} else if(w.equalsIgnoreCase("Honda") || w.equalsIgnoreCase("Lamborghini")) {
				hint = "Car Brand";
				return hint;
			}
			
			
		//}
		//else {
		//	return "";
		//}
		return "";

	}

	GameState g  = new GameState();
	
	public boolean keepRunning() {
		if(g.getWin() == false && g.getLoss() == false && g.getInProgress() == true) {
			return true;
		} else {
			return false;
		}
	}
	Scanner scan = new Scanner(System.in);
	private String input = scan.next();

	public String getInput() {
		return input;
	}


	public static int correct = 0;
	public static int incorrect = 0;
	
	public void checkStatus() {
		if(correct == w.length()) {
			g.setWin(true);
			correct = 0;
			incorrect = 0;
		} else if(incorrect == 5) {
			g.setLoss(true);
			correct = 0;
			incorrect = 0;
		}
	}
	
	private String[] correctGuess = new String[w.length() + 1];
	//private String[] incorrectGuess = new String[6];
	
	public void calculateMask() {
		if(getInput() != null) {
			if(w.contains(getInput())) {
				if(!Arrays.asList(correctGuess).contains(getInput())) {
					for(int i = 0; i < w.length(); i++) {
						char c = w.charAt(i);
						String s = Character.toString(c);
						
						if(s == getInput()) {
							System.out.print(getInput());
							correctGuess[i] = s;
						} 
						
						else {
							System.out.print("*");
						}
					}
					correct++;
				}
				
			} 
			
			else if(w.equalsIgnoreCase(getInput())) {
				g.setWin(true);
				correct = 0;
				incorrect = 0;
			}
			/*
			else { 
				if(!Arrays.asList(incorrectGuess).contains(getInput())) {
					incorrectGuess = add(incorrectGuess, getInput());
					incorrect++;
				}
				
			}*/
		}
	}
	
	public void newGame() {
		g.setInProgress(false);
		g.setNewGame(true);
		correctGuess = null;
		//incorrectGuess = null;
		createMask();
		
	}
	
	/*
	public void printScreen() {
		calculateMask();
		promptGuess();
	}
	*/
	
	//private String[] add(String[] incorrectGuess2, String input2) {
	//	return null;
	//}
}
