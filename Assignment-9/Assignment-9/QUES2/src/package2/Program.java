package package2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Project implements Comparable<Project>{
	private int id;
	private String title;
	private int teamSize;
	private double projectCost;
	private String technology;
	
	public Project() {
		
	}
	
	public Project(int id , String title , int teamSize , double projectCost , String technology) {
		this.id = id;
		this.title = title;
		this.teamSize = teamSize;
		this.projectCost = projectCost;
		this.technology = technology;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public double getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(double projectCost) {
		this.projectCost = projectCost;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Project)) {
			return false;
		}
		Project other = (Project)obj;
		if(this.id == other.id) {
			return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Project other) {
		return this.id-other.id;
	}
	
	public String toString() {
		return String.format("%d   %s   %d   %f   %s",this.id,this.title,this.teamSize,this.projectCost,this.technology);
	}
}



public class Program {
	private static Scanner sc = new Scanner(System.in);
	private static Set<Project> set = new HashSet<Project>();
	private static List<Project> list = new ArrayList<Project>();
	
	public static Project[] getinstance() {
		Project[] arr = {
				new Project(1, "Train Reservation System",2, 5000000, "Java"),
				new Project(2, "Airline Reservation System",3, 6000000, ".NET"),
				new Project(4, "Online Grocery Shop", 6, 3000000, "Java"),
				new Project(5, "Online Book Shop", 2, 3000000, ".NET"),
				new Project(3, "Online Jewelry Shop", 4, 4000000, "Java"),
				new Project(2, "Bus Reservation System", 3, 3500000, "JS")
		};
		return arr;
	}
	
	public static void addProject(Project[] arr) {
		for(Project p : arr) {
			set.add(p);
		}
	}
	
	public static void acceptFromUser() {
		Project p = new Project();
		System.out.println("Enter id:- ");
		p.setId(sc.nextInt());
		
		System.out.println("Enter Title:- ");
		sc.nextLine();
		p.setTitle(sc.nextLine());
		
		System.out.println("Enter Team size:- ");
		p.setTeamSize(sc.nextInt());
		
		System.out.println("Enter Project Cost:- ");
		p.setProjectCost(sc.nextDouble());
		
		System.out.println("Enter Technology:- ");
		sc.nextLine();
		p.setTechnology(sc.nextLine());
		
		set.add(p);
	}
	
	public static void printRecord() {
		for(Project e : set) {
			System.out.println(e.toString());
		}
	}
	
	public static void acceptRecord(int[] arr) {
		System.out.println("Enter the id for deleting the Record:- ");
		arr[0] = sc.nextInt();
	}
	
	public static boolean removeRecord(int id) {
		Project key = new Project();
		key.setId(id);
		
		if(set.contains(key)) {
			set.remove(key);
			return true;
		}
		return false;
	}
	
	public static void CopyProjects() {
		for(Project s:set) {
			list.add(s);
		}
	}
	
	public static void PrintList() {
		for(Project p:list) {
			System.out.println(p);
		}
	}
	
	public static void sortProjectByPrice() {
		class SortByPrice implements Comparator<Project>{
			public int compare(Project x , Project y) {
				return (int)(x.getProjectCost()-y.getProjectCost());
			}
		}
		list.sort(new SortByPrice());
		for(Project p:list) {
			System.out.println(p.toString());
		}
	}
	
	public static Project maxTeamSize() {
		class SortByTeamSize implements Comparator<Project>{
			public int compare(Project x , Project y) {
				return x.getTeamSize()-y.getTeamSize();
			}
		}
		Project p=Collections.max(list, new SortByTeamSize());
		return p;
		
	}
	
	public static int menulist() {
		int choice;
		System.out.println("0. EXIT!!!!");
		System.out.println("1. ADD DUMMY DATA");
		System.out.println("2. INPUT A PROJECT FROM USER AND ADD IT");
		System.out.println("3. DISPLAY ALL PROJECTS");
		System.out.println("4. DELETE A PROJECT BY ID FROM SET");
		System.out.println("5 COPY ALL PROJECTS FROM SET TO ARRAYLIST");
		System.out.println("6. DISPLAY ALL PROJECT FROM LIST");
		System.out.println("7. SORT ALL PROJECT IN LIST BY COST");
		System.out.println("8. FIND PROJECT MAX TEAM SIZE");
		System.out.println("Enter choice:- ");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] id = new int[1];
		int choice;
		while((choice=menulist())!=0) {
			switch(choice) {
			case 1:
				Project[] arr=Program.getinstance();
				Program.addProject(arr);
				break;
				
			case 2:
				Program.acceptFromUser();
				break;
				
			case 3:
				Program.printRecord();
				break;
			case 4:
				Program.acceptRecord(id);
				boolean status=Program.removeRecord(id[0]);
				System.out.println(status?"Project Deleted":"Project Not Found");
				break;
			case 5:
				Program.CopyProjects();
				break;
			case 6:
				Program.PrintList();
				break;
			case 7:
				Program.sortProjectByPrice();
				break;
			case 8:
				Project p=Program.maxTeamSize();
				System.out.println(p.toString());
				break;
			default:
				System.out.println("Wrong choice!!!!Invalid Choice!!!");
				break;
			}
		}

	}

}
