package com.acc.MultiThreading;
/**
 * 
 * Need of Synchronized block ?
 * 
 * CASE : 1
 * 
 * this below code is to be sync, but declaring whole method as sync method will degrades the performance of program 
 * as it is having 2 more lakhs of code which are unnecessarily causing the waiting time
 * 
 *  solution is to enclose the below code in Synchronized block
 * 
 * for (int i = 0; i <10; i++)
		{
			System.out.println("hi "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
 * 
 * in Synchronized(this){} block : which means it will executed by the thread which having the current object lock
 * @author rajesh.santha
 *
 */
public class SynchronizedBlock1 {

	public static void main(String[] args) 
	{
		DisplaySyncBlockDemo d=new DisplaySyncBlockDemo();
		MyThreadForSyncBlock t1=new MyThreadForSyncBlock(d," it is thread 1 ");
		MyThreadForSyncBlock t2=new MyThreadForSyncBlock(d," it is thread 2 ");
		t1.start();
		t2.start();

	}

}
class DisplaySyncBlockDemo
{
	public void wish(String name)
	{
		/*
		 * assume one lakh lines of code
		 * 
		 */
	synchronized (this) 
	{
			
		
		for (int i = 0; i <5; i++)
		{
			System.out.println(i + "  "+name);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		/*
		 * assume one more lakh lines of code
		 * 
		 */
		
	}
}
class MyThreadForSyncBlock extends Thread
{
	 DisplaySyncBlockDemo d;
	 String name;
	public MyThreadForSyncBlock(DisplaySyncBlockDemo d,String name)
	{
		this.d=d;
		this.name=name;
		
	}
		public void run() 
		{
		d.wish(name);	
		}
}