package com.examples.Inheritance.SimpleInheritance;

public class BaseClass {
	
	private String name="";
	protected BaseClass(){
		
	}
	
	public BaseClass(String name){
		this.name=name;
		System.out.println("Name received is"+this.name);
	}
	
	public void getData(){
		System.out.println("In Base:getData Function");
	}
	
	public void putData(){
		System.out.println("In Base:putData Function");
	}
	
	protected void noData(){
		System.out.println("In Base:noData Function");
	}
	
	public static void statData(){
		System.out.println("In Base:statData Function");
	}
}
