package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {
	
	// Request : VehicleNecessery()
	// Logic : Create an object for all 4 classes  inside the Vehicle class and call all classes methods also follow the all coding standards.   

	//Method 1:
	public void VehicleNecessery() {
		System.out.println("Vehicle Necessery for everyone");
	}
	
	public static void main(String[] args) {
		//Object Creation
		Vehicle veh = new Vehicle();
		//Calling Method
		veh.VehicleNecessery();
		
		//Calling Method from different Package
		TwoWheller twh= new TwoWheller();
		twh.bike();
		twh.cycle();
		//Calling Method from different Package
		ThreeWheeler thwh=new ThreeWheeler();
		thwh.auto();
		//Calling Method from different Package
		FourWheeler fwh=new FourWheeler();
		fwh.bus();
		fwh.car();
		fwh.lorry();
	}
}
