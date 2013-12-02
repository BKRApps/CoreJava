package com.examples.Collections.SetExamples;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Comparator<String> comp=new Comparator<String>(){

			@Override
			public int compare(String arg0, String arg1) {
				return arg0.compareTo(arg1);
			}
			
		};
		
		TreeSet<String> ts=new TreeSet<String>(comp);
		
		ts.add("E");
		ts.add("A");
		ts.add("Kumar");
		ts.add("Birapuram");
		
		Iterator<String> it=ts.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
