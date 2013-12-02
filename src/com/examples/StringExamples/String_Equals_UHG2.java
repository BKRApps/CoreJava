package com.examples.StringExamples;

/*  equals and  == , both are same, they will return true if
 * x and y are have the same reference.
 * However we can override the equals methods to get the desired behavior like
 * compare the contents not the reference.
 *  
 *  It is generally necessary to override the hashCode method whenever equals method is overridden, 
 *  so as to maintain the general contract for the hashCode method, which states that equal objects 
 *  must have equal hash codes. 
 * */
public class String_Equals_UHG2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 ex1=new Example2(10,"Kumar");
		Example2 ex2=new Example2(10,"Reddy");
		Example2 ex3=ex1;
		//ex3.no=30;
		boolean result1=(ex1==ex2);
		System.out.println("ex1==ex2\t"+result1);
		System.out.println("ex1.equals(ex2)\t"+ex1.equals(ex2));
		
		boolean result2=(ex1==ex3);
		System.out.println("ex1==ex3\t"+result2);
		System.out.println("ex1.equals(ex3)\t"+ex1.equals(ex3));
		
	}

}

class Example2{
	public int no;
	public String name;
	Example2(int no,String name){
		this.no=no;
		this.name=name;
	}
	@Override
	public int hashCode(){
		return no;
	}
	@Override
	public boolean equals(Object obj){
		Example2 ex=(Example2)obj;
		if(this.no==ex.no)
			return true;
	   return false;
	}
}

