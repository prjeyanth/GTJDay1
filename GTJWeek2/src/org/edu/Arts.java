package org.edu;

public class Arts extends Engineering{
	
	public void bsc() {
		System.out.println("Bachelor of Science");
	}
	public void bEd() {
		System.out.println("Bachelor of Education");
	}
	public void bA() {
		System.out.println("Bachelor of Arts");
	}
	public void bBA() {
		System.out.println("Bachelor of Business Administration");		
	}
	
	public static void main(String[] args) {
		
		Arts at = new Arts();
		at.bA();
		at.bBA();
		at.bEd();
		at.bsc();
		at.bE();
		at.bTech();
		at.mbbs();
		at.dental();
		
	}

}
