package com.cg.payroll.beans;

public class Salary {
	private int basicsalary,hra,coveyenceAllowance;
	private int otherAllowance, personalAllowance,monthlyTax,epf;
	private int companyPf,grossSalary,netSalary;
	public Salary() {}
	
	
	public Salary(int basicsalary, int epf, int companyPf) {
		super();
		this.basicsalary = basicsalary;
		this.epf = epf;
		this.companyPf = companyPf;
	}


	public Salary(int basicsalary, int hra, int coveyenceAllowance, int otherAllowance, int personalAllowance,
			int monthlyTax, int epf, int companyPf, int grossSalary, int netSalary) {
		super();
		this.basicsalary = basicsalary;
		this.hra = hra;
		this.coveyenceAllowance = coveyenceAllowance;
		this.otherAllowance = otherAllowance;
		this.personalAllowance = personalAllowance;
		this.monthlyTax = monthlyTax;
		this.epf = epf;
		this.companyPf = companyPf;
		this.grossSalary = grossSalary;
		this.netSalary = netSalary;
	}


	public int getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(int basicsalary) {
		this.basicsalary = basicsalary;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getCoveyenceAllowance() {
		return coveyenceAllowance;
	}
	public void setCoveyenceAllowance(int coveyenceAllowance) {
		this.coveyenceAllowance = coveyenceAllowance;
	}
	public int getOtherAllowance() {
		return otherAllowance;
	}
	public void setOtherAllowance(int otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	public int getPersonalAllowance() {
		return personalAllowance;
	}
	public void setPersonalAllowance(int personalAllowance) {
		this.personalAllowance = personalAllowance;
	}
	public int getMonthlyTax() {
		return monthlyTax;
	}
	public void setMonthlyTax(int monthlyTax) {
		this.monthlyTax = monthlyTax;
	}
	public int getEpf() {
		return epf;
	}
	public void setEpf(int epf) {
		this.epf = epf;
	}
	public int getCompanyPf() {
		return companyPf;
	}
	public void setCompanyPf(int companyPf) {
		this.companyPf = companyPf;
	}
	public int getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(int grossSalary) {
		this.grossSalary = grossSalary;
	}
	public int getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + basicsalary;
		result = prime * result + companyPf;
		result = prime * result + coveyenceAllowance;
		result = prime * result + epf;
		result = prime * result + grossSalary;
		result = prime * result + hra;
		result = prime * result + monthlyTax;
		result = prime * result + netSalary;
		result = prime * result + otherAllowance;
		result = prime * result + personalAllowance;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salary other = (Salary) obj;
		if (basicsalary != other.basicsalary)
			return false;
		if (companyPf != other.companyPf)
			return false;
		if (coveyenceAllowance != other.coveyenceAllowance)
			return false;
		if (epf != other.epf)
			return false;
		if (grossSalary != other.grossSalary)
			return false;
		if (hra != other.hra)
			return false;
		if (monthlyTax != other.monthlyTax)
			return false;
		if (netSalary != other.netSalary)
			return false;
		if (otherAllowance != other.otherAllowance)
			return false;
		if (personalAllowance != other.personalAllowance)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Salary [basicsalary=" + basicsalary + ", hra=" + hra + ", coveyenceAllowance=" + coveyenceAllowance
				+ ", otherAllowance=" + otherAllowance + ", personalAllowance=" + personalAllowance + ", monthlyTax="
				+ monthlyTax + ", epf=" + epf + ", companyPf=" + companyPf + ", grossSalary=" + grossSalary
				+ ", netSalary=" + netSalary + ", getBasicsalary()=" + getBasicsalary() + ", getHra()=" + getHra()
				+ ", getCoveyenceAllowance()=" + getCoveyenceAllowance() + ", getOtherAllowance()="
				+ getOtherAllowance() + ", getPersonalAllowance()=" + getPersonalAllowance() + ", getMonthlyTax()="
				+ getMonthlyTax() + ", getEpf()=" + getEpf() + ", getCompanyPf()=" + getCompanyPf()
				+ ", getGrossSalary()=" + getGrossSalary() + ", getNetSalary()=" + getNetSalary() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
