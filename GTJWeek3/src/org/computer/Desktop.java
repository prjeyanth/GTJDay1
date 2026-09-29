package org.computer;

public class Desktop implements Software,Hardware {

	@Override
	public void hardwareResources() {
		System.out.println("Intel i7 Processor");
		
	}

	@Override
	public void softwareResources() {
		System.out.println("Linux");
		
	}
	
	public static void main(String[] args) {
		Desktop dsktp=new Desktop();
		dsktp.hardwareResources();
		dsktp.softwareResources();
	}

}
