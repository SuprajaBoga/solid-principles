package com.principles.single;

public class CalculateHike {
	Developer d;
	
	public CalculateHike(Developer d) {
		this.d = d;
	}

	public double calculateHike() {
		return d.getSal() * 0.2;
	}
}
