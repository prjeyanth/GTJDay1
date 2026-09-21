package org.college;

public class College {
	
	// Request : collegeName(),collegeCode(),collegeRank()
	// Logic : Create an object for all 4 classes  inside the College class and call all classes methods also follow the all coding standards.
	//Method 1:
	public void collegeName() {
		System.out.println("College Name is REC");
	}
	
	//Method 2:
	public void collegeCode() {
		System.out.println("College Code is TNCA0065");		
	}
	
	//Method 3:
	public void collegeRank() {
		System.out.println("College Rank is KANCHEEPURAM05");
	}
	
	public static void main(String[] args) {
		
		//Object creation
		College clg = new College();
		//Calling Method 1
		clg.collegeName();
		//Calling Method 2
		clg.collegeCode();
		//Calling Method 3
		clg.collegeRank();
		
		// Student Class Creation
		Student clgstd=new Student();
		clgstd.studentName();
		clgstd.studentDept();
		clgstd.studentId();
		
		// Hostel Class Creation
		Hostel clghstl=new Hostel();
		clghstl.hostelName();
		
		// Dept Class Creation
		Dept clgdep = new Dept();
		clgdep.deptName();
		
	}

}
