package com.acc.MultiThreading;

public class ThreadPrioritesDemo {

	public static void main(String[] args) 
	{
		System.out.println("thread min priority is "+Thread.MIN_PRIORITY);
		System.out.println("thread min priority is "+Thread.MAX_PRIORITY);
		System.out.println("thread normal priority is "+Thread.NORM_PRIORITY);
		
		System.out.println("\n main thread priority is "+Thread.currentThread().getPriority());
		
		
		MyThreadProrities m=new MyThreadProrities();
		Thread t=new Thread(m);
		t.start();
		t.setPriority(10);								//Setting priority
		//VALID RANGE OF PRIORITIES ARE 1 TO 10
		// ELSE WILL GET "Exception in thread "main" java.lang.IllegalArgumentException"
		
		
	    System.out.println("\n\n\n"+t.getPriority()); // getting prority 

	}

}
class MyThreadProrities implements Runnable
{

	public void run() 
	{
		System.out.println("run()");
		System.out.println("\n child thread priority is "+Thread.currentThread().getPriority());
	}
	
}