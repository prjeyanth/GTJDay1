package org.edu;

public class Education extends Arts{
	
	public void ug() {
		System.out.println("Under Graduate");
	}
	public void pg() {
		System.out.println("Post Graduate");
	}
	
	public static void main(String args[]) {
		Education edu = new Education();
		edu.ug();
		edu.pg();
		edu.bsc();
		edu.bEd();
		edu.bA();
		edu.bBA();
		edu.bE();
		edu.bTech();
		edu.physiyo();
		edu.dental();
		edu.mbbs();
	}

}
