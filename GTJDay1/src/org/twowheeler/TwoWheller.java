package org.twowheeler;

public class TwoWheller {
	
	// Request : bike(),cycle()
	// Logic : Create an object for all 4 classes  inside the Vehicle class and call all classes methods also follow the all coding standards.   

	//Method 1:
	public void bike() {
		System.out.println("Your riding Bike");
		
	}
	
	//Method 2:
	public void cycle() {
		System.out.println("Your riding Cycle");
	}
	
	public static void main(String[] args) {
		//Object Creation
		TwoWheller tw = new TwoWheller();
		//Calling Method
		tw.bike();
		tw.cycle();
	
	}
	
}
