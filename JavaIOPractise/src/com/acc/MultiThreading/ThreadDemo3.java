package com.acc.MultiThreading;

public class ThreadDemo3 {

	public static void main(String[] args) 
	{
		
		ClassWithNoRun c=new ClassWithNoRun();
		c.start();
		c.run();

	}

}
class ClassWithNoRun extends Thread
{
	// as there is no run() overriden , so Thread class's run() will execute which is nothing but blank output
}