package com.nt.test;

import com.nt.fmp.BajajChennaiFactory;
import com.nt.fmp.Bike;

public class SouthConsumer {
	public static void main(String[] args) {
		Bike bike =null;
		// get Bike
		bike=BajajChennaiFactory.createBike("pulsor");
		bike.drive();
		
	}

}
