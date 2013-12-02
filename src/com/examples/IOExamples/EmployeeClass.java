package com.examples.IOExamples;

import java.io.Serializable;

public class EmployeeClass implements Serializable{

	/**
	 * 
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = -5217405156353321762L;
	private int stNumber;
	private transient String stName;
	
	public int getStudentNumber(){
		return this.stNumber;
	}
	
	public String getStudentName(){
		return this.stName;
	}
	
	public void setStudentName(String name){
		stName=name;
	}
	
	public void setStudentNumber(int number){
		stNumber=number;
	}
}
