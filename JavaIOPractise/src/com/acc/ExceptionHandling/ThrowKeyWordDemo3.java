package com.acc.ExceptionHandling;

public class ThrowKeyWordDemo3 extends RuntimeException{
/**
 * Case 3
 * 
 */
	public static void main(String[] args) 
	{  
		
		/*
		 *  for below code ,if we extend the RuntimeException class then we get runtime error
		 *  
		 *  Exception in thread "main" com.acc.ExceptionHandling.ThrowKeyWordDemo3
					at com.acc.ExceptionHandling.ThrowKeyWordDemo3.main(ThrowKeyWordDemo3.java:20)

		 *  
		 *  
		 *  else we get compiler error as below mentioned
		 *  		No exception of type ThrowKeyWordDemo3 can be thrown; an exception type must be a subclass of Throwable
		 *  if extend throwable then we get compiler error
		 */
	
	throw new ThrowKeyWordDemo3();

	
	}

}
