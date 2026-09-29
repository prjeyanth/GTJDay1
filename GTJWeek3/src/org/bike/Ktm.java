package org.bike;

public class Ktm implements Bike {

	public static void main(String[] args) {
		Ktm ktmb= new Ktm();
		ktmb.cost();
		ktmb.speed();

	}

	@Override
	public void cost() {
		System.out.println("Cost of the KTM bike is 1.4L INR");
		
	}

	@Override
	public void speed() {
		System.out.println("0-100 Kms is under 3.5 Seconds");
		
	}

}
