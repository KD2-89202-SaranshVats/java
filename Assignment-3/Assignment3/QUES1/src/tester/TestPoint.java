package tester;
import java.util.Scanner;
import com.app.geometry.*;
public class TestPoint {
	
//	public void acceptRecord(Point2D obj , Point2D obj2) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter x co-ord for Point1:- ");
//		obj.setX(sc.nextDouble());
//		
//		System.out.println("Enter y co-ord for Point1:- ");
//		obj.setY(sc.nextDouble());
//		
//		System.out.println("Enter x co-ord for Point2:- ");
//		obj2.setX(sc.nextDouble());
//		
//		System.out.println("Enter y co-ord for Point2:- ");
//		obj2.setY(sc.nextDouble());
//	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		
		p1.acceptRecord();
		p2.acceptRecord();
		
		String s1=p1.getDetails();
		String s2 = p2.getDetails();
		
		System.out.println("p1:- "+s1);
		System.out.println("p2:- "+s2);
		
		boolean flag = p1.isequal(p2);
		System.out.println(flag);
		
		if(flag==false) {
			double distance =Point2D.calcDistance(p1, p2);
			System.out.println("Distance is:- "+distance);
			
		}
		else {
			System.out.println("Points are at the same distance!!!");
		}

	}

}
