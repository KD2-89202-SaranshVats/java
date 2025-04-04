package com.app.fruits;
import java.util.Scanner;
public class FruitBasket {
	
	public static int menulist() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("0. EXIT!!!");	
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display Names of all fruits:- ");
		System.out.println("5. Display Name , color , weight , Taste of all fresh Fruits in basket:- ");
		System.out.println("6. Make a Fruit as Stale(Not Fresh)by using index ");
		System.out.println("7. Display Taste of all stale(not fresh) fruits ");
		System.out.println("8. Mark all sour fruits stale:- ");
		System.out.println("Enter Choice:- ");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int size;
		System.out.println("Enter the size of basket:- ");
		size = sc.nextInt();
		Fruit[] arr = new Fruit[size];
		arr[counter]=null;
		
		int choice;
		while((choice = menulist())!=0) {
			switch(choice) {
			case 1:
				arr[counter++] = new Mango();
				break;
			case 2:
				arr[counter++] = new Orange();
				break;
			case 3:
				arr[counter++] = new Apple();
				break;
			case 4:
				for(Fruit e : arr) {
					if(e==null) {
						System.out.println("Basket is Empty!!!!");
					}
					else {
						System.out.println(e.getName());
					}
				}
				break;
					
			case 5:
				for(Fruit e : arr) {
					if(e==null) {
						System.out.println("Basket is Empty!!!");
					}
					else {
						System.out.println(e.toString());
						System.out.println(e.taste());
						System.out.println(e.isFresh());
					}
				}
				break;
			case 6:
				int index;
				System.out.println("Enter the index of fruit to set it to be not fresh!!!!");
				index = sc.nextInt();
				if(index>=arr.length) {
					System.out.println("Error!!!Invalid Syntax");
				}
				else {
					arr[index].setFresh(false);
					System.out.println("Fruit Freshness changes");
				}
				break;
			case 7:
				for(Fruit e : arr) {
//					if(e==null) {
//						System.out.println("Array is Empty!!!");
//					}
					if(!e.isFresh()) {
						System.out.println(e.taste());
					}
				}
				break;
			case 8:
				for(Fruit e : arr) {
					if(e.taste()=="sour") {
						e.setFresh(false);
					}
				}
			}
			
		}
		
		
	}
}
