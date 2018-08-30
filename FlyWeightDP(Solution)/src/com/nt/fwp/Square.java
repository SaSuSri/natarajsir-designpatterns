package com.nt.fwp;

public class Square implements Shape{
 private String label="squre";
//setters and getters
 public Square() {
	System.out.println("Square:0-param constuctor");
}

 public void draw(int side,String fillColor,String lineStyle,
                                                                     String lineColor,int lineSize){
  System.out.println( "Drawing "+label +"with" +side +" having fillColor"+fillColor+
               "lineStyle"+lineStyle+"lineColor"+lineColor+"lineSize"+lineSize);
  }
}