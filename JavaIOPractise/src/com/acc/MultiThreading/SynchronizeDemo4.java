package com.acc.MultiThreading;
/**
 * 
 * 
 * if both methods are sync , then at a time only one thread can operate(t1 after t2 OR t2 after t1)
 * 
 *  if one of the methods is not sync then mixed output will be resulted 
 * 
 * 
 * 
 * @author rajesh.santha
 *
 */
public class SynchronizeDemo4 {

	public static void main(String[] args) 
	{
		DisplayClass d=new DisplayClass();
		MyThreadForDisplay1 t1=new MyThreadForDisplay1(d);
		MyThreadForDisplay2 t2=new MyThreadForDisplay2(d);
		t1.start();
		t2.start();

	}

}
class DisplayClass
{
	public  void displayN()
	{
		for (int i =1; i <=23; i++) 
		{
			System.out.println(i);
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e) 
			{
				System.out.println("Thread got Interrupted ");
			}
		}
	}
	public synchronized  void displayC()
	{
		for (int i = 65; i < 91; i++) 
		{
			System.out.println((char)i);
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e) 
			{
				System.out.println("Thread got Interrupted ");
			}
			
		}
	}
}


class MyThreadForDisplay1  extends Thread 			//thread1
{
	DisplayClass d;
	public MyThreadForDisplay1(DisplayClass d) 
	{
		this.d=d;
	}
	public void run()							// Calling displayN() method on Run() 
	{
		d.displayN();
	}
	
}

class MyThreadForDisplay2 extends Thread			//thread2
{
	DisplayClass d;
	public MyThreadForDisplay2(DisplayClass d) 
	{
		this.d=d;
	}
	public void run()							// Calling displayC() method on Run()
	{
		d.displayC();
	}
}
