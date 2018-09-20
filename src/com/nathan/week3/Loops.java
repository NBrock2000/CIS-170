package com.nathan.week3;

public class Loops {

	public void forLoopSample1() {
		
		for(int i = 0; i < 10; ++i) {
			System.out.println(i);
		}
	}
	
	public void forLoopSample2() {
		String word = "Dog";
		
		for(int i = 0; i < word.length(); i++) {
			System.out.println(i);
			System.out.println(word.charAt(i));
		}
	}
	
	public void createMask() {
		String word = "Dog";
		
		for(int i = 0; i < word.length(); i++) {
			System.out.print("*");
		}
		
	}
	
	public void whileSample1() {
		
		int i = 0;
		
		while(keepRunning())  {
			System.out.println(i);
		}
		
	}
		private boolean keepRunning() {
			return true;
		
		}
		
	
}
