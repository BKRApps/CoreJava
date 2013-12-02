package com.examples.ComparatorExample;

public class EmployeeClass {
	
	private String empName;
	private int empNumber;
	
	public EmployeeClass(String empName,int empNumber){
		this.empName=empName;
		this.empNumber=empNumber;
	}
	
	public String getepmName(){
		return this.empName;
	}
	
	public int getempNumber(){
		return this.empNumber;
	}

}
