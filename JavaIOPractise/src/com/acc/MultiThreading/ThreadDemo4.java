package com.acc.MultiThreading;

public class ThreadDemo4 {

	public static void main(String[] args)
	{
		StartOverriding s=new StartOverriding ();
		s.start(); // normal calling
		s.start();
		
//s.run(); // normal calling

	}

}
class StartOverriding extends Thread 
{
	public void start() // it will execute like normal method, it needs to call explicitly 
	{
		super.start();
		System.out.println("start overriding method");
		
	}
	public void run() // it will execute like normal method, it needs to call explicitly
	{
		System.out.println("run method");
	}
}