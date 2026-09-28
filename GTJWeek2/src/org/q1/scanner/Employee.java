package org.q1.scanner;

import java.util.Scanner;

public class Employee {

	
	public static void main(String[] args) {

		Scanner io = new Scanner(System.in);
		
		System.out.println("Enter the Employee Details");
		System.out.println("  ");
		System.out.println("Enter the Employee Id:");
		int empId = io.nextInt();
		System.out.println("Employee Id: " + empId);
		io.nextLine();
		System.out.println("Enter the Employee Name:");
		String empName = io.nextLine();
		System.out.println("Employee Name: "+ empName);
		System.out.println("Enter the Employee email:");
		String empEmail = io.next();
		System.out.println("Email: "+empEmail);
		System.out.println("Enter the Employee Phone Number:");
		long phno =io.nextLong();
		System.out.println("Phone Number: "+phno);
		System.out.println("Enter the Employee Salary:");
		short sal=io.nextShort();
		System.out.println("Salary: "+sal);
		System.out.println("Enter the Employee Gender (M/F/T):");
		char gen=io.next().charAt(0);
		System.out.println("Enter the Employee City:");
		io.nextLine();
		String city = io.nextLine();
		System.out.println("City: "+city);
		

	}

}
