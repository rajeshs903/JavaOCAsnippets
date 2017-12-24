package com.acc.MultiThreading;

public class DepricatedMethodsDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		DeprecateThread d=new DeprecateThread();
	    d.start();
	    System.out.println("main method here ");
	    d.suspend();
	    System.out.println("suspended here");
	    d.resume();
	    System.out.println("RESUEMED here");
	    d.stop();
	    System.out.println("Stopped here");
	

	}

}
class DeprecateThread extends Thread
{
	public void run() 
	{
		for (int i = 0; i < 4; i++) 
		{
			System.out.println(i + "  ");
		}
	}
}
