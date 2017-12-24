package com.acc.collectionDemo;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add("hi");
		l.add(12);
		l.add(34.55668);
		l.add(null);
		System.out.println(l);
		l.set(2," replaced at 2nd postion "); // replace
		//System.out.println(l.indexOf(" inserted at 2nd postion "));
		
		System.out.println("\n"+l);
		l.add(0,"hello");
		l.add(0,"bye");
		System.out.println("\n"+l);
		l.removeLast();
		l.addFirst("this is first");
		System.out.println("\n"+l);

	}

}
