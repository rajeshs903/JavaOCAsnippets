package com.acc.MultiThreading;

public class ThreadDemo2 {

	public static void main(String[] args) 
	{
		RunOverridingDemo r=new RunOverridingDemo();
		r.run(12);
		r.start();

		
		//System.out.println("main");
	}

}
class RunOverridingDemo extends Thread
{
	public void run() 
	{
		for (int i = 0; i < 2; i++) 
		{
		System.out.println("run() with no arguments");
		}
	}
	
	public void run(int i) 
	{
		
		System.out.println("run() arguments : "+i);
		
	}
}