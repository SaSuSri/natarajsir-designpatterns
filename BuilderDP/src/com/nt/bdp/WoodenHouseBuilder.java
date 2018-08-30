package com.nt.bdp;

public class WoodenHouseBuilder implements HouseBuilder {
	  private House house;
	  
	  public WoodenHouseBuilder() {
		this.house=new House();
	}

	@Override
	public void buildBaseMent() {
	  house.setBaseMent("WoodenHouse basement");
	}

	@Override
	public void buildStructure() {
		house.setStructure("WoodenHouse structure");

	}

	@Override
	public void buildRoof() {
		house.setRoof("WoodenHouse Roof");
	}

	@Override
	public void buildWalls() {
		house.setWalls("Wooden House Walls");
	}

	@Override
	public void buildInterior() {
		house.setInterior("WoodenHouse Interior");
	}

	@Override
	public House getHouse() {
		
		return house;
	}

}
