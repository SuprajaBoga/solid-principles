package com.principles.openclose;

public abstract class Developer {
	public String developerName;
	private double developerSalary;

	
	public Developer(String developerName, double developerSalary) {
		super();
		this.developerName = developerName;
		this.developerSalary = developerSalary;
	}


	public double getDeveloperSalary() {
		return developerSalary;
	}


	public void setDeveloperSalary(double developerSalary) {
		this.developerSalary = developerSalary;
	}


	public abstract void displayHike();

	
}
