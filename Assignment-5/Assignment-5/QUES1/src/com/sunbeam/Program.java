package com.sunbeam;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the String:- ");
		str = sc.nextLine();
		str.trim();
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String str2 = sb.toString();
		System.out.println("Reverse String is:- "+str2);
		
	}

}
