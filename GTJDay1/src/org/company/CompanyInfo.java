package org.company;

public class CompanyInfo {
	
	// Request : companyName(),companyId(),companyAddress()
	// Logic : Create a method based on the Request and print the value
	
	//Method 1:
	public void companyName() {
		System.out.println("Company Name is Greens Tech");
	}
	//Method 2:
	public void companyId() {
		System.out.println("Company Id is 2026");
	}
	//Method 3:
	public void companyAddress() {
		System.out.println("Company Address is Bhakathavachlam Road, West Tambaram");
	}
	
	public static void main(String[] args) {
		//Object Creation using Class Name
		CompanyInfo compin = new CompanyInfo();
		// Calling Method using companyName
		 compin.companyName();
		// Calling Method using companyId
		 compin.companyName();
		// Calling Method using companyAddress
		 compin.companyAddress();
	}

}
