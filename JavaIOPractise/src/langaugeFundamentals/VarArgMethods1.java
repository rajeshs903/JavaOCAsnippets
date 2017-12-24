package langaugeFundamentals;

public class VarArgMethods1 
{


	public void show(int...x)
	{
		System.out.println(" number of paramerters passed  "+x.length);
	
	}
	
	/**
	 * Basic example for arg-method below
	 */
	public void sum(int...x)
	{
		int total=0;
		for(int x1:x)
		{
			total+=x1;
		}
		System.out.println("the sum of the "+x.length+" of variables is "+total);
	}

	
/**
 * CASE - 4
 * int...y and int[] y are almost same coz int...y will converted into int[] y internally..
 * so we cannot declare arg param method and the method with which takes 1-D array   
 */
/*	public void m1(int...y)
	{
		System.out.println("\n int..y");
	}
	public int m1(int[] aab)
	{
		System.out.println("\n int y1[]");
	}
*/	
	public static void main(String[] args) 
	{
		VarArgMethods1 v=new VarArgMethods1();
		v.show();
		v.show(1,2);
		v.show(1,2,3);
		v.show(1,2,3,4);
		v.show(1,2,3,4,5);
	
		v.sum();
		v.sum(1,2);
		v.sum(1,2,3);
		v.sum(1,2,3,4);
		v.sum(1,2,3,4,5);
		
	
	}


}
