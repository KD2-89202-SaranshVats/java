package com.app.geometry;
import java.math.*;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math ;

public class Point2D {
	private double x;
	private double y;
	
	public Point2D() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point2D(double x , double y) {
		this.x = x;
		this.y = y;
	}
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x co-ord:- ");
		this.x = sc.nextDouble();
		
		System.out.println("Enter y co-ord:- ");
		this.y = sc.nextDouble();
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public String getDetails() {
		return "Point co-ord are:- "+"("+this.x+","+this.y+")";
	}
	
	public boolean isequal(Object obj){
		if(this==null) {
			return false; 
		}
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Point2D)) {
			return false;
		}
		Point2D other =(Point2D)obj;
		if(this.x == other.x && this.y == other.y){
			return true;
		}
		return false;
	}
	
	public static double calcDistance(Point2D obj1 , Point2D obj2) {
		double X =Math.pow((obj1.x-obj2.x),2);
		double Y = Math.pow((obj1.y-obj2.y),2);
		double total = X + Y;
		double distance = Math.sqrt(total);
		return distance;
	}
	
//	public static void main(String[] args) {
//		Point2D p1 = new Point2D(2,3);
//		Point2D p2 = new Point2D(2,8);
//		
//		boolean flag = p1.isequal(p2);
//		System.out.println("flag:- "+flag);
//		
//		double result = Point2D.calcDistance(p1, p2);
//		System.out.println("Distance between 2 points is:- "+result);
//		
//		
//	}

}
