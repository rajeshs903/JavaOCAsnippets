package com.acc.MultiThreading;

public class ThreadDemo5 {

	public static void main(String[] args) 
	{
		MyRunnable m=new MyRunnable();
		Thread t1=new Thread(m,"Thread name");
		Thread t2=new Thread();
		System.out.println(t1.getPriority());
		
		t1.start();
		Thread.currentThread().setName("name of main thread also changed ");
		System.out.println("main method is executing by  : "+Thread.currentThread().getName());
	}

}
class MyRunnable implements Runnable
{
	
	public void run()
	{
		System.out.println("run method is executing by  : "+Thread.currentThread().getName());
	
	}
	
}
