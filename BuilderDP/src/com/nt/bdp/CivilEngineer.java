package com.nt.bdp;

public class CivilEngineer {
	private HouseBuilder builder;
	
	public CivilEngineer(HouseBuilder builder){
		this.builder=builder;
	}
	
	public  House constructHouse(){
		builder.buildBaseMent();
		builder.buildStructure();
		builder.buildRoof();
		builder.buildWalls();
		builder.buildInterior();
		//get House
		return builder.getHouse();
	}//constructHouse
	
}//class
