package package2;
import java.util.Scanner;

class CreditLimitCalculator{
	private int account_number;
	private int balance;
	private int item_charges;
	private int credits;
	private int credit_limit;
	
	public CreditLimitCalculator() {
		this.account_number = 0;
		this.balance = 0;
		this.item_charges = 0;
		this.credits = 0;
		this.credit_limit = 0;
	}
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account number:- ");
		this.account_number = sc.nextInt();
		
		System.out.println("Enter Beginning Balance:- ");
		this.balance = sc.nextInt();
		
		System.out.println("Enter Total Item Charges:- ");
		this.item_charges = sc.nextInt();
		
		System.out.println("Enter Credits:- ");
		this.credits = sc.nextInt();
		
		System.out.println("Enter Credit limit:- ");
		this.credit_limit = sc.nextInt();
	}
	
	
	
	public void display() {
		System.out.println("AccNo is:- "+this.account_number);
		System.out.println("Beginning Balance is:- "+this.balance);
		System.out.println("Total item charges this month:- "+this.item_charges);
		System.out.println("Total Credit applied this month:- "+this.credits);
		System.out.println("Credit Limit:- "+this.credit_limit);
		
		double new_balance = this.balance + this.item_charges - this.credits;
		System.out.println("New Balance is:- "+new_balance);
		
		if(new_balance > this.credit_limit) {
			System.out.println("Credit limit Exceeded!!!");
		}
		else {
			System.out.println("All okay!!!");
		}
	}
	
}

public class Program {
	public static void main(String[] args) {
		CreditLimitCalculator c = new CreditLimitCalculator();
		c.acceptRecord();
		c.display();
		
	}

}
