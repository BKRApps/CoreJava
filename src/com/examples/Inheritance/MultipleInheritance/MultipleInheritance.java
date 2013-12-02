package com.examples.Inheritance.MultipleInheritance;


public class MultipleInheritance implements Sample1, Sample2 {

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Interface Sample2:display1()");
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("Interface Sample2:display2()");
	}

	@Override
	public void print1() {
		// TODO Auto-generated method stub
		System.out.println("Interface Sample1:print1()");
	}

	@Override
	public void print2() {
		// TODO Auto-generated method stub
		System.out.println("Interface Sample1:print2()");
	}
	
	public void add(){
		System.out.println("Class MultipleInheritance:add()");
	}

}
