package com.acc.ExceptionHandling;

public class ThrowsSDemo1 {

	public static void main(String[] args) throws InterruptedException
	{
		doStuff();
	}

	private static void doStuff() throws InterruptedException 
	{
		doMoreStuff();
	}

	private static void doMoreStuff() throws InterruptedException  
	{
		Thread.sleep(100);
		System.out.println("hi");
	}
	
	
	/***
	 * below the code is invalid and will get compiler error
	 */
	
	/*
	 public static void main(String[] args) throws InterruptedException
	{
		doStuff();
	}

	private static void doStuff() 
	{
		doMoreStuff();
	}

	private static void doMoreStuff() 
	{
		Thread.sleep(100);
		System.out.println("hello");
	}
	 */
	

}
