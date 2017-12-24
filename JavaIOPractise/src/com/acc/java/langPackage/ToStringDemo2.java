package com.acc.java.langPackage;

import java.util.ArrayList;

public class ToStringDemo2 {
	
	
	
	public String toString()
	{
		return getClass().getName();
	}

	public static void main(String[] args) 
	{
		/**
		 * diff ways that toString() defined for printing the object
		 */
		
		ArrayList l =new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println(l);

		
		HashMap m=new HashMap();
		m.put(111, "rajesh");
		m.put(222, "ravi");
		System.out.println(m);
		
		
		String s=new String("rajesh santha");
		System.out.println(s);
		
		
		Integer i =new Integer(22);
		System.out.println(i);
		
		
		/**
		 * Case 1 below will give
		 * com.acc.java.langPackage.ToStringDemo2@2a139a55
			as output
		 */
		ToStringDemo2 t=new ToStringDemo2();
		System.out.println(t);
		/**
		 * to get the correct output , override the toString() in our class
		 * 
		 */
	
	}

}
