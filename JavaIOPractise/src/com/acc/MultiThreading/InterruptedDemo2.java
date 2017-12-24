package com.acc.MultiThreading;

public class InterruptedDemo2 {

	public static void main(String[] args) throws InterruptedException 
	{
		InterruptedThread t=new InterruptedThread();
		t.start();
		t.interrupt();
		System.out.println("end of main");
		
	}

}
class InterruptedThread extends Thread
{
	public void run() 
	{
			for (int i = 0; i <10; i++)
			{
				System.out.println("child "+i);
				System.out.println("i am entering into sleeping state  now");
				if(i==7) // after 7th iteration is executed, thread will go into sleeping state then interrupt method will executed
				{ 
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) 
					{
						System.out.println("child Thread got interrupted at"+i);
					}
				}	
			}
	}
}