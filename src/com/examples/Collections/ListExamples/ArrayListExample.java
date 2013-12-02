package com.examples.Collections.ListExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list2=null;
		list2.size();
		list.add(new Integer(10));
		list.add(new Integer(10));
		
		Iterator<Integer> it=list.iterator();
		
		System.out.println("ArrayList Elements");
		
		while(it.hasNext()){
			System.out.println(it.next());
			/*it.remove();*//*Iterators support remove operation where as enumerators does not*/
		}
	}
}
