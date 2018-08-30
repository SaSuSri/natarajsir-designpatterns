package com.nt.dcp;

public abstract class IceCreamDecorator implements IceCream{
	  private IceCream iceCream;
	  public IceCreamDecorator(IceCream iceCream){
	       this.iceCream=iceCream;
	   }
	  public void prepare(){
	   iceCream.prepare();
	   }
	}