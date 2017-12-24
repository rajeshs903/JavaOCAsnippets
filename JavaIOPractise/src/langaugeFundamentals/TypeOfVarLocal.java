package langaugeFundamentals;

public class TypeOfVarLocal 
{
	
	public int a;
	private int b;
	protected int c;
	int d;
	
	
	public static void main(String[] args)
	{
		int x;
		int y;
		System.out.println("hello without intialzing local variable 'x', we can get output if we dont use that local variable in our program");
		// System.out.println(y); //Compile time error The local variable y may not have been initialized
		
		if(args.length>0)
		{
			x=10;
		}
		else // without else block here , we will get CE:
		{
			x=11;
		}
		System.out.println(x);
		
/*		public int a2;
		private int b2;
		protected int c2;
		int d2;
		final int a1 = 0;
			System.out.println(a1);
*/	
		
		
		
	}

}
