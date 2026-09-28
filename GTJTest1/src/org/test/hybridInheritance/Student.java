package org.test.hybridInheritance;

public class Student extends Employee{
	
	public void clientname() {
		System.out.println("Student Name is Rooban");
	}
	
	public static void main(String args[]) {
		Student stud=new Student();
		stud.clientname();
		stud.institutename();
	}

}
