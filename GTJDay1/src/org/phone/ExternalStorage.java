package org.phone;

public class ExternalStorage {
	
	// Request : Size
	// Logic : Create an object for ExternalStorage and InternalStorage inside the InternalStorage class and call both classes methods also follow the all coding standards.
	
	// Method 1
	public void size() {
		System.out.println("Size is 256 GB ROM");
	}
	
	public static void main(String[] args) {
		//Object Name creation
		ExternalStorage extstg = new ExternalStorage();
		extstg.size();
	}
}
