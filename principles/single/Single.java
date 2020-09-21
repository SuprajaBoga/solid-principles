package com.principles.single;

public class Single {

	public static void main(String[] args) {
		Developer dev= new Developer("Harry",2000);
		CalculateHike hike =new CalculateHike(dev);
		dev.setSal(hike.calculateHike());
		System.out.println(dev);
	}

}
