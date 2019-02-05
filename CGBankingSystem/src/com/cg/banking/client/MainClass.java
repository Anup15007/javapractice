package com.cg.banking.client;

import java.util.List;
import java.util.Scanner;

import com.cg.banking.beans.Account;
import com.cg.banking.services.BankingServices;
import com.cg.banking.services.BankingServicesImpl;
class MainClass {
	public static void main(String[] args) {
//		BankingServices bankingServices=new BankingServicesImpl();
//		bankingServices.openAccount("Savings", 10000);
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------------Banking System-------------------");
		char ch='Y';
		while(ch=='Y'|ch=='y') {
			System.out.println("Enter your choice:\n1.Open Account \n2.Get AcountDetails \n3.Get all AccountDetails \n4.CalculateSalary");
			int choice=sc.nextInt();
			switch(choice){
			case 1:
				BankingServices bankingservices=new BankingServicesImpl();
				System.out.println("Enter your account type:\n1.Savings \n 2.Current");
				int n=sc.nextInt();
				System.out.println("Enter initial Balance");
				int initBalance=sc.nextInt();
				if(n==1)
				System.out.println(bankingservices.openAccount("Savings", initBalance));
				else
					System.out.println(bankingservices.openAccount("Current", initBalance));
				break;
			case 2:
				bankingservices=new BankingServicesImpl();
				System.out.println("Enter accountNo. to find details");
				int accountNo=sc.nextInt();
				Account accountDetails=bankingservices.getAccountDetails(accountNo);
				System.out.println(accountDetails);
				break;
			case 3:
				bankingservices=new BankingServicesImpl();
				List<Account>allAssociateDetails=bankingservices.getAllAccountDetails();
				break;
			case 4:
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
