package com.principles.dependency;

public class AndroidDeveloper implements Developer {

	@Override
	public void develop() {
		writeJava();
		writeAndroidStudio();
	}

	private void writeAndroidStudio() {
		System.out.println("using android studio");
		
	}

	private void writeJava() {
		System.out.println("using java");
		
	}

}
