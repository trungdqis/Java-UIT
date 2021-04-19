package GK1819;

import java.util.List;

public class IndirectEmployee extends Employee {
	
	public IndirectEmployee() {}
	
	public IndirectEmployee (String id, String name, String departmentName, Integer basicPay, List<WorkDay> wordDays) {
		super(id, name, departmentName, basicPay, wordDays);
	}
	
	@Override
	public void output() {
		super.output();
		System.out.println("--- Payroll ---");
		workdays.forEach(e -> {
			System.out.println("Date: " + e.date);
			if (e.isWork) {
				System.out.println("Absent");
			} else {
				System.out.println((e.beOnLeave == true ? "Absent with leave" : "Absent without leave"));
			}
			System.out.println("Timekeeping: " + getTimeKeeping(e));
			System.out.println();
		});
		System.out.println("----- Salary -----: " + getSalary());
	}

	@Override
	public Double getTimeKeeping(WorkDay workday) {
		Double coefficient = 0.0;
		
		if (workday.shift != null) {
			coefficient = 1.0;
		}
		if (workday.beOnLeave != null) {
			coefficient = (workday.beOnLeave == true ? 0.5 : 0.0);
		}
		
		return (basicPay + basicPay * coefficient);
	}
}
