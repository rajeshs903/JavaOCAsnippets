package com.acc.collectionDemo;
import java.util.*;
public class ComparatorDemo {

	public static void main(String[] args) 
	{
		TreeSet t =new TreeSet(new MyComparatorINT_DESC2());
		t.add(10);
		t.add(0);
		t.add(15);
		
		t.add(20);
		t.add(25);
		
		System.out.println("\n integers with descending order \n"+t);
		
		TreeSet t1=new TreeSet(new MyComparatorSTR_DESC());
		t1.add("A");
		t1.add("C");
		t1.add("Z");
		t1.add("R");
		t1.add("B");
		t1.add("Z");
		System.out.println("\n strings with descending order \n"+ t1);
		
		TreeSet t2=new TreeSet(new MyComparatorStrBuff());
		t2.add(new StringBuffer("A"));
		t2.add(new StringBuffer("Z"));
		t2.add(new StringBuffer("C"));
		t2.add(new StringBuffer("R"));
		
		System.out.println("\n Stringbuffer with descending order \n"+ t2);
		
		
		TreeSet t3=new TreeSet(new MyComparatorSTR_LenOrder());
		t3.add(new StringBuffer("vizag"));
		t3.add(5);
		t3.add(9);// homogenious objects are not mandatory when we implements our own sorting methods (own comparator)
		t3.add(6);
		t3.add(new StringBuffer("Zibra"));
		t3.add(new StringBuffer("Chennai"));
		t3.add("Rajesh");
		
		System.out.println("\n order with string length and then with alphabetical : \n\n "+t3);
		

	}

}
class MyComparatorINT_DESC implements Comparator
{
	///Descending sort method 

	@Override
	public int compare(Object o1, Object o2) 
	{
		Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
		
		if(i1>i2)
			return -1;
		else
			if(i1<i2)
				return +1;
			else
				return 0;
		
	}
	
}
class MyComparatorINT_DESC2 implements Comparator
{
	///Descending sort method in other way 
	// OPTIMISED WAY for DESCENDING
	@Override
	public int compare(Object o1, Object o2) 
	{
		Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
		
		return -i1.compareTo(i2); 
		
		//OR 
	
//		return i2.compareTo(i1);
	}
	
}
class MyComparatoriNT_ASCE implements Comparator
{
	///ASCENDING sort method

	@Override
	public int compare(Object o1, Object o2) 
	{
		Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
		return i1.compareTo(i2);
		
	}
	
}


class MyComparatorSTR_DESC implements Comparator
{
	public int compare(Object o1,Object o2) 
	{
		String s1=(String) o1;
		String s2=o2.toString();
		return -s1.compareTo(s2);
		//or return s2.compareTo(s1);
	}
}

class MyComparatorStrBuff implements Comparator
{
	public int compare(Object o1,Object o2) 
	{
		String s1=o1.toString();
		String s2=o2.toString();
		return -s1.compareTo(s2);
		//or return s2.compareTo(s1);
	}
}


/**
 * below is the comparator for Ascending order of string length . if they are same then consider their alphabetical order
 */

class MyComparatorSTR_LenOrder implements Comparator
{
	public int compare(Object o1,Object o2) 
	{
		String s1=o1.toString();
		String s2=o2.toString();
		
		int l1=s1.length();
		int l2=s2.length();
		
		if(l1>l2)
			return +1;
		else if(l1<l2)
			return -1;
			else
				return  s1.compareTo(s2);
		
		
		
		//or return s2.compareTo(s1);
	}
}








