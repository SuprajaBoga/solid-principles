package com.principles.Interface;

public class AndroidDeveloper implements ISkills,ICustomer{
	public String developerName;

	public AndroidDeveloper(String developerName) {
		this.developerName=developerName;
		
	}

	
	public void displayCustomer() {
		System.out.println("Android Developer "+developerName+" is working for Google");
		
	}

	
	public void displaySkills() {
		System.out.println("Android Developer " +developerName+ "'s skills are PHP,SQL,XML,Android Studio");
		
	}
	
	
	
}
