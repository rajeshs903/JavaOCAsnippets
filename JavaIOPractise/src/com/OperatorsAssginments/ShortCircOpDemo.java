package com.OperatorsAssginments;

public class ShortCircOpDemo {

	public static void main(String[] args) 
	{
		/**
		 * example to show difference between & and && , | and ||
		 *
		 * 
		 * 
		 
		int x=10,y=15;
		
		if(++x <10 & ++y>15)
		{
			x++;
		}
		else
		{
			y++;
		}
		System.out.println( "& : x= "+x+" y= "+y);
		
		int x1=10,y1=15;
		if(++x1 <10 && ++y1>15)
		{
			x1++;
		}
		else
		{
			y1++;
		}
		System.out.println( "&& : x= "+x1+" y= "+y1);
		
		int x2=10,y2=15;
		if(++x2 <10 | ++y2>15)
		{
			x2++;
		}
		else
		{
			y2++;
		}
		System.out.println( "| : x= "+x2+" y= "+y2);		
		
		int x3=10,y3=15;
		if(++x3 <10 || ++y3>15)
		{
			x3++;
		}
		else
		{
			y3++;
		}
		System.out.println( "|| : x= "+x3+" y= "+y3);
		
		*
		*
		*/
		
		
		/**
		 * Eg 2 :
		 * 
		 * bcoz of && here x/0 is not evaluated and hence no Runtime error
		 */
		int x=10;
		if(++x<10 && (x/0)>10) 
		{
			System.out.println("true");
			
		}
		else
		{
			System.out.println("false");
		}
	}

}
