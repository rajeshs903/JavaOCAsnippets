package com.acc.MultiThreading;

public class SynchronizeDemo2{

	/**
	 * 
	 * synchronization required in this code
	 * 
	 * so Regular output 
	 * 
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException 
	{
		/*Display1 d=new Display1();
		d.wish("hero");*/
		
		Display1 d=new Display1();
		MyThread4 t1=new MyThread4("herooo1111",d);
		MyThread4 t2=new MyThread4("herooo2222",d);
		MyThread4 t3=new MyThread4("herooo3333",d);
		MyThread4 t4=new MyThread4("herooo4444",d);
		t1.start();
		
		t2.start();
		t3.start();
		t4.start();
		
		/*
		 * as wish method is sync , we get regular output
		 * 
		 */
	}

}
class Display1
{
	public synchronized void   wish(String str)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("wish : "+str+"  : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
class MyThread4 extends Thread
{
	Display1 d;
	String str;
	MyThread4(String str,Display1 d)
	{
		this.d=d;
		this.str=str;
	}
	@Override
	public void run() 
	{
		d.wish(str);
	}
}