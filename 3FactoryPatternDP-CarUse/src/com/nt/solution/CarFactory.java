package com.nt.solution;

import com.nt.fp.BudgetCar;
import com.nt.fp.Car;
import com.nt.fp.FamilyCar;
import com.nt.fp.LuxoryCar;
import com.nt.fp.SportsCar;

public class CarFactory {
	
	public static Car  getCar(String type){
		Car car=null,bCar=null;
		if(type.equalsIgnoreCase("family")){
			bCar=new BudgetCar();
            car=new FamilyCar((BudgetCar)bCar);		
			((FamilyCar)car).space();
		}
		else if(type.equalsIgnoreCase("sports")){
			car=new SportsCar();
		}
		else if(type.equalsIgnoreCase("budget")){
			car=new BudgetCar();
		}
		else if(type.equalsIgnoreCase("luxory")){
			car=new LuxoryCar();
		}
		car.manifature();
		car.roadTest();
		car.deliver();
      return car;
	}

}
