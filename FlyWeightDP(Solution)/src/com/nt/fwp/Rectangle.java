package com.nt.fwp;
public class Rectangle implements Shape{
 private String label="rectangle";
public Rectangle() {
	System.out.println("Rectangle:0-param cobstructor");
}
 
public void draw(int length,int breadth,String fillColor,
                                                      String lineStyle,String lineColor,int lineSize){
   System.out.println( "Drawing "+label +"with length" +length +" and breadth"+breadth+" having fillColor"+fillColor+
               "lineStyle"+lineStyle+"lineColor"+lineColor+"lineSize"+lineSize);
  }
}