package org.add;

public class GreensTech {

	// Request : greensOmr(),greensAdayar(),greensTambaram(),greensVelacherry(),greensAnnaNagar()
	// Logic : Create a method based on the Request and print the value
	
	//Method 1:
	public void greensOmr() {
		System.out.println("OMR");
	}
	//Method 2:
	public void greensAdayar() {
		System.out.println("Adayar");
	}
	//Method 3:
	public void greensTambaram() {
		System.out.println("Tambaram");
	}
	//Method 4:
	public void greensVelacherry() {
		System.out.println("Velacherry");
	}
	//Method 5:
	public void greensAnnaNagar() {
		System.out.println("Anna Nagar");
	}
	
	public static void main(String[] args) {
		//Object Creation
		GreensTech gt = new GreensTech();
		//Calling First Method greensOMR
		gt.greensOmr();
		//Calling Second Method greensAdayar
		gt.greensAdayar();
		//Calling Third Method greensTambaram
		gt.greensTambaram();
		//Calling Fourth Method greensVelacherry
		gt.greensVelacherry();
		//Calling Fifth Method greensAnnaNagar
		gt.greensAnnaNagar();
	}
}
