package org.scanner;

import java.util.Scanner;

public class ScannerDataType {

	public static void main(String[] args) {

		Scanner io = new Scanner(System.in);

		// String
		// Accepts Space
		System.out.println("Enter your Full Name with Initial at First:");
		String name = io.nextLine();
		System.out.println("Full Name" + name);
		// Character
		char intial = name.charAt(0);
		System.out.println("Inital :" + intial);
		// Accepts before Space
		System.out.println("");
		System.out.println("Enter First Name:");
		String flname = io.next();
		System.out.println("First Name " + flname);
		// Byte - Age
		System.out.println("");
		System.out.println("Enter your age:");
		byte age = io.nextByte();
		System.out.println("Age:" + age);
		// Short - Dept Id
		System.out.println("");
		System.out.println("Enter your Dept Id:");
		short deptid = io.nextShort();
		System.out.println("Dept Id:" + deptid);
		// Integer - Employee Id
		System.out.println("");
		System.out.println("Enter your Employee Id:");
		int empid = io.nextInt();
		System.out.println("Employee Id:" + empid);
		// Long - Mobile Number
		System.out.println("");
		System.out.println("Enter your mobile number:");
		long phno = io.nextLong();
		System.out.println("mobile number:" + phno);
		// Float - Weight
		System.out.println("");
		System.out.println("Enter your Weight:");
		float weight = io.nextFloat();
		System.out.println("Weight :" + weight);
		// Double - Salary
		System.out.println("");
		System.out.println("Enter your salary:");
		double sal = io.nextDouble();
		System.out.println("Salary:" + sal);
		// Boolean - Location
		System.out.println("");
		System.out.println("Enter your validation as True of False if your location is chennai):");
		boolean loc = io.nextBoolean();
		System.out.println("Location - Chennai:" + loc);

	}

}
