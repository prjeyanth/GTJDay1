package org.test.singleInheritance;

public class Client extends Company{

	public void clientname() {
		System.out.println("Client Name is Rooban Jeyanth P");
	}
	
	public static void main(String[] args) {
		Client cli = new Client();
		cli.clientname();
		cli.companyname();
	}
}
