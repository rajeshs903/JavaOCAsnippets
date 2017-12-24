package com.acc.MultiThreading;

public class JoinDeadLockDemo {
/**
 * Case : 3 
 * 
 * waiting threads for each other's execution
 * 
 */
	public static void main(String[] args) throws InterruptedException 
	{
		DeadLockDemo.mt=Thread.currentThread(); 
		DeadLockDemo d=new DeadLockDemo();
		d.start();
		d.join();
	
		
		for (int i = 0; i < 3; i++) 
		{
		System.out.println("child thread");
		}
		
	}

}
class DeadLockDemo extends Thread
{
	static Thread mt;
	public void run()
	{
		try 
		{
			mt.join();
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		
		for (int i = 0; i < 3; i++) 
		{
		System.out.println("child thread");
		}
	}
}
