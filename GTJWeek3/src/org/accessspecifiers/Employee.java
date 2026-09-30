package org.accessspecifiers;

public class Employee extends Client{

	public static void main(String[] args) {
		Client cli=new Client();
		cli.education();
		cli.location();
		System.out.println("Age is "+cli.age);
		System.out.println("Employee Gender is "+cli.gen);
	}
}
