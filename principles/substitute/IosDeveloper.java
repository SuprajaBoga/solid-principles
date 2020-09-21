package com.principles.substitute;

public class IosDeveloper implements GetTech{

	public String name;
	private double sal;

	public IosDeveloper(String name , double sal) {
		this.name = name;
		this.sal = sal;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}

	public void displayTech() {
		System.out.println("Tech used by Android Developer " +name+" is Swift");
		
	}
}
