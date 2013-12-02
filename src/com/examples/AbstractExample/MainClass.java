package com.examples.AbstractExample;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Can not instantiate an abstract class */
		/*AbstractClass as=new AbstractClass();*/
		
		AbstractClass aec=new AbstractExtendClass();
	        
		aec.print1();
		aec.print2();
		
	    aec.display1();
	    aec.display2();
		
	}

}


