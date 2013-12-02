package com.examples.NestedClass.StaticNestedClassExample;

public class StaticNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample.Inner in=new Sample.Inner();
		in.print();
	}

}

class Sample{
	static int a=10;
	int b=20;
	public void display(){
		System.out.println("Display");
	}
	
	static class Inner{
		public void print(){
			System.out.println("In Static Nested Class");
			System.out.println("Value of a \t"+a);
			/*System.out.println("Value of b \t"+b);*/
		}
	}
}