package org.emp;

public class Employee2 {
	
	// Request : empId(),empName(),empDob(),empPhone(),empEmail(),empAddress()
	// Logic: Create a Method Name and Print it.
	
	// Method 1:
	public void empId() {
		System.out.println("empId is 001");
	}
	//Method 2:
	public void empName() {
		System.out.println("empName is Rooban Jeyanth");
	}
	//Method 3:
	public void empDob() {
		System.out.println("empDob is 22-Sep-2026");
	}
	//Method 4:
	public void empPhone() {
		System.out.println("empPhone is +91 7708103638");
	}
	//Method 5:
	public void empEmail() {
		System.out.println("empEmail is prjeyanth@gmail.com");
	}
	//Method 6:
	public void empAddress() {
		System.out.println("empAddress is West Tambaram, Chennai");
	}
	
	public static void main(String[] args) {
		
		//Object Creation
		Employee2 emp = new Employee2();
		//Using Object calling Method empId()
		emp.empId();
		//Using Object calling Method empName()
		emp.empName();
		//Using Object calling Method empDob()
		emp.empDob();
		//Using Object calling Method empPhone()
		emp.empPhone();
		//Using Object calling Method empEmail()
		emp.empEmail();
		//Using Object calling Method empAddress()
		emp.empAddress();
		
		//Question 6 of Day 1 Training website.
		
		System.out.println("***Question 6***");
		
		emp.empName();
		
		//Object Creation from org.company
		org.company.CompanyInfo cmp=new org.company.CompanyInfo();
		cmp.companyName();
		
		//Object Creation from org.client
		org.client.Client client=new org.client.Client();
		client.clientName();
		
		// Object Creation from org.project
		org.project.Project prj = new org.project.Project();
		prj.projectName();
		
	}
	
	
}
