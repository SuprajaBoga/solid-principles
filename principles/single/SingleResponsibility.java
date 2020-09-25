package com.principles.single;

public class SingleResponsibility {

	public static void main(String[] args) {
		Developer developer= new Developer("Harry",2000);
		Hike hike = new Hike(developer);
		developer.setDeveloperSalary(hike.calculateHike());
		developer.displayDeveloperHike();
	}

}
