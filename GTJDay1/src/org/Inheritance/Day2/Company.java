package org.Inheritance.Day2;

public class Company {
	
	public void Company1() {
		System.out.println("CTS");
	}
	public void Company2() {
		System.out.println("TCS");
	}
	public void Company3() {
		System.out.println("UTS");
	}
	
	public static void main(String[] args) {
		Company cmp = new Company();
		cmp.Company1();
		cmp.Company2();
		cmp.Company3();
		
	}

}
