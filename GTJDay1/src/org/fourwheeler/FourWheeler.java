package org.fourwheeler;

public class FourWheeler {
	
	// Request : car(),bus(),lorry()

	// Logic : Create an object for all 4 classes  inside the Vehicle class and call all classes methods also follow the all coding standards.   

	//Method 1:
	public void car() {
		System.out.println("Car brand is Suzuki");
	}
	
	//Method 2:
	public void bus() {
		System.out.println("Bus brand is Tata");
	}
	
	//Method 3:
	public void lorry() {
		System.out.println("Lorry brand is Mack");
	}

	public static void main(String[] args) {
		//Object Creation
		FourWheeler fw = new FourWheeler();
		//Calling Method 1
		fw.car();
		//Calling Method 2
		fw.bus();
		//Calling Method 3
		fw.lorry();
	
	}

}
