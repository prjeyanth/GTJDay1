package org.q8.scanner;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {

		Scanner io = new Scanner(System.in);
		System.out.println("Enter Student Id:");
		int sid = io.nextInt();
		System.out.println("Student Id: " + sid);
		System.out.println("Enter Student Name:");
		io.nextLine();
		String sname = io.nextLine();
		System.out.println("Name: "+sname);
		System.out.println("Enter the Student Phone Number:");
		long phno =io.nextLong();
		System.out.println("Phone Number: "+phno);
		System.out.println("Enter Student Dept:");
		io.nextLine();
		String sdname = io.nextLine();
		System.out.println("Name: "+sdname);
		System.out.println("Enter the Student Gender (M/F/T):");
		char gen=io.next().charAt(0);
		System.out.println("Enter the Student City:");
		io.nextLine();
		String city = io.nextLine();
		System.out.println("City: "+city);
	}
}
