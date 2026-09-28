package org.test.hierarchialInheritance;

public class Course extends Institute{

	public void coursename() {
		System.out.println("Course name is Java");
	}
	
	public static void main (String args[]) {
		Course crs = new Course();
		crs.coursename();
		crs.institutename();
	}
}
