package GK1819_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Person {
	public String id;
	public String name;
	public List<ScientificArticle> articles = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	
	public Person() {}
	
	public Person (String id, String name, List<ScientificArticle> articles) {
		this.id = id;
		this.name = name;
		this.articles = articles;
	}
	
//	public void input() {
//		System.out.println("Enter a id: ");
//		id = scan.nextLine();
//		System.out.println("Enter a name: ");
//		name = scan.nextLine();
//	}
	
	public void output() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
	}
	
	public abstract boolean isRewarded();
	
	public abstract Double calAverageMarks();
}
