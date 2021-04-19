package GK1819;

import java.time.LocalDate;

public class IndirectEmployee extends Employee {
	
	@Override
	public void input() {
		super.input();
		
		WorkDay workDay = new WorkDay();
		System.out.println("Nhap thong tin ngay cong: ");
	
		workDay.setLocalDate(LocalDate.now());
		System.out.println("Ngay: " + workDay.getLocalDate());
		System.out.println("Co di lam khong? 1. Co	2. Khong");
		Integer option = scan.nextInt();
		if (option == 1) {
			workDay.setWork(true);
		} else {
			System.out.println("Nghi Phep hay Khong Phep? 1. Phep	2. Khong phep" );
			option = scan.nextInt();
			workDay.setBeOnLeave(option == 1 ? true : false);
		}
		this.getWorkdays().add(workDay);	
	}
}
