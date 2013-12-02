package com.examples.Collections.SetExamples;

import java.util.Iterator;
import java.util.LinkedHashSet;
/* If you want no duplicates and to preserve the order which you have given
 * use this LinkedHashSet.
 * */
public class LinkedHashSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> linkSet=new LinkedHashSet<Integer>();
		
		linkSet.add(10);
		linkSet.add(20);
		linkSet.add(30);
		linkSet.add(5);
		linkSet.add(10);
		
		Iterator<Integer> it=linkSet.iterator();
		while(it.hasNext()){
			System.out.println("Values\t"+it.next());
		}
	}

}
