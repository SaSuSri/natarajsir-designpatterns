package com.nt.fp;

public class SportsCar implements Car {
	private  float price;
	private String model;
	@Override
	public void manifature() {
     System.out.println("Sports Car is Assembled....");
		
	}
	@Override
	public void roadTest() {
		System.out.println("Sports Car is RoadTested....");
		
	}
	@Override
	public void deliver() {
		System.out.println("Sports Car is ready to  Deliver....");
		
	}
	

}
