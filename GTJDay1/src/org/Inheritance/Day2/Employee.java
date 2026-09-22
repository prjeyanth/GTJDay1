package org.Inheritance.Day2;

public class Employee extends Office {
	
	public void empname() {
		System.out.println("Employee Name is Rooban Jeyanth");
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empname();
		emp.officeSite();
	}

}
