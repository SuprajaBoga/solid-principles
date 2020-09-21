package com.principles.single;

public class Developer{
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
	
	public String toString() {
		return "Hike for Developer " +name+" is "+getSal();
	}
	
}
