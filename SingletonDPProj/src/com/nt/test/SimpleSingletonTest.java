package com.nt.test;

import com.nt.singleton.PrinterUtil;

public class SimpleSingletonTest {

	public static void main(String[] args) {
		PrinterUtil pu1=null,pu2=null;
		
		pu1=PrinterUtil.getInstance();
		pu2=PrinterUtil.getInstance();
		pu1.print();
		pu2.print();
		System.out.println(".......................................");
		System.out.println(pu1.hashCode()+"   "+pu2.hashCode());
		System.out.println("pu1==pu2?"+(pu1==pu2));

	}

}
