package com.principles.substitute;

public class AndroidDeveloper extends Developer{
	
	public AndroidDeveloper(String name, double sal) {
		super(name, sal);
	}

	public void displayHike() {
		System.out.println("Hike for Android Developer " +name+" is "+getSal());
	}

	public void displayTech() {
		System.out.println("Tech used by Android Developer " +name+" is PHP");
		
	}
	

}
