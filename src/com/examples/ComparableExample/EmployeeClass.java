package com.examples.ComparableExample;

public class EmployeeClass implements Comparable<EmployeeClass>{
	
	private String empName;
	private int empNumber;
	
	public EmployeeClass(String empName,int empNumber){
		this.empName=empName;
		this.empNumber=empNumber;
	}
	public void setempName(String empName){
		this.empName=empName;
	}
	
	public void setempNumber(int empNumber){
		this.empNumber=empNumber;
	}
	
	public String getempname(){
		return this.empName;
	}
	
	public int getempNumber(){
		return this.empNumber;
	}

	@Override
	public int compareTo(EmployeeClass obj1) {
		// TODO Auto-generated method stub
		/*return (this.empNumber<obj1.empNumber)?-1:1;*/  /* By empNumber */
		return (this.getempname().compareTo(obj1.getempname()));/*by empName*/
	 }

}
