package org.water;

public class Water {
	// Request : boat(), ship()
	// Logic : Create a method based on the Request and print the value

	// Method 1:
	public void boat() {
		System.out.println("Took boat for commute");
	}
	
	public void ship() {
		System.out.println("Took Ship for commute");
	}

	public static void main(String[] args) {
		// Object Creation
		Water wr = new Water();
		// Calling First Method
		wr.boat();
		wr.ship();
	}
}
