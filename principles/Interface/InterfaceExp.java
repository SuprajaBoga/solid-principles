package com.principles.Interface;

public class InterfaceExp {

	public static void main(String[] args) {
		
		AndroidDeveloper androiddev= new AndroidDeveloper("developer");
		androiddev.displaySkills();
		androiddev.displayCustomer();
		
		WebDeveloper webdev= new WebDeveloper("developer");
		webdev.displaySkills();
	}

}
