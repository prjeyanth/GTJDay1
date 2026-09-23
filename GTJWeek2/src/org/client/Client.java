package org.client;

import org.company.Company;

public class Client extends Company {
	
	public void clientName() {
		System.out.println("Client Name is Greens");
	}
	
	public static void main(String[] args) {
		Client cli=new Client();
		cli.companyName();
		cli.clientName();
	}

}
