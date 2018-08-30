package com.nt.test;

import com.nt.fwp.Circle;
import com.nt.fwp.Rectangle;
import com.nt.fwp.Shape;
import com.nt.fwp.Square;

public class PaintApp{
	    public static  void  main(String args[]){
	   int NUMBER_OF_SHAPES=500;
	   Circle circle=null;
	   Square square=null;
	   Rectangle rectangle=null;
	    Shape[] shapes1=null;
	    Shape[] shapes2=null;
	    Shape[] shapes3=null;


	     shapes1=new Circle[ NUMBER_OF_SHAPES];
	   for(int i=0;i<NUMBER_OF_SHAPES;++i){
		    circle=new Circle();
		   shapes1[i]=circle;
	   ((Circle) shapes1[i]).setLabel("circle");
	    ((Circle)shapes1[i]).setRadius((i+1)*20);
	     if(i%2==0){
	      ((Circle)shapes1[i]).setFillColor("red");
	      ((Circle)shapes1[i]).setLineStyle("dotted");
	      ((Circle)shapes1[i]).setLineColor("bule");
	      ((Circle)shapes1[i]).setLineSize((i+1)*2);
	       }
	     else{
	    	  ((Circle)shapes1[i]).setFillColor("green");
	    	  ((Circle)shapes1[i]).setLineStyle("dashed");
	    	  ((Circle)shapes1[i]).setLineColor("black");
	  ((Circle)shapes1[i]).setLineSize((i+1)*3);
	      }	


	     shapes1[i].draw();
	   }
System.out.println("------------------------------------------");
	   shapes2=new Square[ NUMBER_OF_SHAPES];
	   for(int i=0;i<NUMBER_OF_SHAPES;++i){
		   square=new Square();
		   shapes2[i]=square;
	   ((Square) shapes2[i]).setLabel("square");
	   ((Square) shapes2[i]).setSide((i+1)*20);
	     if(i%2==0){
	       ((Square) shapes2[i]).setFillColor("red");
	       ((Square) shapes2[i]).setLineStyle("dotted");
	       ((Square) shapes2[i]).setLineColor("bule");
	       ((Square) shapes2[i]).setLineSize((i+1)*2);
	       }
	     else{
	    	 ((Square) shapes2[i]).setFillColor("green");
	    	 ((Square) shapes2[i]).setLineStyle("dashed");
	    	 ((Square) shapes2[i]).setLineColor("black");
	    	 ((Square) shapes2[i]).setLineSize((i+1)*3);
	      }
	       shapes2[i].draw();
	   }
System.out.println(".........................................................");
	shapes3=new Rectangle[ NUMBER_OF_SHAPES];
	   for(int i=0;i<NUMBER_OF_SHAPES;++i){
		    rectangle=new Rectangle();
		    shapes3[i]=rectangle;
	   ((Rectangle) shapes3[i]).setLabel("Rectangle");
	   ((Rectangle) shapes3[i]).setLength((i+1)*20);
	   ((Rectangle) shapes3[i]).setBreadth((i+1)*40);
	     if(i%2==0){
	    	 ((Rectangle) shapes3[i]).setFillColor("red");
	    	 ((Rectangle) shapes3[i]).setLineStyle("dotted");
	    	 ((Rectangle) shapes3[i]).setLineColor("bule");
	    	 ((Rectangle) shapes3[i]).setLineSize((i+1)*2);
	       }
	     else{
	    	 ((Rectangle) shapes3[i]).setFillColor("green");
	    	 ((Rectangle) shapes3[i]).setLineStyle("dashed");
	    	 ((Rectangle) shapes3[i]).setLineColor("black");
	    	 ((Rectangle) shapes3[i]).setLineSize((i+1)*3);
	      }
	     shapes3[i].draw();
	   }
	
	   }//main
	}//class
