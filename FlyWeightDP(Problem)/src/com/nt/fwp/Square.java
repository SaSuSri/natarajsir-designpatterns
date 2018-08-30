package com.nt.fwp;

public class Square implements Shape {
	private String label;
	private int side;
	private String fillColor;
	private String lineStyle;
	private String lineColor;
	private int lineSize;
	

	public Square() {
		System.out.println("Square:0-param constructor");
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
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

	// setters and getters
	public void draw() {
		System.out.println("Drawing " + label + "with side:" + side + " having fillColor" + fillColor + "lineStyle" + lineStyle
				+ "lineColor" + lineColor + "lineSize" + lineSize);
	}
}
