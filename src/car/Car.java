package car;

import java.util.Random;

public class Car {

	private static String[] model = {"Accord", "Civic", "Pilot", "CR-V"};
	private static String[] trim = {"EX-L", "EX", "LX", "EX-L Nav"};
	private static int[] year = {2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018};
	private static String[] color = {"Green","Red", "Blue", "Grey", "Black", "White", "Brown"};
	private static int[] f = {1, 2, 3, 4, 5};
	
	public static void main(String[] args) {
		Strings str = new Strings();
		
		str.setMake("Honda");
		int iFor = new Random().nextInt(f.length);
		for(int i = 0; i < iFor; i++) {
		int iModel = new Random().nextInt(model.length);
		int iTrim = new Random().nextInt(trim.length);
		int iYear = new Random().nextInt(year.length);
		int iColor = new Random().nextInt(color.length);
		str.setModel(model[iModel]);
		str.setTrim(trim[iTrim]);
		str.setYear(year[iYear]);
		str.setColor(color[iColor]);
		
		System.out.println("Make: " + str.getMake());
		System.out.println("Model: " + str.getModel());
		System.out.println("Trim: " + str.getTrim());
		System.out.println("Year: " + str.getYear());
		System.out.println("Color: " + str.getColor());
		System.out.println("");
		}
	}
}
