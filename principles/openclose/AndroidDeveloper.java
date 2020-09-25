package com.principles.openclose;

public class AndroidDeveloper extends Developer{
	
	public AndroidDeveloper(String developerName,double developerSalary) {
		super(developerName,developerSalary);
	}

	public void displayHike() {
		System.out.println("Hike for Android Developer " +developerName+" is "+getDeveloperSalary());
	}
	
}
