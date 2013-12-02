package com.examples.CloneExample;

class Person implements Cloneable {
    
    private Car car;
    private String name;
 
    public Person(String s, String t) {
	    name = s;
	    car = new Car(t);
    }
    public String getName() {
    		return name;
    }
    public void setName(String s) {
    	 name = s;
    }
    public void setCarName(String s){
    	car.setName(s);
    }
    public String getCarName(){
    	return car.getName();
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
 
   //Deep copy
     Person p = new Person(name, car.getName());
    return p;
   /* Shallow Copy */
    //return super.clone();
    }
}
 
class Car {
 
    private String name;
       
    public Car(String s) {
        name = s;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String s) {
        name = s;
    }
   
}