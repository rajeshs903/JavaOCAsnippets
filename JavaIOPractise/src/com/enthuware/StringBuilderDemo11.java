package com.enthuware;

import java.time.Year;

public class StringBuilderDemo11 {
	static int i;

	public static void main(String[] args) throws Exception {

String ss=String.join("-", "R");

System.out.println(ss);

		/*StringBuilder sb = new StringBuilder("123456");
		sb.insert(0, 9);
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println("AFTER");
		System.out.println(sb.capacity());
		System.out.println(sb);
		char[] ch = new char[4];
		sb.getChars(1, 3, ch, 1);
		System.out.println("hello");
		for (char c : ch)
			System.out.print(c);
		*/
		  StringBuilder sb=new StringBuilder("13");
		  System.out.println("Len= "+sb.length());
		  System.out.println("Cap =  "+sb.capacity()); 
		  
		  sb.ensureCapacity(39); 
		  System.out.println(sb+ " with new Cap= "+sb.capacity()); 
		  System.out.println(sb.length());
		  sb.ensureCapacity(23); sb.append("xxxx");
		  System.out.println(sb.capacity()); sb.ensureCapacity(30);
		  System.out.println(sb.capacity());
		 

	}
}
/*
 * Error: Main method not found in class com.enthuware.StringBuilderDemo11,
 * please define the main method as: public static void main(String[] args) or a
 * JavaFX application class must extend javafx.application.Application
 * 
 */
