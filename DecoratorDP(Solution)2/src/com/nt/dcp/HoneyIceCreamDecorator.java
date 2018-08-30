package com.nt.dcp;

public class HoneyIceCreamDecorator extends IceCreamDecorator {

	public HoneyIceCreamDecorator(IceCream iceCream) {
		super(iceCream);
	}
	
	 public void prepare(){
	     super.prepare();
	      addHoney();
	   }
	  public void addHoney(){
	     System.out.println("adding Honey");
	   }

}
