package GK1819;

public class WorkDay {
	public String date;
	public Boolean isWork;
	public Integer shift;
	public Boolean beOnLeave;
	public Double coefficientsFringeBenefits;
	
	public WorkDay() {}
	
	public WorkDay (String date, Boolean isWork, Integer shift, Boolean beOnLeave, Double coefficientsFringeBenefits) {
		this.date = date;
		this.isWork = isWork;
		this.shift = shift;
		this.beOnLeave = beOnLeave;
		this.coefficientsFringeBenefits = coefficientsFringeBenefits;
	}
}
