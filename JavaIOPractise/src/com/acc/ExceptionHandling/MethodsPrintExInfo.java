package com.acc.ExceptionHandling;

public class MethodsPrintExInfo {

	public static void main(String[] args) 
	{
		
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace(); // Exception + complete Description + StackTrace
			/*
			 * java.lang.ArithmeticException: / by zero
					at com.acc.ExceptionHandling.MethodsPrintExInfo.main(MethodsPrintExInfo.java:9)
			 */
			System.out.println(" \n ******************");
			System.out.println(e.toString()); // Exception + Description
			/*
			 * java.lang.ArithmeticException: / by zero
			 */
			
			System.out.println(" \n ******************");
			System.out.println(e.getMessage());// only Description
			
			/*
			 *  / by zero
			 */
			
		}

	}

}
