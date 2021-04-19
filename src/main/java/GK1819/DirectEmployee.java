package GK1819;

import java.util.List;

public class DirectEmployee extends Employee {
	
	public DirectEmployee() {}
	
	public DirectEmployee (String id, String name, String departmentName, Integer basicPay, List<WorkDay> wordDays) {
		super(id, name, departmentName, basicPay, wordDays);
	}
	
	@Override
	public void output() {
		super.output();
		System.out.println("--- Payroll ---");
		workdays.forEach(e -> {
			System.out.println("Date: " + e.date);
			System.out.println("Coefficients Fringe Benefits: " + e.coefficientsFringeBenefits);
			if (e.isWork) {
				System.out.println("Shift: " + e.shift);
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
			coefficient = (workday.shift == 1 ? 1.0 : 1.5);
		}
		if (workday.beOnLeave != null) {
			coefficient = (workday.beOnLeave == true ? 0.5 : 0.0);
		}
		
		return (basicPay + basicPay * (coefficient + workday.coefficientsFringeBenefits));
	}

}
