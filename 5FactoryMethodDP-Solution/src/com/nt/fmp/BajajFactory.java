package com.nt.fmp;

public abstract class BajajFactory {
	public abstract void assemble();
	public abstract void paint();
	public abstract void oiling();
	public abstract void machineTest();
	public abstract void roadTest();
	public abstract void deliver();
	public abstract  Bike createBike(String type);
	public  Bike orderBike(String type){
		Bike bike=null;
		bike=createBike(type);
		assemble();
		paint();
		oiling();
		machineTest();
		roadTest();
		deliver();
		return bike;
	}

}
