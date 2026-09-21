package org.network;

public class MobileData {

	// Request : dataName()
	// Logic : Create a method based on the Request and print the value

	// Method 1:
	public void dataName() {
		System.out.println("Mobile Data is Airtel");
	}
	
	public static void main(String[] args) {
		// Object Creation
		MobileData md = new MobileData();
		// Calling First Method
		md.dataName();
	}
}
