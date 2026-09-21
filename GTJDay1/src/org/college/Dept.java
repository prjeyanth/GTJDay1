package org.college;

public class Dept {
	
	// Request : deptName()
	// Logic : Create an object for all 4 classes  inside the College class and call all classes methods also follow the all coding standards.
	// Method 1:
		public void deptName() {
			System.out.println("Hostel Name is Chirstoper Nolan's Men's Hostel");
		}
		
		public static void main(String[] args) {
			//Object Name
			
			Dept dep = new Dept();
			dep.deptName();
		}

}
