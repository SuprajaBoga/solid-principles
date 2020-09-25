package com.principles.substitute;

public abstract class Developer implements IHike,ITechnologies{
	public String developerName;
	private double developerSalary;

	public Developer(String developerName,double developerSalary) {
		this.developerName = developerName;
		this.developerSalary=developerSalary;
	}
	
	
	public double getDeveloperSalary() {
		return developerSalary;
	}


	public void setDeveloperSalary(double developerSalary) {
		this.developerSalary = developerSalary;
	}


	public abstract void displayHike();
	public abstract void displayTechnologies();
	
}
