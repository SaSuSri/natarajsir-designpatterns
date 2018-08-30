package com.nt.test;

import com.nt.fmp.BajajDelhiFactory;
import com.nt.fmp.Bike;

public class NorthConsumer {

	public static void main(String[] args) {
		Bike bike =null;
		// get Bike
		bike=new BajajDelhiFactory().orderBike("pulsor");
		bike.drive();
	}
	
}
