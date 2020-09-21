package com.principles.openclose;

public abstract class Developer {
	public String name;
	private double sal;

	public Developer(String name,double sal) {
		this.name = name;
		this.sal=sal;
	}
	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public abstract void displayHike();
	/*public void displayHike() {
	 * 
	 if(developer=="web")
		System.out.println("Hike for Web Developer " +name+" is "+getSal());
	 else if(developer=="android")
		System.out.println("Hike for Android Developer " +name+" is "+getSal());
	}*/
	
}
