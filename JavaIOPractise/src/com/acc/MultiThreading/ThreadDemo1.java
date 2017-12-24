package com.acc.MultiThreading;

public class ThreadDemo1 {

	public static void main(String[] args) 
	{
		MyThread m=new MyThread();
		
		
		m.run();
		for(int i=0;i<=3;i++)
		System.out.println("main thread");

	}

}
class MyThread extends Thread
{
	public void run() 
	{
		for(int i=0;i<=3;i++)
		System.out.println("Child thread");
	}	
}
