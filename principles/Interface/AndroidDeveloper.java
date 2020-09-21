package com.principles.Interface;

public class AndroidDeveloper implements DisplaySkills,DisplayCustomer{
	public String name;

	public AndroidDeveloper(String name) {
		this.name=name;
		
	}

	
	public void displayCustomer() {
		System.out.println("Android Developer is working for Google");
		
	}

	
	public void displaySkills() {
		System.out.println("Android Developer's skills are PHP,SQL,XML,Android Studio");
		
	}
	
	
	
}
