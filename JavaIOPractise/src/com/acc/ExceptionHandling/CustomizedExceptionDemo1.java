package com.acc.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomizedExceptionDemo1 {

	public static void main(String[] args) throws  IOException,NumberFormatException
	{
		int balance =120;
		System.out.print("enter the withdrwal amount : ");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int amount=Integer.parseInt(br.readLine());
		
		if(amount>balance)
		{
			throw new InSuffBalException("Insuffuceint balance.. please Re-Enter the amount");
		}
		else 
		{
			System.out.println("please take the money "+amount +" rupees ");
		}

	}

}
class InSuffBalException extends RuntimeException
{
	public InSuffBalException(String s) 
	{
		super(s);
	}
}
