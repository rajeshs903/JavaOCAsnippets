package langaugeFundamentals;

public class CmdLineArgsDemo1 
{

	public static void main(String[] args) 
	{
		/*
		
		int l=Integer.parseInt(args[0]);
		System.out.println("the square of "+l+" is ");
		*/
		
		
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		
		
		
	}

}
