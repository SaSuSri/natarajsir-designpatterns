package com.nt.dcp;

public class DryFruitHoneyVanialaIceCream extends VanilaIceCream {
	
	@Override
	public void prepare() {
		super.prepare();
		addDryFruits();
		addHoney();
	}
	
	private void addDryFruits(){
		System.out.println("Adding dryFruits");
	}
	private void addHoney(){
		System.out.println("Adding Honey");
	}
}//class
