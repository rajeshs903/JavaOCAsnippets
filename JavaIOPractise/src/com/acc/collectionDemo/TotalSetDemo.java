package com.acc.collectionDemo;
import java.util.*;
public class TotalSetDemo {

	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
		
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("A");
		h.add(1);
		h.add(2);
		

		System.out.println(h);
		System.out.println(h.add("5"));
		System.out.println(h);
		
		// now LinkedHashSet
		System.out.println("\n \n \t  now with LinkedHashSet , you get order\n \n");
		
		LinkedHashSet lh=new LinkedHashSet();
		
		lh.add("A");
		lh.add("B");
		lh.add("C");
		lh.add("A");
		lh.add(1);
		lh.add(2);
		

		System.out.println(lh);
		System.out.println(lh.add("5"));
		System.out.println(lh);
		
		System.out.println("\n \n \t  now with SortedSet interface with TreeSet \n");
		
		SortedSet s=new TreeSet();
		s.add(1);
		s.add(2);
		s.add(100);
		s.add(4);
		s.add(3);
		s.add(3);
		
		System.out.println(s);
		
		
	}

}
