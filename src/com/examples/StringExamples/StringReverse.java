package com.examples.StringExamples;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder input=new StringBuilder("KumarReddy");
		int i=0,j=0;
		j=input.length();
		
		reverse(i,j-1,input);
		System.out.println("Reverse String is \t"+input);
	}
	
	public static void reverse(int i,int j,StringBuilder input){
		char temp;
		for(;i<j;i++,j--){
			temp=input.charAt(i);
			input.setCharAt(i,input.charAt(j));
			input.setCharAt(j,temp);
		}
		
		
	}

}
