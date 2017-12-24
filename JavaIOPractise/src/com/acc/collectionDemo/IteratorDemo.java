package com.acc.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorDemo {

	public static void main(String[] args) 
	{
	ArrayList l=new ArrayList();
	for(int i=0;i<10;i++)
	{
		l.add(i);
	}
	System.out.println(l+"\n \n");
	Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Integer i= (Integer) itr.next();
			if(i%2==0)
			{
				System.out.println(i);
			}
			else
			{
				itr.remove();
			}
		}
	System.out.println("\n new list is "+l); // modified list after removal of odd numbers

	}

}
