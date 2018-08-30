package com.nt.bdp;

public class BrickHouseBuilder implements HouseBuilder {
	  private House house;
	  
	  public BrickHouseBuilder() {
		this.house=new House();
	}

	@Override
	public void buildBaseMent() {
	  house.setBaseMent("BrickHouse basement");
	}

	@Override
	public void buildStructure() {
		house.setStructure("BrickHouse structure");

	}

	@Override
	public void buildRoof() {
		house.setRoof("Brick House Roof");
	}

	@Override
	public void buildWalls() {
		house.setWalls("Brick House Walls");
	}

	@Override
	public void buildInterior() {
		house.setInterior("BrickHouse Interior");
	}

	@Override
	public House getHouse() {
		
		return house;
	}

}
