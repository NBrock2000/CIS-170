package com.nathan.projects.race;

public class Race {
	
	private int nbrTimesAround;
	
	
	public Race(int nbrTimesAround) {
		this.nbrTimesAround = nbrTimesAround;
	}
	
	public Race() {
		
	}
	
	public int getNbrTimesAround() {
		return nbrTimesAround;
	}
	public void setNbrTimesAround(int nbrTimesAround) {
		this.nbrTimesAround = nbrTimesAround;
	}
	
	public boolean isNotFinished() {
		
		return true;
		
	}
	

}
