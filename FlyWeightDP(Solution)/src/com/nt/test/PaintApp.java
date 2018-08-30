package com.nt.test;

import com.nt.factory.ShapeFactory;
import com.nt.fwp.Circle;
import com.nt.fwp.Rectangle;
import com.nt.fwp.Square;

public class PaintApp {
	public static void main(String args[]) {
		int NUMBER_OF_SHAPES = 50;
		Circle circle = null;
		Square square = null;
		Rectangle rectangle=null;

		for (int i = 0; i < NUMBER_OF_SHAPES; ++i) {

			circle = (Circle) ShapeFactory.getShape("circle");
			if (i % 2 == 0) {
				circle.draw((i + 1) * 20, "red", "dotted", "blue", (i + 1) * 2);
			} else {
				circle.draw((i + 1) * 30, "green", "dashed", "yellow", (i + 1) * 3);
			}
		}
		System.out.println("................................................");

		for (int i = 0; i < NUMBER_OF_SHAPES; ++i) {

			square = (Square) ShapeFactory.getShape("square");
			if (i % 2 == 0) {
				square.draw((i + 1) * 20, "red", "dotted", "blue", (i + 1) * 2);
			} else {
				square.draw((i + 1) * 30, "green", "dashed", "yellow", (i + 1) * 3);
			}
		}
		System.out.println("................................................");

		for (int i = 0; i < NUMBER_OF_SHAPES; ++i) {

			rectangle = (Rectangle) ShapeFactory.getShape("rectangle");
			if (i % 2 == 0) {
				rectangle.draw((i + 1) * 20,(i+1)*30, "red", "dotted", "blue", (i + 1) * 2);
			} else {
				rectangle.draw((i + 1) * 30,(i+1)*40, "green", "dashed", "yellow", (i + 1) * 3);
			}
		}
		System.out.println("................................................");

	}// main
}// class
