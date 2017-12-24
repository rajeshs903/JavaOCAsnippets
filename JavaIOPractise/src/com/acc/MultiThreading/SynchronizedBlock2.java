package com.acc.MultiThreading;
/**
 * 
 * Need of Synchronized block ?
 * 
 * CASE 2: 
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
 * in Synchronized(some object){} block : which means it will executed by the thread which having the particular object lock
 * 
 * and 
 * CASE 3 :
 * 
 * in Synchronized(Classname.class){} block : which means it will executed by the thread which having the class level lock
 * @author rajesh.santha
 *
 */
public class SynchronizedBlock2 {

	public static void main(String[] args) 
	{
		DisplaySyncBlockDemo1 d1=new DisplaySyncBlockDemo1();
		DisplaySyncBlockDemo1 d2=new DisplaySyncBlockDemo1();
		MyThreadForSyncBlock1 t1=new MyThreadForSyncBlock1(d1," thread 1 ");
		MyThreadForSyncBlock1 t2=new MyThreadForSyncBlock1(d2," thread 2 ");
		t1.start();
		t2.start();

	}

}
class DisplaySyncBlockDemo1
{
	public void wish(String name)
	{
		/*
		 * assume one lakh lines of code
		 * 
		 */
	synchronized (DisplaySyncBlockDemo1.class) // class level lock  
	{
			
		
		for (int i = 0; i <10; i++)
		{
			System.out.println(i+"  "+name);
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
class MyThreadForSyncBlock1 extends Thread
{
	 DisplaySyncBlockDemo1 d;
	 String name;
	 public MyThreadForSyncBlock1(DisplaySyncBlockDemo1 d,String name)
	{
		this.d=d;
		this.name=name;
	}
		public void run() 
		{
		d.wish(name);	
		}
}