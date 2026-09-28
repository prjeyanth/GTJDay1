package org.bank;

public class BankInfo {

	public void saving() {
		System.out.println(" Your Account type is Savings ");
	}
	
	public void fixed() {
		System.out.println(" Your fixed deposit is 5% ");
	}
	
	public void deposit() {
		System.out.println(" Your Deposit minimum balance should be Rs. 10000");
	}
	
	public static void main(String args[]) {
		BankInfo bi= new BankInfo();
		bi.saving();
		bi.fixed();
		bi.deposit();
	}
}
