package com.nt.test;

import com.nt.dcp.DryFruitHoneyVanialaIceCream;
import com.nt.dcp.DryFruitVanilaIceCream;
import com.nt.dcp.IceCream;
import com.nt.dcp.VanilaIceCream;

public class IceCreamStore {
	public static void main(String[] args) {
		IceCream iceCream1=null,iceCream2=null,iceCream3=null;
		//order Normal Vanila IceCream
		iceCream1=new VanilaIceCream();
		iceCream1.prepare();
		System.out.println("...........................");
		//order DryFruit Vanila IceCream
		iceCream2=new DryFruitVanilaIceCream();
		iceCream2.prepare();
		System.out.println("...........................");
		//order DryFruitHoneyVanila IceCream
		iceCream3=new DryFruitHoneyVanialaIceCream();
		iceCream3.prepare();
		
		
	}

}
