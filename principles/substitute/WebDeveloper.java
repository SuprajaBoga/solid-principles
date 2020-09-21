package com.principles.substitute;

public class WebDeveloper extends Developer{
	
	public WebDeveloper(String name, double sal) {
		super(name, sal);
	}

	public void displayHike() {
		System.out.println("Hike for Web Developer " +name+" is "+getSal());
	}

	public void displayTech() {
		System.out.println("Tech used by Android Developer " +name+" is HTML");
		
	}
}