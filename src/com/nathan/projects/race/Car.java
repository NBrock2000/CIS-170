package com.nathan.projects.race;

public class Car {

	private double topSpeed;
	private double acc;
	private double tankSize;
	private double mpg;
	private double pitStopDuration;
	private double distanceTraveled;
	private double time;
	
	public Car(double topSpeed, double Acc, double tankSize, double mpg, double pitStopDuration) {
		// Top Speed - MPH
		this.topSpeed = topSpeed;
		// Acceleration - MPH/s
		this.acc = Acc;
		// Tank Size - Gallons
		this.tankSize = tankSize;
		// MPG
		this.mpg = mpg;
		// pitStopDuration - Seconds
		this.pitStopDuration = pitStopDuration;
		
	}
	
	public double milesUntilPitStop(double distanceTraveled) {
		
		double gasUsed = distanceTraveled/mpg;
		double gasLeft = tankSize-gasUsed;
		double milesLeft = gasLeft*mpg;
		
		//dist traveled -
		//gas used
		// mpg
		
		return milesLeft;
	}
	
	public double distTraveled() {
		time = topSpeed/acc;
		distanceTraveled = 0.5*acc*time*time;
		return this.distanceTraveled;
		
	}
	
	
	public double getTopSpeed() {
		return topSpeed;
	}


	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}


	public double getAcceleration() {
		return acc;
	}


	public void setAcceleration(double acc) {
		this.acc = acc;
	}


	public double getTankSize() {
		return tankSize;
	}


	public void setTankSize(double tankSize) {
		this.tankSize = tankSize;
	}


	public double getMpg() {
		return mpg;
	}


	public void setMpg(double mpg) {
		this.mpg = mpg;
	}


	public double getPitStopDuration() {
		return pitStopDuration;
	}


	public void setPitStopDuration(double pitStopDuration) {
		this.pitStopDuration = pitStopDuration;
	}


	

}
