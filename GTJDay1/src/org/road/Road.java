package org.road;

public class Road {

	// Request : bike(),cycle(),bus(),car()
	// Logic : Create a method based on the Request and print the value

	// Method 1:
	
	public void bike() {
		System.out.println("You have rode a bike");
	}
	public void cycle() {
		System.out.println("You have rode a cycle");
	}
	public void bus() {
		System.out.println("You have boarded a bus");
	}
	public void car() {
		System.out.println("You have drove a car");
	}

	public static void main(String[] args) {
		// Object Creation
		Road rd = new Road();
		// Calling First Method
		rd.bike();
		rd.cycle();
		rd.bus();
		rd.car();
	}

}
