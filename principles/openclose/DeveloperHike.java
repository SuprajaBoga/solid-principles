package com.principles.openclose;

public class DeveloperHike {
	Developer d;
	
	public DeveloperHike(Developer d) {
		this.d = d;
	}

	public double calculateHike(double percent) {
		return d.getSal() * (percent/100);
	}
}
