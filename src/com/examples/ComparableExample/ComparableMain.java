package com.examples.ComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeClass> list=new ArrayList<EmployeeClass>();
		
		EmployeeClass ec1=new EmployeeClass("Kumar",3);
		EmployeeClass ec2=new EmployeeClass("Reddy",1);
		EmployeeClass ec3=new EmployeeClass("Ashok",2);
		EmployeeClass ec4=new EmployeeClass("Bharath",4);
		
		list.add(ec1);list.add(ec2);list.add(ec3);list.add(ec4);
		
		System.out.println("Before Sorting");
		Iterator<EmployeeClass> it=list.iterator();
		while(it.hasNext()){
			EmployeeClass temp=(EmployeeClass)it.next();
			System.out.println("EmpName:"+temp.getempname()+"\tEmpNumber:"+temp.getempNumber());
		}
		System.out.println("After Sorting");
		Collections.sort(list);
		it=list.iterator();
		while(it.hasNext()){
			EmployeeClass temp=(EmployeeClass)it.next();
			System.out.println("EmpName:"+temp.getempname()+"\tEmpNumber:"+temp.getempNumber());
		}
	}

}
