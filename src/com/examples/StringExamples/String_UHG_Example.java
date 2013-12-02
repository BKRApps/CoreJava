package com.examples.StringExamples;

public class String_UHG_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("ABC");
		String s2="ABC";
		/* are s1 and s2 are same ?*/
		//s1.concat("Kumar");
	//	s2=s2.concat("Reddy");
		System.out.println(s1==s2);
		System.out.println(s1.compareTo(s2));
		System.out.println("S1\t"+s1+"\nS2\t"+s2);
	}

}

