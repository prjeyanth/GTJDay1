package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {

	// Request : TransportForm()
	// Logic : Create a method based on the Request and print the value

	// Method 1:
	
	public void TransportForm() {
		System.out.println("Here is your Transport Form");
	}

	public static void main(String[] args) {
		// Object Creation
		Transport trp = new Transport();
		// Calling First Method
		trp.TransportForm();
		// Object Creation with Different Package
		Road rd = new Road();
		// Calling  Method
		rd.bike();
		rd.cycle();
		rd.bus();
		rd.car();
		// Object Creation with Different Package
		Air ar = new Air();
		// Calling First Method
		ar.aeroPlane();
		ar.heliCopter();
		Water wr = new Water();
		// Calling First Method
		wr.boat();
		wr.ship();
	}

}
