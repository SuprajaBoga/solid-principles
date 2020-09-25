package com.principles.single;

public class Hike {
	Developer developer;
	
	public Hike(Developer developer) {
		this.developer = developer;
	}

	public double calculateHike() {
		return developer.getDeveloperSalary() * 0.2;
	}
}
