package com.examples.Collections.SetExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1=new HashSet<String>();
		Set<Integer> set2=new HashSet<Integer>();
		
		set1.add("KumarReddy");
		set1.add("KumarReddy");
		
		Integer first=new Integer(10);
		Integer second=new Integer(20);
		Integer three=new Integer(40);
		Integer four=new Integer(10);
		
		set2.add(first);
		set2.add(second);
		set2.add(three);
		set2.add(four);
		Iterator<Integer> it=set2.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
