package com.acc.flowControlDemo;

import java.util.Scanner;

public class SelectionIfElseDemo 
{

	public static void main(String[] args) 
	{
		/** Case 1:
		 * Type mismatch: cannot convert from int to boolean
		 *
		 *in c, c++ its valid 
		 
			/*
			
			int x=0;
			if(x)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("false");
			}

		 */	
		
		
		
		
		/** Case 2:
		 * Type mismatch: cannot convert from int to boolean
		 *
		 *in c, c++ its valid 
		 
	
			
			int x=10;
			if(x=20)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("false");
			}

		 	
			*/	
		
		

		/** Case 3:
		 * 
		 *o/p = false
		 * 
		 
	
			
			int x=10;
			if(x==20)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("false");
			}

		 	
			*/	
		
 
	
			/**
			 *
			 * Case 4 :o/p = false 
			 * 
			 
			boolean b=true;
			if(b=false)
			{
				System.out.println("True statement");
			}
			else
			{
				System.out.println("false statement");
			}
			
			*/
			
			
		/**
		 *
		 * Case 5 :o/p = false 
		 * 
		
		
			boolean b=true;
			if(b==false)
			{
				System.out.println("True statement");
			}
			else
			{
				System.out.println("false statement");
			}

		*/
		
		/**
		 *
		 * Case 6 :o/p =  true
		 * 
		
		boolean b=true;
		if(b=true)
		{
			System.out.println("True statement");
		}
		else
		{
			System.out.println("false statement");
		}
		 */
		

		/**
		 *
		 * Case 7 :o/p =  True statement
		 * 
		 
		boolean b;
		if(b=true)
		{
			System.out.println("True statement");
		}
		else
		{
			System.out.println("false statement");
		}
		*/
		
		
		
		/**
		 * 
		 * its invalid
		 
		if(true)
		
			int x =10;
		
		*/
		
		/**
		 * 
		 * its valid
		 
		if(true)
		{
			int x =10;
		}
		*/
		
		
		/**
		 * else is always gng to consider for nearest if statement , so there is no "dangling else" problem in java 
		 */
		
		Scanner  in=new Scanner(System.in);
		int x=in.nextInt();
		if(x>35) //II
			if(x>40) // I
			System.out.println("x is greater than 40 i.e "+x);
		else//I
			System.out.println("x is less than 40 i.e "+x);
		else //II
			System.out.println("x is less than 35 i.e "+x);
	}

}
