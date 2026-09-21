package org.air;

public class Air {

	// Request : aeroPlane(),heliCopter()()
	// Logic : Create a method based on the Request and print the value

	// Method 1:
	public void aeroPlane() {
		System.out.println("You have boarded a Flight");
	}
	
	//Method 2:
	public void heliCopter() {
		System.out.println("You have boarded a Helicopter");
	}

	public static void main(String[] args) {
		// Object Creation
		Air ar = new Air();
		// Calling First Method
		ar.aeroPlane();
		ar.heliCopter();
	}

}
