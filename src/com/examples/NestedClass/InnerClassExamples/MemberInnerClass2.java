package com.examples.NestedClass.InnerClassExamples;

public class MemberInnerClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 o=new Outer2();
		o.display();
		Outer2.Inner i=o.new Inner();
		i.print();
	}

}
class Outer2{
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
	}
}