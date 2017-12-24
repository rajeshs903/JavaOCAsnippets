package com.acc.MultiThreading;

public class JoinMethodDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		JoinDemo j=new JoinDemo();
		Thread t=new Thread(j);
		t.start();
		
		t.join(1000);
		System.out.println("main ");

	}

}
class JoinDemo implements Runnable
{
	public void run() 
	{
		for (int i = 0; i < 4; i++) 
		{
		System.out.println("thread1");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
				}
}