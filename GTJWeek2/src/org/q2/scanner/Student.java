package org.q2.scanner;

import java.util.Scanner;

public class Student {
	
	public static void main(String[] args) {
		
		Scanner io = new Scanner(System.in);
		System.out.println("Enter Student Id:");
		int sid=io.nextInt();
		System.out.println("Student Id: "+sid);
		System.out.println("Enter Student Name:");
		io.nextLine();
		String sname=io.nextLine();
		System.out.println("Student Name: "+sname);
		System.out.println("Enter Mark 1");
		short m1=io.nextShort();
		System.out.println("Enter Mark 2");
		short m2=io.nextShort();
		System.out.println("Enter Mark 3");
		short m3=io.nextShort();
		System.out.println("Enter Mark 4");
		short m4=io.nextShort();
		System.out.println("Enter Mark 5");
		short m5=io.nextShort();
		float avg = (m1+m2+m3+m4+m5)/5;
		System.out.println("Average is:" +avg);
	}

}
