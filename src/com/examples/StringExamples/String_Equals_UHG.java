package com.examples.StringExamples;

/* equals returns true if and only if x and y refer to the same 
 * object (x == y has the value true). 
 * */
public class String_Equals_UHG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ex1=new Example(10,"Kumar");
		Example ex2=new Example(20,"Reddy");
		Example ex3=ex1;
		
		boolean result1=(ex1==ex2);
		System.out.println("ex1==ex2\t"+result1);
		System.out.println("ex1.equals(ex2)\t"+ex1.equals(ex2));
		
		boolean result2=(ex1==ex3);
		System.out.println("ex1==ex3\t"+result2);
		System.out.println("ex1.equals(ex3)\t"+ex1.equals(ex3));
		
	}

}

class Example{
	public int no;
	public String name;
	Example(int no,String name){
		this.no=no;
		this.name=name;
	}
}