package com.examples.Inheritance.ProtectedInheritance;

import com.examples.Inheritance.SimpleInheritance.BaseClass;

public class DerivedClass extends BaseClass{
	
	public void display(){
		noData(); /* It will become private in other package */
	}
}
