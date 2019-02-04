package com.cg.payroll.client;

import java.util.Scanner;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class MainClass {

	public static void main(String[] args) {
		PayrollServices services=new PayrollServicesImpl();
		int associateId=services.acceptAssociateDetails("Satish", "Mahajan", "satish@gmail.com", "YTP", "Sr Con.", "CHDYBA", 120000, 50000, 5000, 6000, 50987654, "Axis bank", "AXIS3445");
		System.out.println("Associate Id:-"+associateId);
		
		PayrollServices services1=new PayrollServicesImpl();
		int associateId1=services.acceptAssociateDetails("Anup", "Banerjee", "anup@gmail.com", "YTP", "Intern", "CHXYBA", 120000, 50000, 5000, 6000, 50987654, "Axis bank", "AXIS3445");
		System.out.println("Associate Id:-"+associateId1);
		
		Scanner sc=new Scanner(System.in);
		PayrollServices serv1=new PayrollServicesImpl();
		System.out.println("Enter associate Id to find details");
		int id=sc.nextInt();
		Associate associateDetails=serv1.getAssociateDetails(id);
		System.out.println(associateDetails);
	}

}
