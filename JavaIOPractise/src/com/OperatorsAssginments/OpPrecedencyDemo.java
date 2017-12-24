package com.OperatorsAssginments;

public class OpPrecedencyDemo 
{

	public static void main(String[] args) 
	{
		
		System.out.println(m(1)+m(2)*m(3)/m(4)+m(5)*m(6));
	}
	public static int m(int i)
	{
		System.out.println(i);
		return i;
	}
}
