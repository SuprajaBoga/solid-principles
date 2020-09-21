package com.principles.dependency;

public class Project {
	Developer d;

	public Project(Developer d) {
		this.d = d;
	}
	public void develop() {
		d.develop();
	}
	
}
