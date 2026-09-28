package org.test.hierarchialInheritance;

public class Student extends Institute{
	
	public void clientname() {
		System.out.println("Student Name is Rooban");
	}
	
	public static void main(String args[]) {
		Student stud=new Student();
		stud.clientname();
		stud.institutename();
	}

}
