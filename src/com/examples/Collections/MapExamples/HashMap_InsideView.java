package com.examples.Collections.MapExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMap_InsideView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Example1,String> map=new HashMap<Example1,String>();
		Example1 example1=new Example1(5);
		Example1 example2=new Example1(5);
		
		map.put(example2, "One");
		example2.setI(10);
		System.out.println("Value\t"+map.get(example1));
		System.out.println("Value\t"+map.get(example2));
	}
}

class Example1{
	private int i;
	public Example1(int i){
		this.i=i;
	}
	@Override
	public int hashCode(){
		int primeNumber=31;
		int result=1;
		return primeNumber*result+i;
	}
	@Override
	public boolean equals(Object obj){
		System.out.println("Entered");
		if(obj==null)
			return false;
		if(obj==this){
			return true;
		}
		if(!(obj instanceof Example1))
			return false;
		else{
			Example1 ex=(Example1)obj;
			System.out.println("Values Comparing\t"+i+"\t"+ex.i);
			if(i==ex.i){
				return true;}
		}
		return false;
	}
	
	public void setI(int i){
		this.i=i;
	}
}