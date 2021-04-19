package GK1819_2;

import java.util.Scanner;

public class ScientificArticle {
	public String category;
	public Integer mark;
	Scanner scan = new Scanner(System.in);
	
	public ScientificArticle() {}
	
	public ScientificArticle(String category) {
		this.category = category;
		switch (category) {
			case "A":
				mark = 10;
				break;
			case "B":
				mark = 8;
				break;
			case "C":
				mark = 6;
				break;
			default:
				break;
		}	
	}
	
//	public void input() {
//		System.out.println("Enter a Scientific Article's information");
//		System.out.println("Enter a category: ");
//		category = scan.nextLine();
//		new ScientificArticle(category);
//	}
}
