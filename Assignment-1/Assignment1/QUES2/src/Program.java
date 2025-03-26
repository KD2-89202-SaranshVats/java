import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number:- ");
		if(!sc.hasNextDouble()) {
			System.out.println("First number is not a valid double!!!");
			sc.close();
		}
		double num1 = sc.nextDouble();
		
		System.out.println("Enter the second number:- ");
		if(!sc.hasNextDouble()){
			System.out.println("Second Number is also not a valid number:- ");
			sc.close();
		}
		double num2 = sc.nextDouble();
		
		double avg = (num1 + num2)/2;
		System.out.println("The avg is:- "+avg);
	}
}

