package package2;

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
		if(str.equals(str2)) {
			System.out.println("String is Palindrome!!!!");
		}
		else {
			System.out.println("String is not Palindrome!!!");
		}
	}

}
