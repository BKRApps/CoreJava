package com.examples.Inheritance.ProtectedInheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DerivedClass d=new DerivedClass();
		/*d.noData();*/ /* you can not access the protected member */
		d.getData();
		d.putData();
	}

}
