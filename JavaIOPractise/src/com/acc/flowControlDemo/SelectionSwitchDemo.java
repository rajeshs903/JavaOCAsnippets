package com.acc.flowControlDemo;

import java.util.Scanner;

public class SelectionSwitchDemo {

	public static void main(String[] args) 
	{
		/*
		 *an empty switch is a valid java statement 
		 * 
		int x=10;
		switch(x)
		{
		
		}*/
		
		
		/*
		 *every statement should be inside any case or default  
		 * 
		
		int x=2;
		switch(x)
		{
		//System.out.println("independet statement");
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		
			default :
				System.out.println("default");
		
		}
		*/
		
		
		
		/*
		 *every case label should be compile time constant.. (i.e constant expression ) required
		 *
		 * 
		int x=2;
		int y=5;
		switch(x)
		{
		
		case x:					//case expressions must be constant expressions
			System.out.println("x");
			break;
		case y:					// case expressions must be constant expressions
			System.out.println("y");
			break;
		
			default :
				System.out.println("default");
		
		}
		*/
		
		
		/*
		 *every case label should be compile time constant.. (i.e constant expression ) required
		 *
		 *but if the case variable is final variable then it is not a compile time error
		 *
		 *
		
		
		int x=2;
		final int y=5;
		switch(x)
		{
		
		case 1:					
			System.out.println("x");
			break;
		case y:					
			System.out.println("y");
			break;
		
			default :
				System.out.println("default");
		
		}
		
		 */
		
		
		
		
		/*
		 *both switch label and case label can be constant expression
		 *
		
		int x=2;
		switch(1+3)
		{
		
		case 1+1:				
			System.out.println("1+1+1+1+1+1");
			break;
		case 3:			
			System.out.println("333333333");
			break;
		
			default :
				System.out.println("none");
		
		}
		 */ 
		/**
		 * CE: cannot convert from int to byte	
		 
		byte b=10;
		switch(b)
		{
		
		case 10:				
			System.out.println("1+1+1+1+1+1");
			break;
		case 100:			
			System.out.println("333333333");
			break;
		case 129: // not in the range of byte (-128 to +127) // CE: cannot convert from int to byte			
			System.out.println("333333333");
			break;
		
			default :
				System.out.println("none");
		
		}
		
		*/
		
		
		/**
		 *valid
		 *
		 *	
		
		byte b=10;
		switch(b+1)
		{
		
		case 10:				
			System.out.println("1+1+1+1+1+1");
			break;
		case 100:			
			System.out.println("333333333");
			break;
		case 129: // not in the range of byte (-128 to +127) // CE: cannot convert from int to byte			
			System.out.println("333333333");
			break;
		
			default :
				System.out.println("none");
		
		}
		
		*/ 
		
		
		/**
		 *duplicate case labels are not allowed 
		 * Example :
		 * 			Case 97 ,Case 'a' are duplicates
		 *
		
		
		int b=10;
		switch(b)
		{
		
		case 97:				
			System.out.println("1+1+1+1+1+1");
			break;
		case 'a': 		//Duplicate case for 97			
			System.out.println("333333333");
			break;
			default :
				System.out.println("none");
		
		}
		
		 */
		
		
		/***
		 * FALL THROUGH INSIDE THE SWITCH 
		 * 
		 * " matching the one case then executing all the cases untill the occurance of break or end of the switch
		 *
		 * Example program below
		
		int month_number = 0;
		System.out.println("enter the month number ");
		Scanner in=new Scanner(System.in);
		if(in.hasNext())
			 month_number=in.nextInt();
		else
			System.out.println("please enter the integer");
			
		switch(month_number)
		{
		case 1:
		case 2:
		case 3:
			System.out.println("month number "+month_number+" is in Quarter 4");
			break;

		case 4:
		case 5:
		case 6:
			System.out.println("month number "+month_number+" is in Quarter 1");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("month number "+month_number+" is in Quarter 2");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("month number "+month_number+" is in Quarter 3");
			break;
			
			
			default:
				System.out.println("your entry "+month_number+" is invalid \t please enter the valid month number  i.e 1 to 12 ");
		}
		 
		 */
	}

}
