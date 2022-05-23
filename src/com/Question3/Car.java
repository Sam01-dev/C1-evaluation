package com.Question3;

public class Car {
	
	String model;
	String companyName;
	String Color;
	Engine engine;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Car(String model, String companyName,String Color,Engine engine) {
		this.model = model;
		this.companyName = companyName;
		this.Color = Color;
		this.engine = engine;
	}

}
