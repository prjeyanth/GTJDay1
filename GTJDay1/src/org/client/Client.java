package org.client;

public class Client {
	
	// Request : clientName
	// Logic : Create an object for all 4 classes  inside the Employee class and call all classes methods also follow the all coding standards.
	
	// Method 1
	public void clientName() {
		System.out.println("Client Name is Bosch");
	}
	
	
	public static void main(String[] args) {
		
		//Object Name creation
		Client cli = new Client();
		//Using Object calling Method clientName()
		cli.clientName();
		
	}
	

}
