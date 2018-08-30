package com.nt.fwp;

public interface Shape {
	default void draw(int arg0, String fillColor, String lineStyle, String lineColor, int lineSize) {
	}

	default void draw(int length, int breadth, String fillColor, String lineStyle, String lineColor, int lineSize) {
	}
}
