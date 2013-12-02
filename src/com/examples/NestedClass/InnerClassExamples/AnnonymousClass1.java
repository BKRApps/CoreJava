package com.examples.NestedClass.InnerClassExamples;

public class AnnonymousClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person1 p= new Person1(){
			public void print2(){
				System.out.println("In Person1:Print2");
			}
		};
		p.print1();
		p.print2();
	}

}

abstract class Person1{
	
	public void print1(){
		System.out.println("In Person1:Print");
		}
	
	abstract void print2();
}
