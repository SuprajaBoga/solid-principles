package com.principles.substitute;

public class IosDeveloper implements ITechnologies{

	public String developerName;
	private double developerSalary;

	public IosDeveloper(String developerName , double developerSalary) {
		this.developerName = developerName;
		this.developerSalary = developerSalary;
	}
	

	public double getDeveloperSalary() {
		return developerSalary;
	}


	public void setDeveloperSalary(double developerSalary) {
		this.developerSalary = developerSalary;
	}


	public void displayTechnologies() {
		System.out.println("Tech used by Ios Developer " +developerName+" is Swift");
		
	}
}
