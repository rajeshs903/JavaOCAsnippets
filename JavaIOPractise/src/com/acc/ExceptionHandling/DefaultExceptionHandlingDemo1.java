package com.acc.ExceptionHandling;

/*public class DefaultExceptionHandlingDemo1 {

	//case 1
	
	public static void main(String[] args) 
	{
		
		doStuff();
		
	}
	public static void doStuff()
	{
		doMoreStuff();
	}
	public static void doMoreStuff()
	{
		System.out.println(10/0);
	}

	*//**
	 * 
	 * Exception in thread "main" java.lang.ArithmeticException: / by zero
		at com.acc.ExceptionHandling.DefaultExceptionHandlingDemo1.doMoreStuff(DefaultExceptionHandlingDemo1.java:17)
		at com.acc.ExceptionHandling.DefaultExceptionHandlingDemo1.doStuff(DefaultExceptionHandlingDemo1.java:13)
		at com.acc.ExceptionHandling.DefaultExceptionHandlingDemo1.main(DefaultExceptionHandlingDemo1.java:8)

	 * 
	 *//*
	
}*/


public class DefaultExceptionHandlingDemo1 {

//Case 2

public static void main(String[] args) 
{
	
	doStuff();
	
}
public static void doStuff()
{
	doMoreStuff();
	System.out.println(10/0);
}
public static void doMoreStuff()
{
	System.out.println("DOMORESTUFF");
}

/***
 * 
 *
 * DOMORESTUFF
 
   Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.acc.ExceptionHandling.DefaultExceptionHandlingDemo1.doStuff(DefaultExceptionHandlingDemo1.java:48)
	at com.acc.ExceptionHandling.DefaultExceptionHandlingDemo1.main(DefaultExceptionHandlingDemo1.java:42)



 * 
 */

}