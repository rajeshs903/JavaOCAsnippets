package com.acc.ENUM;

public class JavaEnumPart6 {

}
enum Fish
{
	a,b,c; // semi colon is mandatory if u r writing anything otherthan just constants , else semicolon is optional if only constants are present inside enum 
	public static void main(String[] args)
	{
		System.out.println("main() inside  the enum");
	}
}



/*enum Fish
{
	public static void main(String[] args)
	{
		System.out.println("main() inside  the enum");
	}
	a,b,c; // must be first line
}
*/


/*
enum Fish
{
	//empty enum is valid
}
*/