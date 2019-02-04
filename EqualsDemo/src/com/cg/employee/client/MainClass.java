package com.cg.employee.client;

import com.cg.employee.beans.Employee;

public class MainClass {

	public static void main(String[] args) {
	Employee emp1=new Employee(101,"Anup"," Banerjee",12000);
	Employee emp2=new Employee(101,"Anup"," Banerjee",12000);
	Object obj=emp2;
	
	if(emp1.equals(emp2))
		System.out.println(" same reference");
	else
		System.out.println("not same reference");
	if(obj.equals(emp2))
		System.out.println("same data");
	else
		System.out.println("not same data");

	}

}
