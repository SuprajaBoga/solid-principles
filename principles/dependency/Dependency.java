package com.principles.dependency;

public class Dependency {

	public static void main(String[] args) {
		WebDeveloper d = new WebDeveloper();
		Project p=new Project(d);
		p.develop();
	}

}
