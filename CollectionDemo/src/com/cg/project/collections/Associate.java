package com.cg.project.collections;

public class Associate  implements Comparable<Associate>{
	int associateId;
	String firstName,lastName;
	int basicSalary;
	public Associate() {};
	
	
	public Associate(int associateId, String firstName, String lastName, int basicSalary) {
		super();
		this.associateId = associateId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.basicSalary = basicSalary;
	}


	public int getAssociateId() {
		return associateId;
	}


	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getBasicSalary() {
		return basicSalary;
	}


	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}


	public String toString()
	{
		return"Associate[associateId="+associateId+",firstName="+firstName+"lastName="+lastName+","
				+ "basicSalary"+basicSalary+"]";
	}

	@Override
	public int compareTo(Associate o) {
		// TODO Auto-generated method stub
		return this.basicSalary-o.basicSalary;
	}

}
