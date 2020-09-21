package com.principles.openclose;

public class OpenClose {

	public static void main(String[] args) {
		
		Developer androiddev= new AndroidDeveloper("developer",2000);
		DeveloperHike hike = new DeveloperHike(androiddev);
		androiddev.setSal(hike.calculateHike(40));
		androiddev.displayHike();
		
		Developer webdev= new WebDeveloper("developer",2000);
		hike =new DeveloperHike(webdev);
		webdev.setSal(hike.calculateHike(60));
		webdev.displayHike();
		
	}

}
