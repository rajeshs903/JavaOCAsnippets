package com.acc.Knowledge;

public class Program
{
	static Integer I;
	public static void main(String args[])
	{
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