package com.examples.Collections.SetExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetOverrideExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example example;
		Set<Example> set=new HashSet<Example>();
		set.add(new Example(10));
		set.add(new Example(20));
		set.add(new Example(30));
		set.add(new Example(40));
		set.add(new Example(5));
		set.add(new Example(5));
		set.add(new Example(100));
		
		Iterator<Example> it=set.iterator();
		while(it.hasNext()){
			example=(Example)it.next();
			System.out.println(example.i);
		}
	}
	
}
class Example{
	int i;
	static int index=0;
	public Example(int i){
		this.i=i;
	}
	@Override
	public int hashCode(){
	   return i;
	}
	@Override
	public boolean equals(Object obj){
		System.out.print("Comparing\t");
		if(obj==null)
			return false;
		if(obj==this)
			return true;
		if(!(obj instanceof Example))
			return false;
		else{
			Example ex=(Example)obj;
			if(i==ex.i){
				System.out.println(i+"\t"+ex.i);
				return true;
			}
		}
		return false;
	}
}
