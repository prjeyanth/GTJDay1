package org.network;

public class Lan {

	// Request : lanName()
	// Logic : Create a method based on the Request and print the value

	// Method 1:
	
	public void lanName() {
		System.out.println("Lan Name is Ethernet1");
	}
	
	public static void main(String[] args) {
		Lan ln =new Lan();
		ln.lanName();
	}

}
