package pacakge2;
import java.util.Scanner;
public class Circle{
	private double myX;
	private double myY;
	private double myDiameter;
	
	public Circle() {
		this.myX = 0;
		this.myY = 0;
		this.myDiameter = 100;
	}
	
	public Circle(double x , double y , double diameter) {
		this.myX = x;
		this.myY = y;
		this.myDiameter = diameter;
	}
	
	public void setMyX(int x) {
		this.myX = x;
	}
	
	public double getMyX() {
		return this.myX;
	}
	
	public void setMyY(int y) {
		this.myY = y;
	}
	
	public double getMyY() {
		return this.myY;
	}
	
	public void setMyDiameter(double diameter) throws InvalidDiameterException{
		if(diameter < 0) {
			throw new InvalidDiameterException("Invalid Diameter",diameter);
		}
		this.myDiameter = diameter;
	}
	
	public double getMyDiameter() {
		return this.myDiameter;
	}
	
	public String toString() {
		return String.format("(%f , %f) Center-Points and %f -- Diameter ",this.myX,this.myY,this.myDiameter);
	}
}
