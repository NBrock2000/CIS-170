package com.nathan.week3.hangman;

public class Input {
	public String input;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
		input = System.in.toString();
	}

}
