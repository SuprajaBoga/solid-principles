package com.principles.openclose;

public class DeveloperHike {
	Developer developer;
	
	public DeveloperHike(Developer developer) {
		this.developer = developer;
	}

	public double calculateHike(double percent) {
		return developer.getDeveloperSalary() * (percent/100);
	}
}
