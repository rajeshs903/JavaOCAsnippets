package com.acc.MultiThreading;

public class SynchronizeDemo1 {

	/**
	 * 
	 * no synchronization required in this code
	 * 
	 * MIXED OUTPUT
	 */
	
	public static void main(String[] args) 
	{
		/*Display d=new Display();
		d.wish("hero");*/
		
		Display d=new Display();
		MyThread3 t1=new MyThread3("herooo1111",d);
		MyThread3 t2=new MyThread3("herooo2222",d);
		MyThread3 t3=new MyThread3("herooo3333",d);
		MyThread3 t4=new MyThread3("herooo4444",d);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
class Display
{
	public void wish(String str)
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
class MyThread3 extends Thread
{
	Display d;
	String str;
	MyThread3(String str,Display d)
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