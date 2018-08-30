package com.nt.dcp;

public class HoneyButterScotchCream extends ButterScotchIceCream {
	  public void prepare(){
	      super.prepare();
	      addHoney();
	      }
	   private void addHoney(){
	         System.out.println("adding Honey");
	       }
}//class
