package com.sunbeam;
import com.sunbeam.*;
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee();
		Employee obj1 = new Employee();
		
		obj.acceptRecord();
		obj.PrintRecord();
		obj.setSalary((10000/10)+10000);
		obj.getSalary();
		
		obj1.acceptRecord();
		obj1.PrintRecord();
		obj1.setSalary((20000/10)+20000);
		obj1.getSalary();

	}

}
