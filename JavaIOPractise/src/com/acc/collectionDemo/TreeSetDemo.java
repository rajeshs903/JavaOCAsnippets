package com.acc.collectionDemo;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		TreeSet t1=new TreeSet();
		
		
			
		
		t.add("A");
		t.add("a");
		t.add("2");
		t.add("r");
		// below exception 1
		try{
		t.add(null); 
		
		}
		
		catch(NullPointerException n)
		{
			System.out.println("dont insert null in non-empty Treeset , you can enter the null in empty treeset as first element \n");
		}
		// below exception 2
		try{
		t.add(1212);
			}
			
		catch(ClassCastException c)
		{ 
			System.out.println("\n dont insert heterogenisous objects \n TREESET DONT ALLOW HETEROGENIOUS OBJECTS \n");
		}
			
			// null is allowed but getting error bcoz 
		
		//t1.addAll(t);
		//
		//t1.removeAll(t);
		System.out.println(t);
		System.out.println(t.comparator()); //Default natural sorting order
		//System.out.println(t1);
		
		TreeSet tw=new TreeSet();
		tw.add(null);
		System.out.println(tw);
		
		
		
	}

}
