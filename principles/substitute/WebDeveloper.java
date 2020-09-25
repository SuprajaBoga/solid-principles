package com.principles.substitute;

public class WebDeveloper extends Developer{
	
	public WebDeveloper(String developerName, double developerSalary) {
		super(developerName, developerSalary);
	}

	public void displayHike() {
		System.out.println("Hike for Web Developer " +developerName+" is "+getDeveloperSalary());
	}

	public void displayTechnologies() {
		System.out.println("Tech used by Web Developer " +developerName+" is HTML");
		
	}

}