package com.principles.Interface;

public class Interface {

	public static void main(String[] args) {
		
		AndroidDeveloper androidDeveloper= new AndroidDeveloper("Harry");
		androidDeveloper.displaySkills();
		androidDeveloper.displayCustomer();
		
		WebDeveloper webDeveloper= new WebDeveloper("Ron");
		webDeveloper.displaySkills();
	}

}