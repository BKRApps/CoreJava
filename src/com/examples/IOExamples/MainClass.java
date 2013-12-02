package com.examples.IOExamples;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,count=0;
		String  name;
		String condition;
		EmployeeClass emp;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try{
			fos=new FileOutputStream("empDetails1.txt");
			oos=new ObjectOutputStream(fos);
		}catch(IOException e){
			e.printStackTrace();
		}
		while(count<4){
			try{
			System.out.println("Go Ahead......> press Yes");
			condition=br.readLine();
			if(!condition.equals("Yes")){
				break;
			}
			System.out.println("Please Enter Student Name");
			name=br.readLine().toString();
			System.out.println("Please Enter Student Number");
			number=Integer.parseInt(br.readLine());
			emp=new EmployeeClass();
			emp.setStudentName(name);
			emp.setStudentNumber(number);
			oos.writeObject(emp);
			}catch(IOException ie){
				ie.printStackTrace();
			}
			finally{
				count++;
			}
		}
		try{
		br.close();
		fos.close();
		oos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		/* Reading from the File */
		System.out.println("Student Details");
		try{
		fis=new FileInputStream("empDetails1.txt");
		ois=new ObjectInputStream(fis);
		while(true){
		emp=(EmployeeClass)ois.readObject();
		System.out.println("Student Name\t"+emp.getStudentName()+"Number"+emp.getStudentNumber());
		 }
		}catch(IOException io){
			//io.printStackTrace();
		}
		catch(ClassNotFoundException cc){
			cc.printStackTrace();
		}
		
	}

}
