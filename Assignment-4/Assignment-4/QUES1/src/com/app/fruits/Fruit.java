package com.app.fruits;
import java.util.Scanner;

abstract class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isFresh() {
		return true;
	}


	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public abstract String taste();
}
