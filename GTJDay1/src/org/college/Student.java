package org.college;

public class Student {
	
	// Request : studentName(),studentDept(),studentId()
	// Logic : Create an object for all 4 classes  inside the College class and call all classes methods also follow the all coding standards.
	// Method 1:
	public void studentName() {
		System.out.println("Student Name is Rooban Jeyanth");
	}
	// Method 2:
	public void studentDept() {
		System.out.println("Student Dept is Software Testing");
	}
	// Method 3:
	public void studentId() {
		System.out.println("Student Id is MSC07016");
	}
	
	public static void main(String[] args) {
		
		//Object creation
		Student std =new Student();
		//Calling First Method 
		std.studentName();
		//Calling Second Method
		std.studentDept();
		//Calling Third Method
		std.studentId();
		
	}

}
