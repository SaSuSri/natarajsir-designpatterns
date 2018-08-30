package com.nt.fwp;

public class Rectangle implements Shape {
	 private String label;
	 private int length;
	 private int breadth;
	 private String fillColor;
	 private String lineStyle;
	 private String lineColor;
	 private int lineSize;
	 
	 public Rectangle() {
		System.out.println("Rectangle:0-param constructor");
	}
	//setters and getters

	 public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineStyle() {
		return lineStyle;
	}

	public void setLineStyle(String lineStyle) {
		this.lineStyle = lineStyle;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public int getLineSize() {
		return lineSize;
	}

	public void setLineSize(int lineSize) {
		this.lineSize = lineSize;
	}

	public void draw(){
	   System.out.println( "Drawing "+label +"with length" +length +" and breadth"+breadth+" having fillColor"+fillColor+
	               "lineStyle"+lineStyle+"lineColor"+lineColor+"lineSize"+lineSize);
	  }//method
}//class
