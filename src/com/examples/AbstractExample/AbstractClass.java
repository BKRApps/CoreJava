package com.examples.AbstractExample;

public abstract class AbstractClass {
	
	public AbstractClass(){
		System.out.println("Calling Constructor");
	}
	public void print1(){
		System.out.println("In AbstractClass:Print1()");
	}
	
	public void print2(){
		System.out.println("In AbstractClass:print2()");
	}

	abstract public void display1();

    abstract public void display2();

}
