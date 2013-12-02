package com.examples.NestedClass.InnerClassExamples;

public class MemberInnerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 o=new Outer1();
		o.display();
		Outer1.Inner in=o.new Inner();
		in.print();
	}

}
class Outer1{
	private int a=10;
	class Inner{
		public void print(){
			System.out.println("Output from InnerClass");
			a=20;
			System.out.println("Value of a \t"+a);
		}
	}
	
	public void display(){
		System.out.println("Value of a \t"+a);
		Inner in=new Inner();
		in.print();
	}
}
