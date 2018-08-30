package com.nt.dcp;

public class DryFruitVanilaIceCream extends VanilaIceCream {
	  public void prepare(){
	      super.prepare();
	      addDryFruits();
	      }
	   private void addDryFruits(){
	         System.out.println("adding dryfruits");
	       }
}//class
