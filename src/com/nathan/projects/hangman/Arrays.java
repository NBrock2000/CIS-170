package com.nathan.projects.hangman;

import java.util.Random;

public class Arrays {

	private static String[] wordList = {"Horse", "Dog", "Honda", "Lamborghini"};
	
	static int wordNumber = new Random().nextInt(wordList.length);
	public static final String word = wordList[wordNumber];
}
