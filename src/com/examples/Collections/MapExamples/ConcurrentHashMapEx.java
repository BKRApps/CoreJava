package com.examples.Collections.MapExamples;

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;
/* Difference between the Collections.synchronizedmap and ConcurrentHashMap
 * are the former one allow null values where as the later one does not allow.
 * 
 *  The synchronized collections classes, Hash able and Vector, and the synchronized wrapper 
 *  classes, Collections.synchronizedMap and Collections.synchronizedList, provide a basic 
 *  conditionally thread-safe implementation of Map and List. However, several factors make 
 *  them unsuitable for use in highly concurrent applications  for example their single collection-wide lock 
 *  is an impediment to scalability and it often becomes necessary to lock a collection for a 
 *  considerable time during iteration to prevent ConcurrentModificationException.

 *  ConcurrentHashMap only locked certain portion of Map while Hash table lock 
 *  full map while doing iteration.
 *  
 *  http://javarevisited.blogspot.in/2011/04/difference-between-concurrenthashmap.html
 * */
public class ConcurrentHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<Integer,String> chm=new ConcurrentHashMap<Integer,String>();
		
    	chm.put(new Integer(10),"Kumar");
    	chm.put(new Integer(20),"Reddy");
    	chm.put(new Integer(10),"Kumar");
    	/*chm.put(null,null);*/ /* It will not allow null values. it will throw null pointer exception */
    	Enumeration<Integer> en=chm.keys();
    	while(en.hasMoreElements()){
    		Integer key=en.nextElement();
    		System.out.println("Key\t"+key+"\t Value\t"+chm.get(key));
    	}
	}

}

