package com.examples.CloneExample;

public class MainClass {
	 
    public static void main(String[] args) throws CloneNotSupportedException {
 
  //Original Object
 
  Person p = new Person("Person-A", "Civic");
  System.out.println("Original (orginal values): " + p.getName() + " - "+ p.getCarName());
 
   //Clone as a shallow copy
 
  Person q = (Person) p.clone();
   System.out.println("Clone (before change): " + q.getName() + " - " + q.getCarName());
 
   //change the primitive member
   q.setName("Person-B");
 
  //change the lower-level object
   q.setCarName("Accord");
 
  System.out.println("Clone (after change): " + q.getName() + " - " + q.getCarName());
  System.out.println("Original (after clone is modified): " + p.getName()+ " - " + p.getCarName());
 
   }
}
