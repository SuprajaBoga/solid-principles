package com.principles.dependency;

public class Project {
	IDeveloper developer;

	public Project(IDeveloper developer) {
		this.developer = developer;
	}
	public void develop() {
		developer.develop();
	}
	
}
