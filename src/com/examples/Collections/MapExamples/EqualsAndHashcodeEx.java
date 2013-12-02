package com.examples.Collections.MapExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* HashMap working architecture ::
 * when you put a new <key,value> Object, the HashMap, will first calls the hashCode() method
 * to generate the hashCode. It will insert the key,value into the hashCode index position.
 * Whenever there is a same hasCode generated, then it will call the equals() method to check 
 * whether they are same objects. The default implementation of the equals() will check the 
 * references. If that is false, then it will insert the value in the same bucket.
 *
 * With this approach, you might have the duplicate data. because even if you get the same hashCode, 
 * the two objects will not be equal().
 * 
 * So we need to override the equals() method, write some code that will compare parameters 
 * of the objects  to check two objects are equal. At the same time we need to override the 
 * hashCode() method also.
 *  
 *  If we override the equals() and did not override the hashCode() method, then you might not get the 
 *  same hashCode for the equal objects. If the hashCode is different, then equals() method will not be called.
 *  it is of no use 
 *  
 *  If we override the hashCode() method and not equals(), we will get the same hashCode for two same objects, but then the 
 *  map will call equals() method, where it fails because the objects references are different.
 * 
 * */
public class EqualsAndHashcodeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1=new Sample("Kumar","Hyderabad");
		Sample s2=new Sample("KumarReddy","Hyderabad");
		Sample temp;
		/*boolean res=s1.equals(s2);
		System.out.println("Result \t"+res);*/
		Map<Sample,String> m=new HashMap<Sample,String>();
		m.put(s1,new String("Sample1 Object"));
		m.put(s2,new String("Sample2 Object"));
		/*s1.name="Reddy"; */ /* In HashMap the keys should be immutable, otherwise 
		 * if i change the value now, then it will compute the new hashCode and as it is  not 
		 * exist. it will give you the null 
		 */
		System.out.println(m.get(s1));
		Set<Sample> set=m.keySet();
		Iterator<Sample> it=set.iterator();
		while(it.hasNext()){
			temp=(Sample)it.next();
			System.out.println("Key is \t"+temp.name+" "+temp.address+"\t Values \t"+m.get(temp));
		}
				
	}

}

final class Sample{

	public   String name,address;
	
	public  Sample(String name,String address){
		this.name=name;
		this.address=address;
	}
	
	@Override
	public int hashCode(){
		System.out.println("Step1");
		final int prime=31;
		int result=1;
		result=result*prime+((name==null)?0:name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj){
		
		System.out.println("Step2");
		if(obj==null)
			return false;
		if(obj==this)
			return true;
		if(!(obj instanceof Sample))
			return false;
		else{
			Sample s=(Sample)obj;
			if(name.equals(s.name))
				return true;
		}
		return false;
	}
	
}
		

