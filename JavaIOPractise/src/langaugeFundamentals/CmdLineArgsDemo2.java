package langaugeFundamentals;

public class CmdLineArgsDemo2 
{

	public static void main(String[] args) 
	{
		
		
		/* 
		 * Case - I
		 * 
		 * 
		String []args2={"A","b","c"};
		
		args=args2;	// without this line we will get actual command line arguments as output ,
						//but here in this line 'args' now pointing towards 'args2' 
		
		for(String x:args)
		{
			System.out.println(x);
		}
		
		*/
		
		
		/*
		 * Case - II
		 * 
		 * here in this we trying add operation but it will result concatenation  
		 *
		 *
		 
		System.out.println(args[0]+args[1]);
		
		
		*/
		
		
		/*
		 *Case III
		 *
		 * space is the delimeter in cmd line args
		 * if we want to include the word which includes a blank space then pass it as string
		 * Eg :		
		 * 		java ClassName java book  // here 'java' and 'book' will treat as separate parameters
		 * 									//args[0]='java ' and args[1]='book'
		 *
		 *
		 *solution is :
		 *				java ClassName "java book"  // here 'java' and 'book' will treat as single parameter
		 * 
		 * 											//args[0]="java book"
		 
		
		
		System.out.println(args[0]);
		
		
		
		*/
		
		
		
	}

}
