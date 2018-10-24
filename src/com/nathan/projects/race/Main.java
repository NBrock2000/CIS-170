package com.nathan.projects.race;

public class Main {

	public static void main(String[] args) {
		//Race r = new Race();
		// topSpeed, ACC, tank size, MPG, pit stop time
		Car car1 = new Car(220, 60, 18, 30, 60);
		Car car2 = new Car(200, 55.7, 19.7, 30, 30);
		//while(r.isNotFinished()) {
			if(car1.milesUntilPitStop(car1.distTraveled()) <= 10) {
				System.out.println("Car1: " + car1.milesUntilPitStop(car1.distTraveled()) + " Miles Remaining");
				System.out.println("Test Fail");
			}
			else {
				System.out.println("Car1: " + car1.milesUntilPitStop(car1.distTraveled()) + " Miles Remaining");
				System.out.println("Test Pass - 10");
			}
			
			if(car1.milesUntilPitStop(car1.distTraveled()) <= 150) {
				System.out.println("Car1: " + car1.milesUntilPitStop(car1.distTraveled()) + " Miles Remaining");
				System.out.println("Test Pass - 150");
			}
			else {
				System.out.println("Car1: " + car1.milesUntilPitStop(car1.distTraveled()) + " Miles Remaining");
				System.out.println("Test Fail");
			}
			
			if(car2.milesUntilPitStop(car2.distTraveled()) <= 10) {
				System.out.println("Car2: " + car2.milesUntilPitStop(car2.distTraveled()) + " Miles Remaining");
				System.out.println("Test Fail");
			}
			else {
				System.out.println("Car2: " + car2.milesUntilPitStop(car2.distTraveled()) + " Miles Remaining");
				System.out.println("Test Pass - 10");
			}
			
			if(car2.milesUntilPitStop(car2.distTraveled()) <= 200) {
				System.out.println("Car2: " + car2.milesUntilPitStop(car2.distTraveled()) + " Miles Remaining");
				System.out.println("Test Fail");
			}
			else {
				System.out.println("Car2: " + car2.milesUntilPitStop(car2.distTraveled()) + " Miles Remaining");
				System.out.println("Test Pass - 200");
			}
			
		//}
		
	}
}
