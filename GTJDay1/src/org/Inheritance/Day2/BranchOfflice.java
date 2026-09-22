package org.Inheritance.Day2;

public class BranchOfflice extends Company{
	
	public void branchLocation() {
        System.out.println("Branch Location is in Bengaluru");
	}

	public static void main(String[] args) {
		
		BranchOfflice branch = new BranchOfflice();
		branch.branchLocation();
		branch.Company1();

	}

}
