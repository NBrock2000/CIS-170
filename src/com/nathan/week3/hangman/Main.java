package com.nathan.week3.hangman;

public class Main {

	public static void main(String[] args) {
		Loops l = new Loops();
		l.createMask();
		while(l.keepRunning()) {
			l.getInput();
		}
	} 
}
