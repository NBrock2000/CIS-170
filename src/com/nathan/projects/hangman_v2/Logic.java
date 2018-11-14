package com.nathan.projects.hangman_v2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Logic {

	GameState g  = new GameState();
	Main m =  new Main();

	private static String ast = "*";
	List<String> guesses = new ArrayList<String>();
	
	public void createMask() {
		if(g.newGame == true || g.getWin() == true || g.getLoss() == true) {
			System.out.println("NEW GAME");
			Main.word = Main.words.get(new Random().nextInt(Main.words.size()));
			for(int i = 0; i < m.getWord().length(); i++) {
				System.out.print("*");
				guesses.add(i, ast);
			}
			
			System.out.println();
			g.setNewGame(false);
			g.setInProgress(true);
			g.setLoss(false);
			g.setWin(false);
			
		} else if(g.getInProgress() == true && input != null) {
			if(m.getWord().contains(input)) {
				for(int i = 0; i < m.getWord().length(); i++) {
					char c = m.getWord().charAt(i);
					String s = Character.toString(c);
					if(s.equals(input)) {
						guesses.add(i, s);
					}
					
					if(guesses.get(i).equals(null)) {
						System.out.print("*");
					} else {
						System.out.print(guesses.get(i));
					}
				}
				correct++;
						
			} else {
				for(int i = 0; i < m.getWord().length(); i++) {
					System.out.print("*");
				}
				incorrect++;
			}
			
		}
	}
	
	public void promptGuess() {
		System.out.println();
	//	System.out.println("Hint: " + hint());
		System.out.println("Enter a letter: ");

	}
/*
	public String hint() {
		String hint = null;
		if(m.getWord().equalsIgnoreCase("Dog") || m.getWord().equalsIgnoreCase("Horse")) {
			hint = "Animal";
		} else if(m.getWord().equalsIgnoreCase("Honda") || m.getWord().equalsIgnoreCase("Lamborghini")) {
			hint = "Car Brand";
		} else {
			hint = "";
		}
		return hint;

	}*/

	
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
		if(m.getWord() != null) {
			if(correct == m.getWord().length()-1) {
				g.setWin(true);
				g.setInProgress(false);
				correct = 0;
				incorrect = 0;
				System.out.println("You Won!");
				guesses.clear();
				
				
				for(int z = 0; z < 5; z++) {
					System.out.println("");
				}
				
				
			} else if(incorrect == 5) {
				g.setLoss(true);
				g.setInProgress(false);
				correct = 0;
				incorrect = 0;
				System.out.println("You Lost!");
				guesses.clear();
				
				for(int z = 0; z < 5; z++) {
					System.out.println("");
				}
				
			}
		}
	}
	
	public void writeFile() throws IOException
	{
	    BufferedWriter writer = new BufferedWriter(new FileWriter("src/com/nathan/projects/hangman_v2/log.txt"));
	    try {
			if(g.getWin() == true) {
				writer.write("Game: " + m.getWord() + " Win");
			} else if(g.getLoss() == true) {
				writer.write("Game: " + m.getWord() + " Loss");	
			} else if(g.getInProgress() == true) {
				writer.write("Game: " + m.getWord() + " in progress");
			}
			writer.newLine();
		} 
	    catch (IOException e) 
	    {
			throw e;
		}
	    finally
	    {
	    	writer.close();
	    }   

	}
	
}
