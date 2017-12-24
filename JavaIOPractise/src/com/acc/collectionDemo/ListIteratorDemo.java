package com.acc.collectionDemo;
import java.util.ListIterator;
import java.util.LinkedList;

public class ListIteratorDemo {

	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		System.out.println(l);
		
		ListIterator lt=l.listIterator();
		//System.out.println(lt.getClass().getName());
		while(lt.hasNext())
		{
			String s=(String) lt.next();
			if(s.equals("a"))
			{
				lt.remove();
			}
			else if(s.equals("b"))
			{
				lt.add("2");
			}
			else if(s.equals("c"))
			{
				lt.set(33);	
			}
			
			
		}
		
		System.out.println(l);
		
	}

}
