package com.examples.Collections.MapExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Example,String> map=new HashMap<Example,String>();
		Example example1=new Example(10);
		Example example2=new Example(10);
//		Example example3=new Example(30);
//		Example example4=new Example(40);
		
		map.put(example1, "One");
		map.put(example2, "Second");
		//map.put(example3, "Three");
		//map.put(example4, "Four");
		//example3.number=40;
		System.out.println("\n\nGetting");
		//System.out.println(map.get(example4));
	}

}

class Example{
	public int number;
	public Example(int number){
		this.number=number;
	}
	@Override
	public int hashCode(){
		System.out.println("HashCode");
		return number;
	}
	@Override
	public boolean equals(Object obj){
		System.out.println("In Equals");
		if(obj==null)
			return false;
		if(obj==this){
			return true;}
		if(!(obj instanceof Example))
			return false;
		else{
			Example ex=(Example)obj;
			System.out.println("Number1:"+number);
			System.out.println("Number2:"+ex.number);
			if(number==ex.number)
				return true;
		}
		return false;
	}
}