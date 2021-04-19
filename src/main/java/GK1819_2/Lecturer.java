package GK1819_2;

import java.util.List;
import java.util.OptionalDouble;

public class Lecturer extends Person{
	public String department;
	public String academicDegree;
	
	public Lecturer() {}
	
	public Lecturer(String id, String name, String department, String academicDegree, List<ScientificArticle> articles) {
		super(id, name, articles);
		this.department = department;
		this.academicDegree = academicDegree;
	}
	
//	@Override
//	public void input() {
//		super.input();
//		System.out.println("Enter a department: ");
//		department = scan.nextLine();
//		System.out.println("Enter a Academic/Degree: ");
//		academicDegree = scan.nextLine();
//	}
	
	@Override
	public void output() {
		super.output();
//		System.out.println("Department: " + department);
//		System.out.println("Academic/Degree: " + academicDegree);
		System.out.println("Scientific Articles: " + articles.size());
	}

	@Override
	public boolean isRewarded() {
		return (calAverageMarks() >= 8.5 ? true : false);
	}

	@Override
	public Double calAverageMarks() {
		OptionalDouble averageOfMarks = articles
	            .stream()
	            .mapToDouble(number -> number.mark)
	            .average();
		
		switch (academicDegree) {
			case "GS":
				return averageOfMarks.getAsDouble() + averageOfMarks.getAsDouble() * 0.1;
			case "PSG":
				return averageOfMarks.getAsDouble() + averageOfMarks.getAsDouble() * 0.15;
			case "GVC":
				return averageOfMarks.getAsDouble() + averageOfMarks.getAsDouble() * 0.2;
			case "TS":
				return averageOfMarks.getAsDouble() + averageOfMarks.getAsDouble() * 0.25;
			case "ThS":
				return averageOfMarks.getAsDouble() + averageOfMarks.getAsDouble() * 0.3;
			default:
				return 0.0;
		}	
	}
}
