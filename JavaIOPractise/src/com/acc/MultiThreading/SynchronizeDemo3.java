package com.acc.MultiThreading;

public class SynchronizeDemo3{

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
		/*Display2 d=new Display2();
		d.wish("hero");*/

		Display2 d1=new Display2();
		Display2 d2=new Display2();
		MyThread5 t1=new MyThread5("herooo1111",d1);
		MyThread5 t2=new MyThread5("herooo2222",d2);
		t1.start();
		
		t2.start();
		
		/*
		 * even though wish() is sync , we get don't get regular output, 
		 * this is because these two threads operating on separate objects ,
		 * i.e t1 having d1 object lock 
		 * and t2 having d2 object lock
		 * 
		 */
	}

}
class Display2
{
	public  synchronized void  wish(String str)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("wish : "+str+"  : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interrputed exception occruerd");
			}
		}
	}
}
class MyThread5 extends Thread
{
	Display2 d;
	String str;
	MyThread5(String str,Display2 d)
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