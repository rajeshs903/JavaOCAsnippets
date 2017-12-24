package com.acc.flowControlDemo;

import java.util.Scanner;

public class ForDemo 
{

	public static void main(String[] args) 
	{
		/*
		 * multiple initialization variables, but they should be of same type
		 *
		 for(int i=0,y=0,z=1;i<3;i++)
		{
			System.out.println(i);
		}
	*/
	
		/*
		 * in initialization section , we can declare any java statement 
		* 
		int i=0;
		 for(System.out.println("this is valid, dont worry ");i<3;i++)
		{
			System.out.println(i);
		}
	*/
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		for(int[] mySimpleArray : myComplexArray) {
		for(int my:mySimpleArray) {
		System.out.print(mySimpleArray[i]+"\t");
		}
		System.out.println();
		}
		
		/*
		 *conditional check is optional, if we don't put any condition then compiler will keep the condition 'true' by default
		 *
		 * 
		
		int tot=0;
		Scanner  in=new Scanner(System.in);
		int x=in.nextInt();
		for(int i=0;;i++)
		{
			tot=tot+i;
			System.out.println(i);
			if(i==x)
				break;
		}
		System.out.println("some of all above values is "+ tot);
		 */
		
		/***
		 * in increment and decrement section we can take any valid java statement includuing sop()..
		 *  
		
		int i=0;
		for(System.out.println("hi");i<3;System.out.println("helloooo"))
		{
			i++;
			
		}
		 */
		
		/*
		 * case 1
		 *
		 *
		 * 
		 
		for(int i=0;true;i++)
		{
			System.out.println("hello");
		}
		System.out.println("hi"); 	// Unreachable code
		
		*/
	
		
		/*
		 * case 2
		 *
		 *
		 * 
		
		for(int i=0;false;i++)
		{
			System.out.println("hello"); // Unreachable code
		}
		System.out.println("hi"); 	
		
		 */
		
		
		/*
		 * case 3
		 *
		 *
		 * 
		
		for(int i=0;;i++)
		{
			System.out.println("hello"); 
		}
		System.out.println("hi"); 		// Unreachable code
		
		 */
		
		/*
		 * case 4
		 *
		 *
		
		 int a=10,b=20;
		
		for(int i=0;a<b;i++)
		{
			System.out.println(i); 
		}
		System.out.println("hi"); 		// Unreachable code but no compile error will be rised bcoz a, b are resulted at run time
		
		*/
		/*
		 * case 5
		 *
		 *
		
		 int a=10,b=20;
		
		for(int i=0;a>b;i++)
		{
			System.out.println(i); // Unreachable code but no compile error will be rised bcoz a, b are resulted at run time
		}
		System.out.println("hi"); 		
		*/
		
		/*
		 * case 6
		 *
		 *
		 
		 final int a=10,b=20;
		
		for(int i=0;a>b;i++)
		{
			System.out.println(i); // Unreachable code but no compile error will be rised bcoz a, b are resulted at run time
		}
		System.out.println("hi"); 		
		*/
		
		/*
		 * case 7
		 *
		 *
		 
		 final int a=10,b=20;
		
		for(int i=0;a<b;i++)
		{
			System.out.println(i); 
		}
		System.out.println("hi"); 	// Unreachable code but no compile error will be rised bcoz a, b are resulted at run time	
		*/
	
	}
}
