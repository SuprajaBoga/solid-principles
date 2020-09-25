package com.principles.dependency;

public class Dependency {

	public static void main(String[] args) {
		WebDeveloper webDeveloper = new WebDeveloper();
		Project project=new Project(webDeveloper);
		project.develop();
	}

}
