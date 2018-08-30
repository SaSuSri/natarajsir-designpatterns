package com.nt.bdp;

public class House {
	private String baseMent;
	private String roof;
	private String structure;
	private  String walls;
	private String interior;
	public String getBaseMent() {
		return baseMent;
	}
	public void setBaseMent(String baseMent) {
		this.baseMent = baseMent;
	}
	public String getRoof() {
		return roof;
	}
	public void setRoof(String roof) {
		this.roof = roof;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
	public String getWalls() {
		return walls;
	}
	public void setWalls(String walls) {
		this.walls = walls;
	}
	public String getInterior() {
		return interior;
	}
	public void setInterior(String interior) {
		this.interior = interior;
	}
	@Override
	public String toString() {
		return "House [baseMent=" + baseMent + ", roof=" + roof + ", structure=" + structure + ", walls=" + walls
				+ ", interior=" + interior + "]";
	}
	
	

}
