package com.examples.StringExamples;

public class ReverseWordsInString {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder input=new StringBuilder("abc def ghi jkl");	
		int i=0,j=0,k=0;
		
		while(i<input.length()){
			k=i;  /*find out the space */
			for(;i<input.length();i++){
				if(input.charAt(i)==32){
					j=i;
					i++;
					break;
				}
			}
		  reverse(k,j-1,input);
		}
	    reverse(k,i-2,input);
	    System.out.println("Result \t"+input.toString());
   }
	
  public static void reverse(int k,int j,StringBuilder input){
		for(;k<j;k++,j--){
			   char temp;
			   temp=input.charAt(k);
			   input.setCharAt(k,input.charAt(j));
			   input.setCharAt(j, temp);
		   }
		
	}

}
