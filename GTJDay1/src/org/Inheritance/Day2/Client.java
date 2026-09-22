package org.Inheritance.Day2;

public class Client extends Employee{
	
	public void clientname() {
		
		System.out.println("Client Name is Greens Technology");
	}
	
	public static void main(String[] args) {
		
		Client cli = new Client();
		cli.clientname();
		cli.empname();
		cli.officeSite();
		cli.Company1();
		cli.Company2();
		cli.Company3();
	}

}
