package com.examples.Inheritance.SimpleInheritance;

public class DerivedClass1 extends BaseClass{
	
	private int no;
	public DerivedClass1(){
		
	}
	
	public DerivedClass1(int no){
		this.no=no;
		System.out.println("Number received is"+this.no);
	}
	
	public DerivedClass1(int no,String name){
		super(name);
		this.no=no;
		System.out.println("Number received is"+this.no);
	}
	
	public void getData(){
		System.out.println("In Derived:getData Function");
	}
	
	public void putData(){
		System.out.println("In Derived:putData Function");
	}
	public static void statData(){
		System.out.println("In Derived:statData Function");
	}
}
