package com.examples.NestedClass.InnerClassExamples;

public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample3 s=new Sample3();
		s.display();
	}

}

class Sample3{
	private int a=10;
	public void display(){
		final int b=40;
		class Inner3{
			public void print(){
				System.out.println("In Local Inner Class");
				a=a+10;
				System.out.println(a);
				System.out.print(b);
			}
		}
		Inner3 in=new Inner3();
		in.print();
	  }
}
