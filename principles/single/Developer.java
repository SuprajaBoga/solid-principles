package com.principles.single;

public class Developer{
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

	public void displayDeveloperHike() {
		System.out.println("Hike for Developer " +developerName+" is "+getDeveloperSalary());
		
	}
	
}
