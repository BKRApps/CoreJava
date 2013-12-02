package com.examples.SingletonPattern;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonExample singletonObject;
		
		singletonObject=SingletonExample.getInstance();
		singletonObject.display1();
		
		singletonObject=SingletonExample.cloneSingleton();
		singletonObject.display1();
		
	}
}
