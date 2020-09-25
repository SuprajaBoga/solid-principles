package com.principles.dependency;

public class WebDeveloper implements IDeveloper{

	@Override
	public void develop() {
		//displayJavascript();
		displayReact();
		
	}

	private void displayReact() {
		System.out.println("using react");	
		
	}

	public void displayJavascript() {
		System.out.println("using javascript");	
	}
	
}
