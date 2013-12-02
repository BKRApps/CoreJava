package com.examples.Inheritance.Polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass1 bc;
		
		bc=new DerivedClass1();
		
		bc.print1();
		bc.print2();
		
		bc=new DerivedClass2();
		
		bc.print1();
		bc.print2();
		
	}

}
