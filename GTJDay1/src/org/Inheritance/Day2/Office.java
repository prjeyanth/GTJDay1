package org.Inheritance.Day2;

public class Office extends Company{
	
	public void officeSite () {
		System.out.println("Office Location is in Chennai");
	}
	
	public static void main(String[] args) {
		Office ofc = new Office();
		ofc.officeSite();
		
	}

}
