package com.nt.fwp;

public class Circle implements Shape {
	private String label;
	 private int radius;
	 private String fillColor;
	 private String lineStyle;
	 private String lineColor;
	 private int lineSize;
	 public Circle() {
		System.out.println("Circle: 0-param consturctor");
	}
	//setters and getters
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
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
		   System.out.println( "Drawing "+label +"with" +radius +" having fillColor"+fillColor+
		               "lineStyle"+lineStyle+"lineColor"+lineColor+"lineSize"+lineSize);
		  }
  }//class
