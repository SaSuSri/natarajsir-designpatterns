package com.nt.fwp;

public class Circle implements Shape{
	 //intrinsic state
	 private String label="circle";
	 public Circle() {
		System.out.println("Circle:0-paaram constructor");
	}
	
	public void draw(int radius,String fillColor,String lineStyle,
	                                                                     String lineColor,int lineSize){
	  System.out.println( "Drawing "+label +"with" +radius +" having fillColor"+fillColor+
	               "lineStyle"+lineStyle+"lineColor"+lineColor+"lineSize"+lineSize);
	  }
	}