package com.examples.ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeClass> list=new ArrayList<EmployeeClass>();
		EmployeeClass temp;
		EmployeeClass ec1=new EmployeeClass("Kumar",4);
		EmployeeClass ec2=new EmployeeClass("Reddy",2);
		EmployeeClass ec3=new EmployeeClass("Ashok",1);
		EmployeeClass ec4=new EmployeeClass("Bharath",3);
		
		list.add(ec1);list.add(ec2);list.add(ec3);list.add(ec4);
		
		Iterator<EmployeeClass> it=list.iterator();
		
		System.out.println("Before Sorting");
		while(it.hasNext()){
			temp=(EmployeeClass)it.next();
			System.out.println("EmpName\t"+temp.getepmName()+"\tEpmNumber\t"+temp.getempNumber());
		}
		Collections.sort(list,new ImplementComparator1());
		System.out.println("After Sorting with Employee Number");
		it=list.iterator();
		while(it.hasNext()){
			temp=(EmployeeClass)it.next();
			System.out.println("EmpName\t"+temp.getepmName()+"\tEpmNumber\t"+temp.getempNumber());
		}
		
		/* Anonymous class */
		Comparator<EmployeeClass> implementComparator2=new Comparator<EmployeeClass>(){

			@Override
			public int compare(EmployeeClass obj1, EmployeeClass obj2) {
				// TODO Auto-generated method stub
				return obj1.getepmName().compareTo(obj2.getepmName());
			}
			
		};
	  System.out.println("After Sorting with Employee Name");
	  Collections.sort(list,implementComparator2);
	  it=list.iterator();
	  while(it.hasNext()){
			temp=(EmployeeClass)it.next();
			System.out.println("EmpName\t"+temp.getepmName()+"\tEpmNumber\t"+temp.getempNumber());
		}
	}

}

class ImplementComparator1 implements Comparator<EmployeeClass>{

	@Override
	public int compare(EmployeeClass obj1, EmployeeClass obj2) {
		// TODO Auto-generated method stub
		return (obj1.getempNumber()<obj2.getempNumber() ?1:-1);
	}
		
}
