package com.principles.dependency;

public class AndroidDeveloper implements IDeveloper {

	@Override
	public void develop() {
		displayJava();
		displayAndroidStudio();
	}

	private void displayAndroidStudio() {
		System.out.println("using android studio");
		
	}

	private void displayJava() {
		System.out.println("using java");
		
	}

}
