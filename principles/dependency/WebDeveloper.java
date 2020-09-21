package com.principles.dependency;

public class WebDeveloper implements Developer{

	@Override
	public void develop() {
		//writeJavascript();
		writeReact();
		
	}

	private void writeReact() {
		System.out.println("using react");	
		
	}

	public void writeJavascript() {
		System.out.println("using javascript");	
	}
	
}
