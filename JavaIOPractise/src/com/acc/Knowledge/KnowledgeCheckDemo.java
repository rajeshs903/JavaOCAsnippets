package com.acc.Knowledge;

public class KnowledgeCheckDemo {

	public static void main(String[] args) {
		
		int ab[]=new int[3];
		for(int x:ab)
		System.out.println(ab[x]);
		String s="0123456";
		
		System.out.println("AniMaL ".trim().toLowerCase().replace('a', 'A')); //AnimAl
		// Hidden infinete loop
		/*	int x=5;
		while(x>=0)
		{
			int y=3;
			while(y>0)
			{
				if(x<2) continue;
			x--	;y--;
			System.out.println(x*y +" ");
			}
				
		}*/

/*int a[][] =new int[3][3];
for(int i=0;i<a.length;i++)
	for(int j=0;j<a.length;j++)
	{	a[i][j]=i*j;
		System.out.println("i="+i+" j="+j+" "+a[i][j]);
	}	
String x="rajesh";
String y="xyz";

	final String statement=777<435?(x):(y="newValue");
	System.out.println(statement);
	System.out.println(y="newvalues".toString());
	System.out.println(y="newvalues");

	}
	private void lay(Integer []a)
	{
		System.out.println("Integer value is "+a);
	}
*/	

	    int count=0;
	    String[] arr = {"one", "three", "five", "seven"};
	    for(int i=0; i<arr.length; i++)
	        for(int j=0; j<arr[i].length(); j++)
	            if(arr[i].length() == 5) 
	            	count++;
	    System.out.println(count); 

	}
	}
class A
{
	
}