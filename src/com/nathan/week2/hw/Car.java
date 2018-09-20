package com.nathan.week2.hw;

import java.util.Random;

public class Car {

	public static void main(String[] args) {
		Strings str = new Strings();
		Random r = new Random();
		str.setMake("Honda");
		str.setfA(new int[] { 1, 2, 3, 4, 5});
		
		int iCar = 1;
		for (int i = 0; i < str.getfA()[r.nextInt(str.getfA().length)]; i++) {
			
			// Sets the values for the arrays
			str.setModelA(new String[] { "Accord", "Civic", "Pilot", "CR-V"});
			str.setTrimA(new String[] { "EX-L", "EX", "LX", "EX-L Nav"});
			str.setYearA(new int[] { 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018});
			str.setColorA(new String[] { "Green", "Red", "Blue", "Grey", "Black", "White", "Brown"});
			
			// Sets the strings to a random value from the arrays
			str.setModel(str.getModelA()[r.nextInt(str.getModelA().length)]);
			str.setTrim(str.getTrimA()[r.nextInt(str.getTrimA().length)]);
			str.setYear(str.getYearA()[r.nextInt(str.getYearA().length)]);
			str.setColor(str.getColorA()[r.nextInt(str.getColorA().length)]);
			
			// Prints the list of random cars to the console
			System.out.println("Car " + iCar + ":");
			System.out.println("Make: " + str.getMake());
			System.out.println("Model: " + str.getModel());
			System.out.println("Trim: " + str.getTrim());
			System.out.println("Year: " + str.getYear());
			System.out.println("Color: " + str.getColor());
			System.out.println("");
			iCar++;
		}
	}
}
