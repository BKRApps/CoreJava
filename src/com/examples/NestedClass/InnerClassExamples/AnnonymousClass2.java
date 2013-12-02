package com.examples.NestedClass.InnerClassExamples;

public class AnnonymousClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p=new Person2(){
			public void print1(){
				System.out.println("In Person2:print1");
			}
		   public void print2(){
			   System.out.println("In Person2:print2");
		   }
		
	};
	
	p.print1();
	p.print2();

   }
}

interface Person2{
	
	public void print1();
	public void print2();
}
