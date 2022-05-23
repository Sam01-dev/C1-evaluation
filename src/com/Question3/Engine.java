package com.Question3;

public class Engine {
	
	int rmp;
	int power;
	String manufacturer;
	boolean hasTurbo;
	
	public int getRmp() {
		return rmp;
	}
	public void setRmp(int rmp) {
		this.rmp = rmp;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public boolean isHasTurbo() {
		return hasTurbo;
	}
	public void setHasTurbo(boolean hasTurbo) {
		this.hasTurbo = hasTurbo;
	}
	void enableTurbo(boolean hasTurbo) {
		
		hasTurbo = true;
		System.out.println(hasTurbo);
		
	}
	public Engine(int rmp,int power, String manufacturer, boolean hasTurbo) {
		this.rmp = rmp;
		this.manufacturer = manufacturer;
		this.hasTurbo = hasTurbo;
		
	}
	

}
