package com.acc.MultiThreading;

public class JoinMethodDemo2 {

	public static void main(String[] args) throws InterruptedException
	{
		MyThread1.mt=Thread.currentThread();
		MyThread1 t=new MyThread1();
		t.start();
		
		for (int i = 0; i < 3; i++) 
		{
		System.out.println("mainthread");
		Thread.sleep(1000);
		}
		

	}

}
class MyThread1 extends Thread
{
	static Thread mt; 
	
	public void run()
	{
		
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 0; i < 3; i++) 
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		System.out.println("child thread");
		}
		
		
	}
}