package com.acc.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedUncheckedDemo {

	public static void main(String[] args)  
	{/*
		// checked exception ,compiler error will come
	
		PrintWriter pw=new PrintWriter("raj.txt");
		
		//Unhandled exception type FileNotFoundException
		// handle it by using ' throws FileNotFoundException '
	*/	
		
		//Unchecked exception ,compiler error will not come
		System.out.println(10/0);

	}

}
