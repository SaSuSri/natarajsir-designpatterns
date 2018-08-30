package com.nt.solution;

import com.nt.fp.Car;

public class CarDealer {
	public static void main(String[] args) {
		Car bCar=null,fCar=null;
		//get BudgetCar
		bCar=CarFactory.getCar("budget");
		System.out.println("..................................");
	    //get FamilyCar 
		fCar=CarFactory.getCar("family");
	}
}
