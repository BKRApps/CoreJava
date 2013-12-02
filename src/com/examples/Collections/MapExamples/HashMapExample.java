package com.examples.Collections.MapExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(null,null);
		Integer one=new Integer(1);
		Integer two=new Integer(2);
		Integer three=new Integer(3);
		Integer three_dup=new Integer(3);
		hm.put(one,"Kumar");
		hm.put(two,"Reddy");
		hm.put(three,"Bharath");
		hm.put(three_dup,"BharathBabu");
		System.out.println("Length"+hm.size());
		System.out.println(hm.get(three));
		System.out.println(hm.get(three_dup));
		System.out.println("Printing the value of key 2\t"+hm.get(new Integer(2)));
		Set<Integer> s=hm.keySet();
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()){
			Integer key=(Integer)it.next();
			System.out.println("Key\t"+key+"\t Value\t"+hm.get(key));
		}
	}
}
