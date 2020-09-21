package com.principles.Interface;

public class WebDeveloper implements DisplaySkills{
	public String name;
	
	public WebDeveloper(String name) {
		this.name = name;
	}

	public void displaySkills() {
		System.out.println("Web Developer's skills are HTML,CSS,Javascript");
	}

	
}