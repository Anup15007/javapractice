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
		
		
		return 0;
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
