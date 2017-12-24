package com.acc.ExceptionHandling;

public class OrderOfCatchBlocks {

	public static void main(String[] args)
	{
		
		/**
		 * Order should not be parent then child
		 * 
		 */
		/* 
		try
		
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			
		}
		
		//Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
		catch (ArithmeticException e) 
		{
			
		}
		*/
		
		/**
		 * Order should be child then parent 
		 * 
		 */
		/* 
		try
		
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException e) // Valid 
		{
			
		}
		
 		catch(Exception e) 
		{
			
		}
		*/
		/**
		 * we cant keep 2 same the catch blocks for an exception 
		 * example below 
		 * 
		 */
		/*
		try
		{
		System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("hello11111");
		}
		
		catch(ArithmeticException e) //Unreachable catch block for ArithmeticException. It is already handled by the catch block for ArithmeticException
		{
			System.out.println("hiiiiiii2222222");
		}
		*/
		
		
		
		}

	}


