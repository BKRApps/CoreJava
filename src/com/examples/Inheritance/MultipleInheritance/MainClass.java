package com.examples.Inheritance.MultipleInheritance;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 s1=new MultipleInheritance();
		/* s1 Object can not access add(),display1() and display2() 
		 * It can access only the methods declared in Sample1 Interface*/
		s1.print1();
		s1.print2();
				
		Sample2 s2=new MultipleInheritance();
		/*s2 Object can not access add(),print1() and print2().
		 * It can access only the methods declared in Sample2 Interface*/
		s2.display1();
		s2.display2();
		s2.print1();
		MultipleInheritance m1=new MultipleInheritance();
		/*m1 object can access everything declared in the class MultipleInheritance*/
		m1.print1();	m1.print2();
		m1.display1();m1.display2();
		m1.add();
	}

}
