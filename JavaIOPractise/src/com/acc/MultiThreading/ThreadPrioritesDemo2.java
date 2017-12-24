package com.acc.MultiThreading;

public class ThreadPrioritesDemo2 {
	
	/**
	 * 
	 * the output may not according to the concepts , this is because WINDOWS don't support the Thread Priorities concepts 
	 */

	public static void main(String[] args) 
	{
		System.out.println(" main thread default priority is "+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(7); // comment and uncomment this line to see the difference
		// now we have set the main thread priority  to 7 then it will be set to all of its child threads (i.e threads which are created by main thread .. here 't1' will also get priority of 7)
										
		System.out.println("main thread changed priority is "+Thread.currentThread().getPriority());
		System.out.println();

		MyThreadProrities2 m=new MyThreadProrities2();
		MyThreadProrities3 m3=new MyThreadProrities3();
		
		Thread t=new Thread(m);
		Thread t3=new Thread(m3);
		t.start();
		
		t3.start();
		t3.setPriority(9);
	}

}
class MyThreadProrities2 implements Runnable
{

	public void run() 
	{
		System.out.println("run()");
		System.out.println("child thread priority is "+Thread.currentThread().getPriority());
		System.out.println();
		// the priority given by main thread 
		//NOTE : only parent thread(i.e main thread) can have default priority(i.e 5 ) and all of its child will get its priority  
		
	}
	
}



class MyThreadProrities3 implements Runnable
{

	public void run() 
	{
		System.out.println("run2()");
		System.out.println("child thread22 priority is "+Thread.currentThread().getPriority());
		System.out.println();
		// the priority given by main thread 
		//NOTE : only parent thread(i.e main thread) can have default priority(i.e 5 ) and all of its child will get its priority  
		
	}
	
}