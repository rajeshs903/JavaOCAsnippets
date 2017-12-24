package com.acc.ExceptionHandling;

public class MultiCatchBlockDemo1 {

	public static void main(String[] args) 
	{
		/**
		 * java code for multi-catch block until VERSION 1.6
		 * 
		 */
		
		
		try 
		{
			if(Integer.parseInt(args[0])==1)
			System.out.println(10/0);
			else
			{
				String s=null;
				s.length();
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero error ");
		}
		catch(NullPointerException e)
		{
			System.out.println("null operation ");
		}
		
		// */
		
		/**
		 * java code for multi-catch block after VERSION 1.7
		 * 
		 */
		
		
		try 
		{
			if(Integer.parseInt(args[0])==1)
			System.out.println(10/0);
			else
			{
				String s=null;
				s.length();
			}
		}
		catch(ArithmeticException|NullPointerException e)
		{
			System.out.println(e.getMessage());
		}		
	//	 */ 
		
		 
	}

}
