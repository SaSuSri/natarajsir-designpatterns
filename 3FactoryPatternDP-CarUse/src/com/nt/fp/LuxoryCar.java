package com.nt.fp;

public class LuxoryCar implements Car {
	private  float price;
	private String model;
	@Override
	public void manifature() {
     System.out.println("Luxory Car is Assembled....");
		
	}
	@Override
	public void roadTest() {
		System.out.println("Luxory Car is RoadTested....");
		
	}
	@Override
	public void deliver() {
		System.out.println("Luxory Car is ready to  Deliver....");
		
	}
	

}
