import java.util.Scanner;

public class Program{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op;
		double amount = 0;
		do {
			System.out.println("0. EXIT!!!");
			System.out.println("1. DOSA");
			System.out.println("2. SAMOSA");
			System.out.println("3. IDLI");
			System.out.println("4. VADA");
			System.out.println("5. MANCHOORIAN");
			System.out.println("6. FRIED RICE");
			System.out.println("7. SOUP");
			System.out.println("8. RASGULLA");
			System.out.println("9. RASMALAI");
			System.out.println("10. GENERATE BILL");
			op = sc.next();
			
			switch(op) {
			case "1":
				double price = 30;
				int quantity;
				System.out.println("DOSA Price:- "+price);
				System.out.println("Enter Quantity:- ");
				quantity = sc.nextInt();
				double bill = quantity * price;
				amount = amount + bill;
				break;
			case "2":
				double price1 = 15;
				int quantity1;
				System.out.println("Samosa Price:- "+price1);
				System.out.println("Enter Quantity:- ");
				quantity1 = sc.nextInt();
				double bill1 = quantity1 * price1;
				amount = amount +bill1;
				break;
			
			case "3":
				double price2 = 25;
				int quantity2;
				System.out.println("IDLI Price:- "+price2);
				System.out.println("Enter Quantity:- ");
				quantity2 = sc.nextInt();
				double bill2 = quantity2 * price2;
				amount = amount + bill2;
				break;
			case "4":
				double price3 = 25;
				int quantity3;
				System.out.println("Vada Price:- "+price3);
				System.out.println("Enter Quantity:- ");
				quantity3 = sc.nextInt();
				double bill3 = quantity3 * price3;
				amount = amount + bill3;
				break;
			case "5":
				double price4 = 100;
				int quantity4;
				System.out.println("Manchoorian Price:- "+price4);
				System.out.println("Enter Quantity:- ");
				quantity4 = sc.nextInt();
				double bill4 = quantity4 * price4;
				amount = amount + bill4;
				break;
			case "6":
				double price5 = 110;
				int quantity5;
				System.out.println("Fried Rice Price:- "+price5);
				System.out.println("Enter Quantity:- ");
				quantity5 = sc.nextInt();
				double bill5 = quantity5 * price5;
				amount = amount + bill5;
				break;
			case "7":
				double price6 = 50;
				int quantity6;
				System.out.println("SOUP Price:- "+price6);
				System.out.println("Enter Quantity:- ");
				quantity6 = sc.nextInt();
				double bill6 = quantity6 * price6;
				amount = amount + bill6;
				break;
				
			case "8":
				double price7 = 50;
				int quantity7;
				System.out.println("RASGULLA  Price:- "+price7);
				System.out.println("Enter Quantity:- ");
				quantity7 = sc.nextInt();
				double bill7 = quantity7 * price7;
				amount = amount + bill7;
				break;
			case "9":
				double price8 = 35;
				int quantity8;
				System.out.println("RASMALAI  Price:- "+price8);
				System.out.println("Enter Quantity:- ");
				quantity8 = sc.nextInt();
				double bill8 = quantity8 * price8;
				amount = amount + bill8;
				break;
				
				
			case "10":
				System.out.println("Bill_Generate:- "+amount);
				break;
			default :
				System.out.println("Wrong Choice!!! Please Enter the correct choice!!!");
				break;
			}
		}while(!op.equals("0"));
	}
}
