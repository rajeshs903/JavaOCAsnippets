package com.acc.flowControlDemo;

public class BreakContinueDemo {

	public static void main(String[] args) 
	{
		/**
		 * ONLYYY in 3 places we should use BREAK statement 
		 * 
		 * 1. inside switch
		 * 2. inside loop
		 * 3. inside labeled block  
		 */
		
		/**
		 * 1. inside switch
		 * 
		 
		int x=12;
		switch(x)
		{
		case 10:
			System.out.println("10");
			break;
		case 12:
			System.out.println("12");
			break;
			
			default:
				System.out.println("none");
		}
		*/
		/**
		 * 2. inside loop
		 * 
		 * 
		
		int x=0;
		for(x=0;x<10;x++)
		{
			System.out.println(" "+x);
			if (x==5)
				break;
		}
		 */
		
		
		/**
		 * 3. inside labeled block
		 * 
		 * 
		 * 
		 
		
		int x=33;
			
			m:
			{
			
			System.out.println("begin");
			
			break m;
			//System.out.println("end");//unreachable code
			}
		System.out.println("hello");
		
		*/
		
		
		/***
		 * only above three places we can use break statement , else where if use then you will get compile time error
		 * example below
		 * 
		 * 
		
		int x=10;
		if(x==10)
			break; //break cannot be used outside of a loop or a switch
		System.out.println("hi");
		 */
		
		
		//__________________________________________________________________________________________________________________//
		//										CONTINUE
		//__________________________________________________________________________________________________________________//
		
		
		/***
		 * CONTINUE can be used only inside the loops
		 * 
		
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
				continue;
			System.out.println(i);
		}
		 */
		
		
		/***
		 * Break and continue with labeled FOR loops
		 *  BELOW 4 cases
		 */
		
		/**
		 * case 1 :BREAK
		 * 
		 * 
		 
		l1:
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				if(i==j)
					break;
				System.out.println(i+"  ......  "+j);
			}
		}
		
		*/
		
		/**
		 * case 2 :BREAK l1;
		 * 
	 
		 
		l1:
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				if(i==j)
					break l1;
				System.out.println(i+"  ......  "+j);
			}
		}
		
			*/
	
	/**
	 * case 3 : Continue
	 * 
	 *
	 *
	
	l1:
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(i==j)
				continue;
			System.out.println(i+"  ......  "+j);
		}
	}
	
	 */
		
	
	/**
	 * case 4 : Continue l1;
	 * 
	 */ 
	 
	l1:
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(i==j)
				continue l1;
			System.out.println(i+"  ......  "+j);
		}
	}
	
		
		
		
		
		
		
	}

}
