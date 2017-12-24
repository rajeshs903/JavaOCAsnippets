package com.acc.MultiThreading;

public class YieldMethodDemo {

	public static void main(String[] args)
	{
		YieldThread y=new YieldThread();
		YieldThread1 y1=new YieldThread1();
		Thread t1=new Thread(y);
		Thread t2=new Thread(y1);
		//t2.setPriority(10);
		t1.start();
		t2.start();
		
		
		for (int i = 1; i < 5; i++) 
		{
			System.out.println("main thread ");
		}
		

	}

}
class YieldThread implements Runnable
{

	public void run() 
	{
		for (int i = 1; i < 5; i++) 
		{
			System.out.println("child thread ");
			Thread.yield(); // if we comment this line then both threads can execute simultaneously so we cant expect which thread will execute 
			//	if we dont comment , child thread always calls yield() , because of that main thread will get chnace more number of times , and the chance of getting completion main thread first is high
		}
		
		
	}
	
}
class YieldThread1 implements Runnable
{

	public void run() 
	{
		for (int i = 1; i < 5; i++) 
		{
			System.out.println(" 2nd child thread ");
		}
		
		
	}
	
}

