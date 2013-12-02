package com.examples.Collections.ListExamples;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v1=new Vector<Integer>();
		
		v1.add(new Integer(10));
		Enumeration<Integer> e=v1.elements();
		
		System.out.println("Vector Elements");
		
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}

}
