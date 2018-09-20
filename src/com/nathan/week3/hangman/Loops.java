package com.nathan.week3.hangman;

import java.io.IOException;

import com.nathan.week3.Arrays;

public class Loops {

	public void createMask() {
		for(int i = 0; i < Arrays.word.length(); i++) {
			System.out.print("*");
		}
	}
	
	public void getInput() {
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public boolean keepRunning() {
		return true;
	}
	
}
