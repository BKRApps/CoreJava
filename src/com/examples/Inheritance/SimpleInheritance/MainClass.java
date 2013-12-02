package com.examples.Inheritance.SimpleInheritance;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* BaseClass object creation, it is like creating object for normal class*/
		BaseClass bc=new BaseClass("Kumar");
		bc.getData();
		bc.putData();
		
		/*DerivedClass1 object creation,*/
		DerivedClass1 dc=new DerivedClass1(100);
		dc.getData();
		dc.putData();
		dc.noData();
		
		DerivedClass1.statData();  /* you can call Baseclass Static function from the derived class */
		BaseClass.statData();
		
		/*Assign DerivedClass1 object to BaseClass*/
		BaseClass bc1=new DerivedClass1(2000);
		bc1.getData();
		bc1.putData();
		bc1.noData();
		
		/*DerivedClass1 dc1=(DerivedClass1)new BaseClass(); /* It will give you the run time error*/
		 
	}

}
