package com.nt.fp;

public class BudgetCar implements Car {
	private  float price;
	private String model;
	@Override
	public void manifature() {
     System.out.println("Budget Car is Assembled...");
		
	}
	@Override
	public void roadTest() {
		System.out.println("Budget Car is RoadTested....");
		
	}
	@Override
	public void deliver() {
		System.out.println("Budget Car is ready to Deliver....");
		
	}
	

}
