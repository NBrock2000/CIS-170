package com.nathan.week3.hw;

public class Loops {

	
	public void loopingLoops() {
		
		int w = 0;
		String word = "Robot";
		
		while(w < 10) {
			for(int i = 0; i < word.length(); i++) {
				 System.out.println(word.charAt(i));
			}
			w =  w + word.length();
		}
	}
}
