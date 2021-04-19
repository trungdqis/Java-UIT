package GK1819;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	private String id;
	private String name;
	private String departmentName;
	private Double basicPay; 
	private ArrayList<WorkDay> workdays;
	Scanner scan = new Scanner(System.in);
	
	public Employee() {};
	
	public Employee(String id, String name, String departmentName, Double basicPay, ArrayList<WorkDay> workdays) {
		this.id = id;
		this.name = name;
		this.departmentName = departmentName;
		this.basicPay = basicPay;
		this.workdays = workdays;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(Double basicPay) {
		this.basicPay = basicPay;
	}

	public ArrayList<WorkDay> getWorkdays() {
		return workdays;
	}

	public void setWorkdays(ArrayList<WorkDay> workdays) {
		this.workdays = workdays;
	}
	
	public void input() {
		System.out.println("Ma nhan vien: ");
		System.out.println("Nhap ten nhan vien: ");
		name = scan.nextLine();
		System.out.println("Nhap ten don vi: ");
		departmentName = scan.nextLine();
		System.out.println("Nhap muc luong: ");
		basicPay = scan.nextDouble();
	}
}
