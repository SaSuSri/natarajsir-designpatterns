package com.nt.fp;

public class FamilyCar implements Car {
	private  float price;
	private String model;
	BudgetCar bCar=null;
	
	public FamilyCar(BudgetCar bCar) {
		this.bCar=bCar;
	}
	
	@Override
	public void manifature() {
      bCar.manifature();
	}
	@Override
	public void roadTest() {
		bCar.roadTest();
		
	}
	@Override
	public void deliver() {
	  bCar.deliver();
	}
	
	public void space(){
		System.out.println("More Space is added in car for family");
	}
	

}
