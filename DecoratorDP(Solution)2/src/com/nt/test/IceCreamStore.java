package com.nt.test;

import com.nt.dcp.ButterScotchIceCream;
import com.nt.dcp.DryFruitIceCreamDecorator;
import com.nt.dcp.HoneyIceCreamDecorator;
import com.nt.dcp.IceCream;
import com.nt.dcp.VanilaIceCream;

public class IceCreamStore {
	public static void main(String[] args) {
		IceCream iceCream1=null,iceCream2=null,iceCream3=null,iceCream4=null;
		//order normal Vanila IceCream
		iceCream1=new VanilaIceCream();
		iceCream1.prepare();
		System.out.println("........................");
		//order DryFruit Vanila IceCream
		iceCream2=new DryFruitIceCreamDecorator(new VanilaIceCream());
		iceCream2.prepare();
		System.out.println("........................");
		//order DryFruit ButterScotch IceCream
		iceCream3=new DryFruitIceCreamDecorator(new ButterScotchIceCream());
		iceCream3.prepare();
		System.out.println("........................");
		//order DryFruitHoney ButterScotch IceCream
		iceCream4=new DryFruitIceCreamDecorator(new HoneyIceCreamDecorator(new ButterScotchIceCream()));
		iceCream4.prepare();
		System.out.println("........................");
	}

}
