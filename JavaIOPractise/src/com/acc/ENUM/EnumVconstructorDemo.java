package com.acc.ENUM;

public class EnumVconstructorDemo {

	public static void main(String[] args) 
	{
		System.out.println("this is main mehtod \n");
		Calander c=Calander.apr;
	}

}
enum Calander
{
	jan,feb,mar,apr;
	Calander() // constructor will execute for eacha and every constant that we have defined
	{
		
		System.out.println("print for each object ");
	}
}