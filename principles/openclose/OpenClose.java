package com.principles.openclose;

public class OpenClose {

	public static void main(String[] args) {
		
		Developer androidDeveloper= new AndroidDeveloper("developer",2000);
		DeveloperHike hike = new DeveloperHike(androidDeveloper);
		androidDeveloper.setDeveloperSalary(hike.calculateHike(40));
		androidDeveloper.displayHike();
		
		Developer webDeveloper= new WebDeveloper("developer",2000);
		hike =new DeveloperHike(webDeveloper);
		webDeveloper.setDeveloperSalary(hike.calculateHike(60));
		webDeveloper.displayHike();
		
	}

}
