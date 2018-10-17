package com.nathan.projects.race;

public class Car {

	private int topSpeed;
	private int acc;
	private int tankSize;
	private int mpg;
	private int pitStopDuration;
	private double distanceTraveled;
	private double time;
	
	public Car(int topSpeed, int Acc, int tankSize, int mpg, int pitStopDuration) {
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
		
		double gasUsed = mpg/distanceTraveled;
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
	
	
	public int getTopSpeed() {
		return topSpeed;
	}


	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}


	public int getAcceleration() {
		return acc;
	}


	public void setAcceleration(int acc) {
		this.acc = acc;
	}


	public int getTankSize() {
		return tankSize;
	}


	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}


	public int getMpg() {
		return mpg;
	}


	public void setMpg(int mpg) {
		this.mpg = mpg;
	}


	public int getPitStopDuration() {
		return pitStopDuration;
	}


	public void setPitStopDuration(int pitStopDuration) {
		this.pitStopDuration = pitStopDuration;
	}


	

}
