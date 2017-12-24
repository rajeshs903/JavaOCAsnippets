package com.whizlabs.practise;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionsDemo1 {

	public static void main(String[] args) {
		try
		{
		method();
		}catch(IOException e)
		{
			System.out.println("IOE caught");
		}
		
	}
	public static IOException method() 
	{
		try
		{
		return new IOException();		
		
		//return new FileNotFoundException(); even  this line also doesnt compile bcoz compiler know that it is returning exception not THROW ing exception
		}catch(FileNotFoundException f) //Unreachable catch block for FileNotFoundException. This exception is never thrown from the try statement body
		{
			return new FileNotFoundException();
		}
		
	}

}
