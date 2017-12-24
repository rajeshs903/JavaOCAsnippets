package com.acc.ENUM;

public class EnumMethodsDemo 
{	
	enum Month
	{
		jan,feb,mar
	}

	public static void main(String[] args) 
	{
		Month[] m=Month.values(); // VALUES() MEHTOD : to list out all the values inside the ENUM 
		
		for(Month m1:m)
		{
		
		System.out.println("the element is = "+m1+"   ....     at position = "+m1.ordinal());
		}

	}

}
