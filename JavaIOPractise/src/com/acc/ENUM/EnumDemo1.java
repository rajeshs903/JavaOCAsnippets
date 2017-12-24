package com.acc.ENUM;

public class EnumDemo1 {

	enum WeekDays// Declaring the ENUM inside class
	{
		sun,mon,tues
	}

	public static void main(String[] args) 
	{
		Month m=Month.feb; //Accessing the ENUM
		System.out.println(m); 

	}

}
enum Month // Declaring the ENUM outside class
{
	jan,feb,mar
}
