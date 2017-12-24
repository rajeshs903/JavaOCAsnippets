package com.whizlabs.practise;

public class Program
{
	static Integer I;
	
	
	public static void main(String args[])
	{
		StringBuilder sb1=new StringBuilder("OCAJP");
		sb1.insert(sb1.lastIndexOf("A"),true);
		System.out.println(sb1);
		
		
		
		String s2=new String("raj");
		s2=s2.indexOf("aj")
		String s1=new String("raj");

		Program p=new Program();
		System.out.println(s2.equals(s1));
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode());
		/**
		 *  It simply emphasizes the same relationship - equal objects must produce the same hash code
		 *  . However, 
		 *  the third point elaborates that unequal objects need not produce distinct hash codes.
		 */
		
		 Object obj=new Double(3);
		Number num=(Number) obj;
		System.out.println(num);
	String s;
	try
	{
		s=I.toString();
	}
	finally
	{
		try{
			int i=Integer.parseInt(args[0]);
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormat exception");
		}
		finally
		{
			System.out.println("Fin2");
		}
	System.out.println("Fin1");
	}
}
}
