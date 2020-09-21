package com.principles.substitute;

public abstract class Developer implements DisplayHike,GetTech{
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
	public abstract void displayTech();
	
}
