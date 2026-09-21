package org.phone;

public class PhoneInfo {
	
	// Request : phoneName(),phoneMieiNum(),Camera(),storage(),osName()
	// Logic : Create a method based on the Request and print the value
	
	//Method 1:
	public void phoneName() {
		System.out.println("Phone Name is Vivo");
	}
	//Method 2:
	public void phoneMieiNum() {
		System.out.println("Phone IEMI is 1234567890");
	}
	//Method 3:
	public void Camera() {
		System.out.println("Camera is 50 MP");
	}
	//Method 4:
	public void Storage() {
		System.out.println("Storage is 128 GB");
	}
	//Method 5:
	public void osName() {
		System.out.println("os Name is Oxygen");
	}
	
	public static void main(String[] args) {
		//Object Creation using Class Name
		PhoneInfo pi = new PhoneInfo();
		// Calling Method using method phoneName
		pi.phoneName();
		// Calling Method using method phoneMieiNum
		pi.phoneMieiNum();
		// Calling Method using method Camera
		pi.Camera();
		// Calling Method using method Storage
		pi.Storage();
		// Calling Method using method osName
		pi.osName();
	}
}
