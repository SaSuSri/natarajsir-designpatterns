package com.nt.fmp;

public class BajajChennaiFactory {
	public static void assemble(){
		System.out.println("Bike assembling");
	}
	public static void paint(){
		System.out.println("Bike Painting");
	}
	public static void oiling(){
		System.out.println("Bike oiling");
	}
	public static void roadTest(){
		System.out.println("road Testing ");
	}
	public static void deliver(){
		System.out.println("delivering ");
	}
	
	public static Bike createBike(String type){
		 Bike bike=null;
		if(type.equals("pulsor")){
			bike=new PulsorBike();
		}
		else if(type.equals("discover")){
			bike=new DiscoverBike();
		}
		assemble();
		paint();
		oiling();
		roadTest();
		deliver();
	   return bike;
	}//method
}//class
