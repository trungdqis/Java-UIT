package GK1819;

import java.time.LocalDate;

public class WorkDay {
	private LocalDate localDate;
	private boolean isWork;
	private Integer shift;
	private boolean beOnLeave;
	private Double coefficientsFringeBenefits;

	public boolean isWork() {
		return isWork;
	}

	public void setWork(boolean isWork) {
		this.isWork = isWork;
	}

	public Integer getShift() {
		return shift;
	}

	public void setShift(Integer shift) {
		this.shift = shift;
	}

	public boolean isBeOnLeave() {
		return beOnLeave;
	}

	public void setBeOnLeave(boolean beOnLeave) {
		this.beOnLeave = beOnLeave;
	}

	public Double getCoefficientsFringeBenefits() {
		return coefficientsFringeBenefits;
	}

	public void setCoefficientsFringeBenefits(Double coefficientsFringeBenefits) {
		this.coefficientsFringeBenefits = coefficientsFringeBenefits;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
}
