package com.nt.bdp;

public class IglooHouseBuilder implements HouseBuilder {
	  private House house;
	  
	  public IglooHouseBuilder() {
		this.house=new House();
	}

	@Override
	public void buildBaseMent() {
	  house.setBaseMent("IglooHouse basement");
	}

	@Override
	public void buildStructure() {
		house.setStructure("IglooHouse structure");

	}

	@Override
	public void buildRoof() {
		house.setRoof("IglooHouse Roof");
	}

	@Override
	public void buildWalls() {
		house.setWalls("Igloo House Walls");
	}

	@Override
	public void buildInterior() {
		house.setInterior("IglooHouse Interior");
	}

	@Override
	public House getHouse() {
		
		return house;
	}

}
