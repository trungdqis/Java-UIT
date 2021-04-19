package GK1819_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GK1819_2Main {
	public static void main(String[] args) {
		// Cau a
		List<Person> persons = new ArrayList<>();
		
		
		Student student1 = new Student();
		student1.id = "SV026";
		student1.name = "Lê D";
		student1.articles.add(new ScientificArticle("A"));
		
		persons.add(student1);
		
		// Cau b
		
		// student
		ScientificArticle[] aArticle1 
			= new ScientificArticle[] {new ScientificArticle("A"), new ScientificArticle("B")};
		
		Student studentA = new Student("SV001", "Van A", Arrays.asList(aArticle1));
		
		ScientificArticle[] aArticle2 
		= new ScientificArticle[] {new ScientificArticle("C"), new ScientificArticle("C")};
	
		Student studentB = new Student("SV002", "Van B", Arrays.asList(aArticle2));
		
		persons.add(studentA);
		persons.add(studentB);
		
		// lecturer
		
		ScientificArticle[] aArticle3 
		= new ScientificArticle[] {new ScientificArticle("B"), new ScientificArticle("B")};
	
		Lecturer lecturerA = new Lecturer("GV001", "Tran A", "HTTT", "GS", Arrays.asList(aArticle3));
		
		ScientificArticle[] aArticle4 
		= new ScientificArticle[] {new ScientificArticle("C"), new ScientificArticle("B")};
	
		Lecturer lecturerB = new Lecturer("GV002", "Tran B", "KHMT", "PGS", Arrays.asList(aArticle4));
		
		persons.add(lecturerA);
		persons.add(lecturerB);
		
		System.out.println("----- Persons are rewarded -----");
		persons.forEach(e -> {
			if (e.isRewarded()) {
				e.output();
				System.out.println("Diem trung binh: " + e.calAverageMarks());
			}
			System.out.println();
		});
	}
}
