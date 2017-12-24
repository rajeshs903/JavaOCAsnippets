package com.lambda;

public class Climber {
	
	private static void check(Climb climb,int height,int limit)
	{
		if (climb.isTooHigh(height, limit))
		{
			System.out.println("its too high");
		}
		else
		{
			System.out.println("ok");
		}
	}
		
	
	public static void main(String[] args) {
		
		check((h,l)->h<l,400,57);

	}

}
interface Climb
{
	boolean isTooHigh(int h,int l);
}