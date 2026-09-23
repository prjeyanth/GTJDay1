package org.edu;

public class Medicine {
	
	public void physiyo() {
		System.out.println("Physiso");
	}
	public void dental() {
		System.out.println("Dental");
	}
	public void mbbs() {
		System.out.println("Primilinary Doctor");
	}
	
	public static void main(String[] args) {
		Medicine med = new Medicine();
		med.physiyo();
		med.dental();
		med.mbbs();
	}

}
