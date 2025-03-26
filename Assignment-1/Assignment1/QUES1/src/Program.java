import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int number;
		System.out.println("Enter number:- ");
		number = sc.nextInt();
		
		System.out.println("Given Number:- "+number);
		System.out.println("Binary equivalent:- "+Integer.toBinaryString(number));
		System.out.println("Octal Equivalent:- "+Integer.toOctalString(number));
		System.out.println("Hexadecimal equivalent:- "+Integer.toHexString(number));
		
	}

}
