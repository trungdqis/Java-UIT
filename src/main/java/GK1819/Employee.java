package GK1819;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
	public String id;
	public String name;
	public String departmentName;
	public Integer basicPay; 
	public List<WorkDay> workdays = new ArrayList<>();
	
	public Employee() {};
	
	public Employee(String id, String name, String departmentName, Integer basicPay, List<WorkDay> workdays) {
		this.id = id;
		this.name = name;
		this.departmentName = departmentName;
		this.basicPay = basicPay;
		this.workdays = workdays;
	}
	
	public void output() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Basic pay: " + basicPay);
	}
	
	public abstract Double getTimeKeeping(WorkDay workday);
	
	public Double getSalary() {
		Double salary = workdays.stream()
				.map(e -> getTimeKeeping(e))
				.reduce(0.0, Double::sum);
		
		return salary;	
	}
}
