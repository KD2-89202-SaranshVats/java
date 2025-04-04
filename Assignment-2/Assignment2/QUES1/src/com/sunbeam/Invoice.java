package com.sunbeam;
import java.util.Scanner;
public class Invoice {
	Scanner sc = new Scanner(System.in);
	private String part_number;
	private String part_description;
	private int item_purchased;
	private double price_per_item;
	
	
	public Invoice() {
		this.part_number = " ";
		this.part_description = " ";
		this.item_purchased = 0;
		this.price_per_item = 0;
	}
	
	public void acceptRecord() {
		System.out.println("Enter the Part_number:- ");
		part_number = sc.next();
		
		System.out.println("Enter the part_description:- ");
		part_description = sc.next();
		
		System.out.println("Enter the item_purchased:- ");
		item_purchased = sc.nextInt();
		
		System.out.println("Enter the price per item:- ");
		price_per_item = sc.nextDouble();
	}
	
	public void PrintRecord() {
		System.out.println("Part_Number is:- "+part_number);
		System.out.println("Part Description is:- "+part_description);
		System.out.println("Item Purchased is:- "+item_purchased);
		System.out.println("Price per item is:- "+price_per_item);
		if(item_purchased < 0) {
			setItemPurchased(0);
		}
		
		if(price_per_item<0) {
			setPricePerItem(0);
		}
		double d = item_purchased * price_per_item;
		System.out.println("Invoice is:- "+d);
	}
	
	public void setPartNumber(String part_number) {
		this.part_number = part_number;
	}
	
	public String getPartNumber() {
		return this.part_number;
	}
	
	public void setPartDescription(String part_description) {
		this.part_description = part_description;
	}
	
	public String getPartDescription() {
		return this.part_description;
	}
	
	public void setItemPurchased(int item_purchased) {
		this.item_purchased = item_purchased;
	}
	
	public int getItemPurchased() {
		return this.item_purchased;
	}
	
	public void setPricePerItem(double price_per_item) {
		this.price_per_item = price_per_item;
	}
	
	public double getPricePerItem() {
		return this.price_per_item;
	}
	
	public void invoice_amount() {
		double amount = item_purchased * price_per_item;
		System.out.println("The Invoice amount is:- "+amount);
	}

}
