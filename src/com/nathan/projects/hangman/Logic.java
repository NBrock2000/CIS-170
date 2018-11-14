package com.nathan.projects.hangman;

import java.util.Arrays;
import java.util.Scanner;

public class Logic {

	String w = Words.word;
	//String w = "honda";
	GameState g  = new GameState();

	private String[] correctGuess = new String[w.length()];
	
	public void createMask() {
		if(g.newGame == true || g.getWin() == true || g.getLoss() == true && g.getInProgress() == false) {
			System.out.println("NEW GAME");
			for(int i = 0; i < w.length(); i++) {
				System.out.print("*");
			}
			
			System.out.println();
			g.setNewGame(false);
			g.setInProgress(true);
			g.setLoss(false);
			g.setWin(false);
			
		} else if(g.getInProgress() == true && input != null) {
			if(w.contains(input)) {
				
				if(!Arrays.asList(correctGuess).contains(input)) {
					
					for(int i = 0; i < w.length(); i++) {
						char c = w.charAt(i);
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
					correct++;
					
				}
				
			} else {
				for(int i = 0; i < w.length(); i++) {
					System.out.print("*");
				}
				incorrect++;
			}
			
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
		if(correct == w.length()-1) {
			g.setWin(true);
			g.setInProgress(false);
			correct = 0;
			incorrect = 0;
			System.out.println("You Won!");
			
			for(int z = 0; z < 5; z++) {
				System.out.println("");
			}
			
		} else if(incorrect == 5) {
			g.setLoss(true);
			g.setInProgress(false);
			correct = 0;
			incorrect = 0;
			System.out.println("You Lost!");
			
			for(int z = 0; z < 5; z++) {
				System.out.println("");
			}
		}
	}
	
	public void outputInput() {
		System.out.println(input);
	}
	
}