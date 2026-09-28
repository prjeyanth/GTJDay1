package org.bank;

public class AxisBank extends BankInfo {

	@Override
	public void deposit() {
		System.out.println(" Your Deposit minimum balance should be Rs. 3000");
	}

	public static void main(String args[]) {
		
		System.out.println("Without Upcasting");
		AxisBank ab=new AxisBank();
		ab.deposit();
		System.out.println("   ");
		System.out.println("With Upcasting");
		BankInfo bi= new AxisBank();
		bi.deposit();
	}

}
