package com.acc.collectionDemo;
import java.util.*;
public class StackDemo {

	

	public static void main(String[] args) {
	Stack s=new Stack();
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	
	System.out.println(s);
	System.out.println("top element "+s.peek()); //top element
	System.out.println("returning offset from the top of the element "+s.search(2)); //returning offset from the top of the element
	System.out.println("returning offset of non existing element  "+s.search(8)); //returning offset of non existing element i.e -1
	System.out.println(s);
	System.out.println("\n");
	
	
	
	Enumeration e=s.elements();
	while(e.hasMoreElements())
	{
		Integer i=(Integer)e.nextElement();
		if(i%2==0)
		{
			System.out.println(i);
		}
		
	}
	
	
	}

}
