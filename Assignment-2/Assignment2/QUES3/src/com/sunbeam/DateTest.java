package com.sunbeam;
import java.util.Scanner;

class Date{
	private int day;
	private int month;
	private int year;
	Scanner sc = new Scanner(System.in);
	
	public Date() {
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}
	
	public void acceptRecord() {
		System.out.println("Enter the day:- ");
		day = sc.nextInt();
		
		System.out.println("Enter the month:- ");
		month = sc.nextInt();
		
		System.out.println("Enter the year:- ");
		year = sc.nextInt();
	}
	
	public void displayRecord() {
		System.out.println("Date:- "+day+"/"+month+"/"+year);
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return this.year;
	}
}

public class DateTest {
	public static void main(String[] args) {
		Date obj = new Date();
		obj.acceptRecord();
		obj.displayRecord();
	}

}
