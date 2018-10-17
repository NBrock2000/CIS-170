package com.nathan.projects.race;

public class Main {

	public static void main(String[] args) {
		//Race r = new Race();
		Car Honda = new Car(220, 30, 10, 15, 60);
		//while(r.isNotFinished()) {
			if(Honda.milesUntilPitStop(Honda.distTraveled()) <= 10) {
				System.out.println(Honda.milesUntilPitStop(Honda.distTraveled()) + " Miles Remaining");
			}
			else {
				System.out.println("Test Fail");
				System.out.println(Honda.milesUntilPitStop(Honda.distTraveled()) + " Miles Remaining");
			}
			
		//}
		
	}
}
