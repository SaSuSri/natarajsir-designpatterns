package com.nt.dcp;

public class HoneyVanilaIceCream extends VanilaIceCream {
	  public void prepare(){
	      super.prepare();
	      addHoney();
	      }
	   private void addHoney(){
	         System.out.println("adding Honey");
	       }
}//class
