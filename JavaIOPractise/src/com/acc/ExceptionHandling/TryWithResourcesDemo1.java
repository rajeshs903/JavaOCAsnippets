package com.acc.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo1 {

	public static void main(String[] args) throws IOException 
	{
		//1.6 version code
		
		/*
		 * 
		 * BufferedReader br=null;
		try
		{
			br=new BufferedReader(new FileReader("abc.txt"));
			// use 'br'
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file is not found");
		}
		finally 
		{
			if(br!=null)
			{
				br.close();
			}
		}
		*/
		
		
		
		/*
		 * 1.7 version code TRY BLOCK WITH RESOURCES
		 * 
		 * 
		try(BufferedReader br=new BufferedReader(new FileReader("abc.txt"));)
		{
			// use 'br'
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file is not found");
		}
		// No need of finally block , the resources that opened as part of try block are automatically closed from 17. version onwards
		//so there is no need of finally block explicitly to close the resources .. 
		*/
		/**
		 * Case 1 : all resource ref variables are implicitly FINAL
		 * so within try we can use the same ref variable name again 
		
		
		
		try(BufferedReader br=new BufferedReader(new FileReader("abc.txt"));)
		{
			br=new BufferedReader(new FileReader("aaa.txt"));
			//The resource br of a try-with-resources statement cannot be assigned
			// use 'br'
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file is not found");
		}
		
		 */
		
		
		
		/**
		 * case 2 :until 1.6 version  
		
		
		try
		{
		}
		catch()
		{
		}
		
		OR
		
		try{
		}
		finally
		{
		}
		
		both are valid 
		
		
		but in 1.7 version 
		
		try(Resources)
		{
		}
		
		is also valid
		
		 */
		
	}
	

}
