package com.cg.payroll.client;

import java.util.List;
import java.util.Scanner;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class MainClass {

	public static void main(String[] args) {
//		PayrollServices services=new PayrollServicesImpl();
//		int associateId=services.acceptAssociateDetails("Satish", "Mahajan", "satish@gmail.com", "YTP", "Sr Con.", "CHDYBA", 120000, 50000, 5000, 6000, 50987654, "Axis bank", "AXIS3445");
//		System.out.println("Associate Id:-"+associateId);
//		
//		PayrollServices services1=new PayrollServicesImpl();
//		int associateId1=services.acceptAssociateDetails("Anup", "Banerjee", "anup@gmail.com", "YTP", "Intern", "CHXYBA", 120000, 50000, 5000, 6000, 50987654, "Axis bank", "AXIS3445");
//		System.out.println("Associate Id:-"+associateId1);
//		
		Scanner sc=new Scanner(System.in);
//		PayrollServices serv1=new PayrollServicesImpl();
//		System.out.println("Enter associate Id to find details");
//		int id=sc.nextInt();
//		Associate associateDetails=serv1.getAssociateDetails(id);
//		System.out.println(associateDetails);
		
		System.out.println("--------------------Payroll System-------------------");
		char ch='Y';
		while(ch=='Y'|ch=='y') {
			System.out.println("Enter your choice:\n1.Save Associate \n2.Get AssociateDetails \n3.Get all AssociateDeyails \n4.CalculateSalary");
			int choice=sc.nextInt();
			switch(choice){
			case 1:
				PayrollServices services=new PayrollServicesImpl();
				int associateId=services.acceptAssociateDetails("Satish", "Mahajan", "satish@gmail.com", "YTP", "Sr Con.", "CHDYBA", 120000, 50000, 5000, 6000, 50987654, "Axis bank", "AXIS3445");
				System.out.println("Associate Id:-"+associateId);
				break;
			case 2:
				PayrollServices ser1=new PayrollServicesImpl();
				System.out.println("Enter associateId to find details");
				int id=sc.nextInt();
				Associate associateDetails=ser1.getAssociateDetails(id);
				System.out.println(associateDetails);
				break;
			case 3:
				PayrollServices ser2=new PayrollServicesImpl();
				List<Associate>allAssociateDetails=ser2.getAllAssociatesDetails();
				break;
			case 4:
				//Associate associate=new Associate();
				PayrollServices ser3=new PayrollServicesImpl();
				System.out.println("Enter associateId to calculate net salary");
				id=sc.nextInt();
				int netSalary=ser3.calculateNetSalary(id);
				System.out.println("NetSalary="+netSalary);
		//		System.out.println("MonthlyTax="+associate.getSalary().getMonthlyTax());
				break;
			default:
				System.out.println("Please enter a valid number");
				break;
			}
			System.out.println("Do you want to continue(y/n):");
			ch=sc.next().charAt(0);
			
		}
	}

}
