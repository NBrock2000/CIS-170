package com.nathan.test.hangman;

import java.util.Arrays;
import java.util.Scanner;

public class Logic {

	
	//String w = "honda";
	GameState g  = new GameState();
	Words w = new Words();

	private String[] correctGuess = new String[w.getWords().length];
	
	
	
/*
	public void setCorrectGuess() {
		correctGuess = new String[w.word.length()];
		this.correctGuess = correctGuess;
		
	}
*/


	public void createMask() {
		if(g.newGame == true || g.getWin() == true || g.getLoss() == true && g.getInProgress() == false) {
			System.out.println("NEW GAME");
			//setCorrectGuess();
			for(int i = 0; i < w.getWord().length(); i++) {
				System.out.print("*");
			}
			
			System.out.println();
			g.setNewGame(false);
			g.setInProgress(true);
			g.setLoss(false);
			g.setWin(false);
			
		} else if(g.getInProgress() == true && input != null) {
			if(w.getWord().contains(input)) {
				
				if(!Arrays.asList(correctGuess).contains(input)) {
					
					for(int i = 0; i < w.getWord().length(); i++) {
						char c = w.getWord().charAt(i);
						String s = Character.toString(c);
						if(s.equals(input)) {
							correctGuess[i] = s;
						}
						
						if(correctGuess[i] == null) {
							System.out.print("*");
						} else {
							System.out.print(correctGuess[i]);
						}
					}
					if(w.getWord().equalsIgnoreCase("Lamborghini") && input.equalsIgnoreCase("i")) {
						correct++;
						correct++;
					} else {
						correct++;
					}
					
					
				}
				
			} else {
				for(int i = 0; i < w.getWord().length(); i++) {
					System.out.print("*");
				}
				incorrect++;
			}
			
		}
	}
	
		

	public void promptGuess() {
		System.out.println();
		System.out.println("Hint: " + hint());
		System.out.println("Enter a letter: ");

	}

	public String hint() {
		String hint = null;
		if(w.getWord().equalsIgnoreCase("Dog") || w.getWord().equalsIgnoreCase("Horse")) {
			hint = "Animal";
		} else if(w.getWord().equalsIgnoreCase("Honda") || w.getWord().equalsIgnoreCase("Lamborghini")) {
			hint = "Car Brand";
		} else {
			hint = "";
		}
		return hint;

	}

	
	public boolean keepRunning() {
		if(g.getWin() == false && g.getLoss() == false) {
			return true;
		} else {
			return false;
		}
	}

	public String input;

	@SuppressWarnings("resource")
	public String getInput() {
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine().toLowerCase();
		return input;
	}


	public static int correct = 0;
	public static int incorrect = 0;
	
	public void checkStatus() {
		if(correct == w.getWord().length()-1) {
			g.setWin(true);
			g.setInProgress(false);
			correct = 0;
			incorrect = 0;
			System.out.println("You Won!");
			
			for(int i = 0; i < correctGuess.length; i++) {
				correctGuess[i] = null;
			}
			
			for(int z = 0; z < 5; z++) {
				System.out.println("");
			}
			
			
		} else if(incorrect == 5) {
			g.setLoss(true);
			g.setInProgress(false);
			correct = 0;
			incorrect = 0;
			System.out.println("You Lost!");
			
			for(int i = 0; i < correctGuess.length; i++) {
				correctGuess[i] = null;
			}
			
			for(int z = 0; z < 5; z++) {
				System.out.println("");
			}
			
		}
	}
	
	public void outputInput() {
		System.out.println(input);
	}
	
}
