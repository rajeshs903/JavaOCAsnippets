package langaugeFundamentals;

public class VarArgMethods3 
{

	public static void main(String[] args) 
	{

		int[] a={11,22,33};
		int[] b={4,5,6};
		m1(a,b);    		// 
		
	}
	public static void m1(int[]...x)
	{
		try
		{
			
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.println("\t \t"+x[i][j]);
			}
		}

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("check the ArrayIndex ,");
		}
		
	}

}
