package com.nt.bdp;

public class CivilEngineerCouncil {
	
	public static CivilEngineer  getInstance(String type){
		CivilEngineer engineer=null;
		HouseBuilder builder=null;
		if(type.equalsIgnoreCase("wood")){
			builder=new WoodenHouseBuilder();
			engineer=new CivilEngineer(builder);
		}
		else if(type.equals("igloo")){
			builder=new IglooHouseBuilder();
			engineer=new CivilEngineer(builder);
		}
		else{
			builder=new BrickHouseBuilder();
			engineer=new CivilEngineer(builder);
		}
		return  engineer;
	}//method

}//class
