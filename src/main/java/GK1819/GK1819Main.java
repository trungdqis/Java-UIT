package GK1819;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GK1819Main {
	public static void main(String[] args) {
		List<Employee> employees= new ArrayList<>();
		
		// Cau a
//		DirectEmployee employee1 = new DirectEmployee();
//		
//		employee1.id = "NV026";
//		employee1.name = "Trần X";
//		employee1.basicPay = 300000;
//		WorkDay workday = new WorkDay("19/04/2021", true, 2, null, 0.1); 
//		employee1.workdays.add(workday);
//		
//		System.out.println("Timekeeping result: " + employee1.getTimeKeeping(workday));
//		employees.add(employee1);
		
		// cau b
		List<WorkDay> theWorkingDaysOfEmployeeA = Arrays.asList(
				new WorkDay("19/04/2021", true, 2, null, 0.1), 
				new WorkDay("20/04/2021", true, 1, null, 0.2)
				);
		
		DirectEmployee employeeA = new DirectEmployee("NV001", "Van A", "Cong Ty A", 250000, theWorkingDaysOfEmployeeA);
		
		List<WorkDay> theWorkingDaysOfEmployeeB = Arrays.asList(
				new WorkDay("19/04/2021", true, 1, null, 0.15), 
				new WorkDay("20/04/2021", true, 1, null, 0.2)
				);
		
		DirectEmployee employeeB = new DirectEmployee("NV002", "Van B", "Cong Ty A", 300000, theWorkingDaysOfEmployeeB);
		
		List<WorkDay> theWorkingDaysOfEmployeeC = Arrays.asList(
				new WorkDay("19/04/2021", true, null, null, null), 
				new WorkDay("20/04/2021", false, null, true, null)
				);
		
		IndirectEmployee employeeC = new IndirectEmployee("NV003", "Van C", "Cong Ty A", 200000, theWorkingDaysOfEmployeeC);
		
		List<WorkDay> theWorkingDaysOfEmployeeD = Arrays.asList(
				new WorkDay("19/04/2021", true, null, null, null), 
				new WorkDay("20/04/2021", false, null, false, null)
				);
		
		IndirectEmployee employeeD = new IndirectEmployee("NV004", "Van D", "Cong Ty A", 220000, theWorkingDaysOfEmployeeD);
		
		employees.add(employeeA);
		employees.add(employeeB);
		employees.add(employeeC);
		employees.add(employeeD);
		
		employees.forEach(e -> {
			e.output();
			System.out.println();
		});
	}
}
