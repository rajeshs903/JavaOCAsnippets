package com.acc.ExceptionHandling;

import java.io.IOException;

public class ThrowsSDemoCase4 {
/**
 * Case 4
 * 
 */
	public static void main(String[] args) 
	{
		/*
		 * case 4.1
		 * 
		 * VALID
		 * 
		 
		try
		{
			System.out.println("hello1");
		}
		catch(ArithmeticException e)
		{
			
		}
		
		*/
		
		
		
		/*
		 * case 4.2
		 * VALID
		 * 
		 
		 
		try
		{
			System.out.println("hello2");
		}
		catch(Exception e)
		{
			
		}
		*/ 
		
		
		
		
		/*
		 * case 4.3
		 * 
		 * CE:
		 * 		This exception is never thrown from the try statement body
		 * 
		 
		 
		try
		{
			System.out.println("hello3");
		}
		catch(IOException e)
		{
			
		}
		
		*/
		
		
		
		
		
		/*
		 * case 4.4
		 *
		 *CE : 
		 *		Unreachable catch block for InterruptedException. This exception is never thrown from the try statement body
		 *
		 
		try
		{
			System.out.println("hello4");
		}
		catch(InterruptedException e)
		{
			
		}
		*/
		
		
		
		
		/*
		 * case 4.5
		 *
		 *VALID
		 
		try
		{
			System.out.println("hello5");
		}
		catch(ArithmeticException e)
		{
			
		}
		
		*/

	}

}
