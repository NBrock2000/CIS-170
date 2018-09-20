package com.nathan.week1;

import java.util.Random;

public class HelloWorld {

	private static String[] list = {"How are you?", "Have a nice day!", "How was your weekend?"};
	
	public static void main(String[] args) {
		int i = new Random().nextInt(list.length);
		System.out.println("Hello World");
		System.out.println(list[i]);
		
		HelloWorld hw = new HelloWorld();
		hw.sayHello();
	}
	
	private void sayHello() {
		System.out.println("Hello");
	}
}
