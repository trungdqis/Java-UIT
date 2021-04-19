package GK1819_2;

import java.util.List;
import java.util.OptionalDouble;

public class Student extends Person {
	
	public Student() {}
	
	public Student(String id, String name, List<ScientificArticle> articles) {
		super(id, name, articles);
	}
	
//	@Override
//	public void input() {
//		super.input();
//	}
	
	@Override
	public void output() {
		super.output();
		System.out.println("Scientific Articles: " + articles.size());
	}

	@Override
	public boolean isRewarded() {
		return (calAverageMarks() >= 7 ? true : false);
	}

	@Override
	public Double calAverageMarks() {
		OptionalDouble averageOfMarks = articles
	            .stream()
	            .mapToDouble(number -> number.mark)
	            .average();
		return averageOfMarks.getAsDouble();
	}
}
