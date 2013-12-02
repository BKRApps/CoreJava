package com.examples.Collections.SetExamples;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<LinkedHashSetExample> lsSet = new LinkedHashSet<LinkedHashSetExample>();
		LinkedHashSetExample lhse = new LinkedHashSetExample(3);
		lsSet = lhse.readValuesToLinkedHashSet(lhse);
		lhse.displayValuesFromLinkedHashSet(lsSet);
	}

}

class LinkedHashSetExample {
	private int lhsSize;
	private String name;
	private int age;
	
	LinkedHashSetExample(int size) {
		lhsSize = size;
	}
	
	LinkedHashSetExample() {

	}
	
	LinkedHashSet<LinkedHashSetExample> readValuesToLinkedHashSet(LinkedHashSetExample lhObj) {
		LinkedHashSet<LinkedHashSetExample> lsSet = new LinkedHashSet<LinkedHashSetExample>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Reading values to linked hash set");
		for(int i = 0; i < lhsSize; i++) {
			try{
				lhObj = new LinkedHashSetExample();
				lhObj.name = br.readLine();
				lhObj.age = Integer.parseInt(br.readLine());
				
				lsSet.add(lhObj);
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		return lsSet;
	}
	
	public boolean equals(Object obj) {
		System.out.println("Equals method called");
	    if(!(obj instanceof LinkedHashSetExample))
			return false;
		else
		{
			LinkedHashSetExample lis=(LinkedHashSetExample)obj;
			System.out.println(name.length());
			System.out.println(lis.name.length());
			if(lis.name.equals(name)){
				System.out.println("Equal");
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		/*int retCode = 0;
		System.out.println("hash code string : "+name);
		for(int i =0; i < name.length(); i++)
		{
			retCode = retCode+name.charAt(i);
		}
		System.out.println("Hash code return value is: "+retCode);
		return retCode;*/
		return 1;
	}

	void displayValuesFromLinkedHashSet(LinkedHashSet<LinkedHashSetExample> lsSet2) {
		Iterator<LinkedHashSetExample> iter = lsSet2.iterator();
		System.out.println("Reading values from Linked HashSet");
		
		while(iter.hasNext()) {
			System.out.println("Values are: "+iter.next().toString());
		}
	}
	
	public String toString() {
		String str = this.name+" "+this.age;
		return str;
	}
}

