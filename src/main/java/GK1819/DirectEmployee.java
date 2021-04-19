package GK1819;

import java.time.LocalDate;

public class DirectEmployee extends Employee {

	@Override
	public void input() {
		super.input();
		
		WorkDay workDay = new WorkDay();
		System.out.println("Nhap thong tin ngay cong: ");
	
		workDay.setLocalDate(LocalDate.now());
		System.out.println("Ngay: " + workDay.getLocalDate());
		Integer option;
		System.out.println("Co di lam khong? 1. Co	2. Khong");
		option = scan.nextInt();
		if (option == 1) {
			System.out.println("Ca nao? 1. Ca 1	2. Ca 2");
			option = scan.nextInt();
			workDay.setShift(option);
		} else {
			System.out.println("Nghi Phep hay Khong Phep? 1. Phep	2. Khong phep" );
			option = scan.nextInt();
			workDay.setBeOnLeave(option == 1 ? true : false);
		}
		this.getWorkdays().add(workDay);	
	}

}
