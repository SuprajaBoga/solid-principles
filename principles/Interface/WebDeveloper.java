package com.principles.Interface;

public class WebDeveloper implements ISkills{
	public String developerName;
	
	public WebDeveloper(String developerName) {
		this.developerName = developerName;
	}

	public void displaySkills() {
		System.out.println("Web Developer "+developerName+"'s skills are HTML,CSS,Javascript");
	}

	
}