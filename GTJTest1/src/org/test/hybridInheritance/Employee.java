package org.test.hybridInheritance;

public class Employee extends Institute{

	public void employeename() {
        System.out.println("Trainer Name is Bhuvanesh");
    }
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.institutename();
		emp.employeename();
	}
}
