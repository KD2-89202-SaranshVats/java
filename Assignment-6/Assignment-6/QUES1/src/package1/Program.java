package package1;
import java.util.Scanner;
public class Program {
	public static void calLength() throws ExceptionLineTooLong {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:- ");
		String str = sc.nextLine();
		str.trim();
		if(str.length()>80) {
			throw new ExceptionLineTooLong("The String is too long",str.length());
		}
		System.out.println("Length of String is:- "+str.length());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program p = new Program();
		try {
			p.calLength();
		}
		catch(ExceptionLineTooLong e) {
			System.out.println(e.getMessage());
		}
	}

}
