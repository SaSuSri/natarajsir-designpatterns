package com.nt.dcp;

public class DryFruitIceCreamDecorator extends IceCreamDecorator {
	 public DryFruitIceCreamDecorator(IceCream iceCream){
	       super(iceCream);
	   }
	   public void prepare(){
	     super.prepare();
	     addDryFuits();
	   }
	  public void addDryFuits(){
	     System.out.println("adding Dryfuits");
	   }
}
