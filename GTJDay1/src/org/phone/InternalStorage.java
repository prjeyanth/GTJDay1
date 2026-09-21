package org.phone;

public class InternalStorage {
	
	// Logic : Create an object for ExternalStorage and InternalStorage inside the InternalStorage class and call both classes methods also follow the all coding standards.
	
		// Method 1:
		public void processorName() {
			System.out.println("ProcessorName is SnapDragon 5");
		}
		
		//Method 2:
		public void ramSize() {
			System.out.println("RAM Size is 8 GB");
		}
		
		public static void main(String[] args) {
			//Object Name creation
			InternalStorage intstg = new InternalStorage();
			//Calling Method name processorName
			intstg.processorName();
			//Calling Method name ramSize()
			intstg.ramSize();
			
			//Object Name Creation for different Class
			ExternalStorage extstg=new ExternalStorage();
			extstg.size();
		}

}
