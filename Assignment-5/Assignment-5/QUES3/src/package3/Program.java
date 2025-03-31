package package3;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:- ");
		String str = sc.nextLine();
		str.trim();
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++) {
			count = count + 1;
		}
		System.out.println("Number of words in a  string is:- "+count);
	}

}
