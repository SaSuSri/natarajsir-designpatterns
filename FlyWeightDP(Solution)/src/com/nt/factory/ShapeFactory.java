package com.nt.factory;

import java.util.HashMap;

import com.nt.fwp.Rectangle;
import com.nt.fwp.Shape;
import com.nt.fwp.Square;

import com.nt.fwp.Circle;



public class ShapeFactory{
	 private static HashMap<String,Shape> shapeCache=new HashMap<String,Shape>();

	public synchronized static Shape  getShape(String shapeType){
	          Circle circle=null;
	          Square square=null;
	          Rectangle rectangle=null;
	       if(!shapeCache.containsKey(shapeType)){
	            if(shapeType.equals("circle")){
	                circle=new Circle();
	               shapeCache.put(shapeType,(Shape) circle);
	             }
	           else if(shapeType.equals("square")){
	              square=new Square();
	                shapeCache.put(shapeType,square);
	           }
	          else{
	             rectangle=new Rectangle();
	               shapeCache.put(shapeType,rectangle);
	         }
	       }
	        return shapeCache.get(shapeType);
	 }
}//class