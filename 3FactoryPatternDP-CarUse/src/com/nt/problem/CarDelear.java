package com.nt.problem;

import com.nt.fp.BudgetCar;
import com.nt.fp.Car;
import com.nt.fp.FamilyCar;
import com.nt.fp.SportsCar;

public class CarDelear {

	public static void main(String[] args) {
		Car bCar=null,sCar=null,sCar1=null,lCar=null,bCar1=null,fCar=null;
		//arrange Budget Car
		bCar=new BudgetCar();
		bCar.manifature();bCar.roadTest();bCar.deliver();
		System.out.println("........................................");
		//arrange Sports Car
		sCar=new SportsCar();
		sCar.manifature();sCar.roadTest();sCar.deliver();
		System.out.println("........................................");
		//arrange 1 more Sports Car
		sCar1=new SportsCar();
		sCar1.manifature();sCar1.roadTest();sCar1.deliver();
		System.out.println("........................................");
		//arrange 1 Familty Car
		bCar1=new BudgetCar();
		fCar=new FamilyCar((BudgetCar)bCar1);
		fCar.manifature();fCar.roadTest();fCar.deliver();((FamilyCar)fCar).space();
	}//main
}//class
