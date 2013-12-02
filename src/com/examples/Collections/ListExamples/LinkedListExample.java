package com.examples.Collections.ListExamples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new LinkedList<String>();
		
		list.add("KumarReddy");
		list.add("KumarReddy");
		
		Iterator<String> it=list.iterator();
		System.out.println("LinkedList Elements");
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
