package com.principles.substitute;

public class DeveloperHike {
	Developer developer;
	public DeveloperHike() {}
	public DeveloperHike(Developer d) {
		this.developer = developer;
	}

	public double calculateHike(double percent) {
		return developer.getDeveloperSalary() * (percent/100);
	}
}
