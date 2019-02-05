package com.cg.payroll.services;

import java.util.List;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.daoservices.AssociateDAOImpl;
import com.cg.payroll.exceptions.AssociateDetailNotfoundException;

public class PayrollServicesImpl implements PayrollServices{
	private AssociateDAO associateDAO=new AssociateDAOImpl();

	@Override
	public int acceptAssociateDetails(String firstName, String lastName, String emailId, String department,
			String designation, String pancard, int yearlyInvestmentUnder80C, int basicSalary, int epf, int companyPf,
			int accountNumber, String bankName, String ifscCode) {
		BankDetails bankDetails=new BankDetails(accountNumber,bankName,ifscCode);
		Salary salary=new Salary(basicSalary,epf,companyPf);
		Associate associate=new Associate(yearlyInvestmentUnder80C,firstName,lastName,department,designation,pancard,emailId,salary,bankDetails);
		
		//Associate associate=new Associate(yearlyInvestmentUnder80C,firstName,lastName,department,designation,pancard,emailId,new Salary(basicSalary,epf,companyPf),new BankDetails(accountNumber,bankName,ifscCode));
		
		associate=associateDAO.save(associate);
		return associate.getAssociateId();
		
		//return associateDAO.save(new Associate(yearlyInvestmentUnder80C,firstName,lastName,department,designation,pancard,emailId,new Salary(basicSalary,epf,companyPf),new BankDetails(accountNumber,bankName,ifscCode)));
	}

	@Override
	public int calculateNetSalary(int associateId) throws AssociateDetailNotfoundException {
		Associate associate=getAssociateDetails(associateId);
		int netSalary=0,grossSalary=0,monthlyTax=0,yearlyTax=0;
		associate.getSalary().setHra((int)(associate.getSalary().getBasicsalary()*0.3));
		associate.getSalary().setCompanyPf((int)(associate.getSalary().getBasicsalary()*0.3));
		associate.getSalary().setPersonalAllowance((int)(associate.getSalary().getBasicsalary()*0.25));
		associate.getSalary().setOtherAllowance((int)(associate.getSalary().getBasicsalary()*0.2));
		grossSalary=(associate.getSalary().getBasicsalary())+associate.getSalary().getHra()+associate.getSalary().getCompanyPf()
				+associate.getSalary().getPersonalAllowance()+associate.getSalary().getOtherAllowance();
		int annualGrossSalary=grossSalary*12;
		int investment=associate.getYearlyInvestmentUnder80C()+associate.getSalary().getCompanyPf()+associate.getSalary().getEpf();
		if(investment>150000)
			investment=150000;
		int taxableAmount=grossSalary;
		if(annualGrossSalary<=250000){
			associate.getSalary().setMonthlyTax(0);
		}
		else if(annualGrossSalary>250000&&annualGrossSalary<=500000){
			taxableAmount=annualGrossSalary-250000;
			if(taxableAmount>investment)
			monthlyTax=(int)(grossSalary*0.01);
		}
		else if(annualGrossSalary>500000&&annualGrossSalary<=1000000)
		{
			grossSalary=grossSalary-associate.getYearlyInvestmentUnder80C();
			monthlyTax=(int)(grossSalary*0.02);
		}
		else if(annualGrossSalary>1000000) {
			taxableAmount-=investment;
			monthlyTax=(int)(grossSalary*0.03);
			associate.getSalary().setMonthlyTax(monthlyTax);
		}
		else
			monthlyTax=0;
		netSalary=grossSalary-associate.getSalary().getCompanyPf()-associate.getSalary().getEpf();
		return netSalary;
	}

	@Override
	public Associate getAssociateDetails(int associateId) throws AssociateDetailNotfoundException {
		Associate associate=associateDAO.findOne(associateId);
		if(associate==null)
			throw new AssociateDetailNotfoundException("Associate details not found for id"+associateId);
		
		return associate;
	}

	@Override
	public List<Associate> getAllAssociatesDetails() {
		return associateDAO.findAll();
	}

}
