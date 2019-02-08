package com.cg.bank.client;

import java.util.Scanner;
import com.cg.bank.beans.Account;
import com.cg.bank.services.Services;
import com.cg.bank.services.ServicesImpl;

public class MainClass {
	public static void main(String[] args) {
		ServicesImpl ser=new ServicesImpl();
		Scanner sc=new Scanner(System.in);
		Account account = new Account();
		System.out.println("Enter the amount");
		int amt=sc.nextInt();
		account.setAmount(amt);
		boolean flag=true;
		while(flag==true) {
			System.out.println("Enter your choice \n1.Deposit\n2.Withdraw");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the amount to be deposit");
				amt=sc.nextInt();
				ser.deposit(amt);
				break;
			case 2:
				System.out.println("Enter the amount to be withdrawn");
				amt=sc.nextInt();
				ser.withdraw(amt);
				break;
			default:flag=false;
			}
		}
	}
}
