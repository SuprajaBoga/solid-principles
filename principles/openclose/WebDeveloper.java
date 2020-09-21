package com.principles.openclose;

public class WebDeveloper extends Developer{

	public WebDeveloper(String name, double sal) {
		super(name, sal);
	}
	public void displayHike() {
		System.out.println("Hike for Web Developer " +name+" is "+getSal());
	}
}