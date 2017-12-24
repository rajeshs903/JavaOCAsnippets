	package com.acc.MultiThreading;
	
	public class JoinDeadLockDemo2 {
	/**
	 * Case 4 : thread waiting for its own execution 
	 *  
	 * 
	 */
		public static void main(String[] args) throws InterruptedException 
		{
			Thread.currentThread().join();
	
		}
	
	}
