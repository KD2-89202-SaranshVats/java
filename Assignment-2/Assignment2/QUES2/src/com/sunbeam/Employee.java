package com.sunbeam;
import java.util.Scanner;
public class Employee {
	private String first_name;
	private String last_name;
	private double salary;
	Scanner sc = new Scanner(System.in);
	
	public Employee() {
		this.first_name = " ";
		this.last_name = " ";
		this.salary = 0;
	}
	
	public void acceptRecord() {
		System.out.println("Enter the first_name:- ");
		first_name = sc.next() ;
		
		System.out.println("Enter the last_name:- ");
		last_name = sc.next();
		
		System.out.println("Enter the salary:- ");
		salary = sc.nextInt();
	}
	
	public void PrintRecord() {
		System.out.println("First_Name :- "+first_name);
		System.out.println("Last_Name:- "+last_name);
		System.out.println("Salary is:- "+salary);
	}
	
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	
	public String getFirstName() {
		return this.first_name;
	}
	
	public void setSecondName(String last_name) {
		this.last_name = last_name;
	}
	
	public String getLastName() {
		return this.last_name;
	}
	
	public void setSalary(double salary){
		if(salary<0) {
			System.out.println("The salary is less than 0");
			this.salary = 0;
		}
		this.salary = salary;
	}
	
	public void getSalary() {
		System.out.println("Updated Salary is:- "+this.salary);
	}
}
