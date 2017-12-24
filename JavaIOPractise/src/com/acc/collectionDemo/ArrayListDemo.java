package com.acc.collectionDemo;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList l=new ArrayList();
		l.add("A");
		l.add(10);
		l.add(12.44);
		l.add(null);
		System.out.println(l);
		System.out.println(l.indexOf("A"));
		System.out.println(l.indexOf(10));
		System.out.println(l.indexOf(12.44));
		System.out.println(l.indexOf(null));
		l.remove(1);
		l.remove(2);
		l.add(1, "new");
System.out.println("\n");
		System.out.println(l.indexOf("A"));
		System.out.println(l.indexOf(10));
		System.out.println(l.indexOf(12.44));
		System.out.println(l.indexOf(null));
		System.out.println(l);
		l.remove(2);
		//l.add(2, "hi");
		System.out.println(l);
		

	}

}
