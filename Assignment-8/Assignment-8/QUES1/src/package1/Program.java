package package1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Book{
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book() {
		
	}
	
	public Book(String isbn , double price , String authorName , int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return String.format("%s   %f   %s   %d",this.isbn,this.price,this.authorName,this.quantity);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book)obj;
		if(this.isbn.equals(other.isbn)) {
			return true;
		}
		return false;
	}
}


public class Program {
	private static List<Book> list = new ArrayList<Book>();
	public static Book[] getInstance() {
		Book[] arr = new Book[4];
		arr[0] = new Book("1",100,"Yoka Mahi",5);
		arr[1] = new Book("2",200,"Zakir",10);
		arr[2] = new Book("3",300,"Rohan",15);
		arr[3] = new Book("4",400,"Lokesh",20);
		return arr;
	}
	
	public static void addBook(Book[] arr) {
		for(Book b : arr) {
			list.add(b);
		}
	}
	
	public static void acceptRecord(String[] isbn) {
		System.out.println("Enter the isbn to delete the book:- ");
		isbn[0] = sc.next();
	}
	 
	public static boolean removeRecord(String isbn) {
		Book key = new Book();
		key.setIsbn(isbn);
		if(list.contains(key)) {
			System.out.println("Hello");
			list.remove(key);
			return true;
		}
		return false;
	}
	
	
	
	
	public static Scanner sc = new Scanner(System.in);
	public static int menulist() {
		int choice;
		System.out.println("0.EXIT!!!");
		System.out.println("1. Add a new Book");
		System.out.println("2. Display all Books in Forward Order");
		System.out.println("3. Display all Books in Reverse Order");
		System.out.println("4 Delete a book at given index");
		System.out.println("Enter choice:- ");
		choice = sc.nextInt();
		return choice;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] bookisbn = new String[1];
		int choice;
		while((choice = menulist())!=0) {
			switch(choice) {
			case 1:
				list.clear();
				Book[] arr = Program.getInstance();
				Program.addBook(arr);
				break;
				
			case 2:
				Iterator<Book> trav = list.iterator();
				while(trav.hasNext()) {
					Book ele = trav.next();
					System.out.println(ele);
				}
				break;
			
			case 3:
				ListIterator<Book> trav1 = list.listIterator(list.size());
				while(trav1.hasPrevious()) {
					Book b1=trav1.previous();
					System.out.println(b1);
				}
				break;
			case 4:
				Program.acceptRecord(bookisbn);
				boolean removedstatus=Program.removeRecord(bookisbn[0]);
				System.out.println(removedstatus ? "Book Removed":"Book not Found");
				break;
			default:
				System.out.println("Wrong choice!!!Please Enter the Correct Choice!!!!");
				break;
			}
				
		}

	}

}
