package com.acc.MultiThreading;

public class InterruptedDemo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		InterruptigThread t=new InterruptigThread();
		t.start();
		t.interrupt();
		t.join(); // without this ,main will execute first , with this line , main thread will execute after completion of child thread 
		
		System.out.println("End of main Thread ");
	}

}
class InterruptigThread extends Thread
{
	public void run()
	{
		for (int i = 0; i < 4; i++) 
		{
			System.out.println("lazy Thread ");
			try 
			{
				Thread.sleep(1500);
			}
			catch (InterruptedException e) 
			{
			System.out.println("interrupted by other Thread (here by main thread)");	
			}
		}
		
	}
}
