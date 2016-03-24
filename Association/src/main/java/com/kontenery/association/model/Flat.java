package com.kontenery.association.model;

public class Flat {
	
	private Integer 	id;
	private String		flatNumber;
	private String		area;
	private Integer 	fkBuilding;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getFkBuilding() {
		return fkBuilding;
	}
	public void setFkBuilding(Integer fkBuilding) {
		this.fkBuilding = fkBuilding;
	}
	
}
