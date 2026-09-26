package org.test.multilevelInheritance;

public class Student extends Employee{
	
	public void clientname() {
		System.out.println("Student Name");
	}
	
	public static void main(String args[]) {
		Student stud=new Student();
		stud.clientname();
		stud.institutename();
		stud.employeename();
	}

}
