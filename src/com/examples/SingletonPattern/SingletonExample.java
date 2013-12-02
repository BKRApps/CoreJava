package com.examples.SingletonPattern;

/* If the constructor is private you can not create an object from outside.
 *  In java, if you want to create an object, the class must have public constructor.
 *  By default the object class have the default public constructor.
 * 
 *  We can also clone SingleTon object, so to avoid it, Override the clone()
 * method of the Object.*/
public class SingletonExample implements Cloneable{

	static SingletonExample singletonInstance=null;
	static SingletonExample singletonInstanceClone=null;

	private SingletonExample(){ 
		}
	
	public static SingletonExample getInstance(){
		if(singletonInstance==null)
			singletonInstance=new SingletonExample();
		return singletonInstance;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException("Clone Not Supported for SingleTon");
	}
	public static SingletonExample cloneSingleton(){
		if(singletonInstance==null)
			singletonInstance=new SingletonExample();
		try {
				singletonInstanceClone=(SingletonExample)singletonInstance.clone();
			}	catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return singletonInstanceClone;
	 }
  	
	public void display1(){
		System.out.println("In SingletonExample:display1()");
	}
}

