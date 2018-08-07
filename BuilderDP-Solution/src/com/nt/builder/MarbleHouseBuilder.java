package com.nt.builder;

import com.nt.product.ConcreteBasement;
import com.nt.product.ConcreteRoof;
import com.nt.product.ConcreteStructure;
import com.nt.product.House;
import com.nt.product.MarbleInterior;
import com.nt.product.MarbleRoof;
import com.nt.product.WoodenInterior;

public class MarbleHouseBuilder implements HouseBuilder {
	 private House house;
	 
	 public MarbleHouseBuilder(House house) {
		 this.house=house;
		
	}
	

	@Override
	public void buildBasement() {
	  house.setBasement(new ConcreteBasement());
	}

	@Override
	public void buildStructure() {
	house.setStrucutre(new ConcreteStructure());
	}

	@Override
	public void buildRoof() {
		house.setRoof(new MarbleRoof());

	}

	@Override
	public void buildInterior() {
		house.setInteriror(new MarbleInterior());

	}

	@Override
	public House getHouse() {
		return house;
	}

}
