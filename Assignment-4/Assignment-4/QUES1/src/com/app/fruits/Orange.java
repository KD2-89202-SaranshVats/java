package com.app.fruits;
import java.util.Scanner;
class Orange extends Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Orange() {
		this.color = "Orange";
		this.weight = 3;
		this.name = "Orange";
		this.isFresh = true;
	}
	
	public Orange(String color , double weight , String name , boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public boolean isFresh() {
		return this.isFresh;
	}
	
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	public String toString() {
		return "[Name:- "+this.name+","+"color:- "+this.color+","+"weight:- "+this.weight+"]";
	}
	
	public String taste() {
		return "Sour";
	}
}
