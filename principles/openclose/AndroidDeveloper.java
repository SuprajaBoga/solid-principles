package com.principles.openclose;

public class AndroidDeveloper extends Developer{
	
	public AndroidDeveloper(String name,double sal) {
		super(name,sal);
	}

	public void displayHike() {
		System.out.println("Hike for Android Developer " +name+" is "+getSal());
	}
	
}
