package com.pluralsight.practice;

public class Constructors {

	//fields & methods elided for clarity
	
	public Constructors() { 
		
	}
	public Constructors(int freeBags) {
		this.freeBags = freeBags;
	}
	public Constructors(int freeBags, int checkedBags) {
		this(freeBags);
		this.checkedBags = checkedBags;
	}
}
