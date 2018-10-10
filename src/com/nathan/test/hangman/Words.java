package com.nathan.test.hangman;

import java.util.Random;

public class Words {

	private static String[] wordList = {"Horse", "Dog", "Honda", "Lamborghini"};
	int wordNumber = 0;
	private String word;
	
	public String getWord() {
		return word;
	}
	public void setWord() {
		wordNumber = new Random().nextInt(wordList.length);
		word = wordList[wordNumber];
	}
}
