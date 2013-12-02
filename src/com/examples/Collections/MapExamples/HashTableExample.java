package com.examples.Collections.MapExamples;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		
		ht.put(new Integer(1),"Kumar");
		ht.put(new Integer(2),"Reddy");
		ht.put(new Integer(3),"Bharath");
		ht.put(new Integer(3),"Bharath Kumar");
		//ht.put(null,null);
		System.out.println("Printing the value of 1 \t"+ht.get(new Integer(1)));
		System.out.println("Printing all values with Enumearator");
		
		Enumeration<Integer> et =ht.keys();
		while(et.hasMoreElements()){
			Integer key=(Integer)et.nextElement();
			System.out.println("Key\t"+key+"\t Value \t"+ht.get(key));
		}
		
	  System.out.println("Printing all values with Set");
	  Set<Integer> s=ht.keySet();
	  Iterator<Integer> it=s.iterator();
	  while(it.hasNext()){
		  Integer key=(Integer)it.next();
		  System.out.println("Key\t"+key+"\t Value\t"+ht.get(key));
	  }
	}

}
