package com.examples.StringExamples;
import java.util.StringTokenizer;


public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=new String("Kumar Reddy Kurnool AndhraPradesh");
		StringTokenizer str1=new StringTokenizer(s);
		int i=0;
		while(str1.hasMoreTokens()){
			System.out.println("Token"+i+"\t"+str1.nextToken());
			i++;
		}
		StringTokenizer str2=new StringTokenizer(s," ");
		while(str2.hasMoreTokens()){
			System.out.println("Token"+i+"\t"+str2.nextToken());
			i++;
		}
	}

}
