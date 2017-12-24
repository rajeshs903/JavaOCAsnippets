package langaugeFundamentals;

public class VarArgMethods2 {


	public void show1(int... y)
	{
		
		System.out.println("arg method executed with values ");
		
	}
	
	public void show1(int y)
	{
		System.out.println("normal method executed with values ");
	}
	
	public static void main(String...args) // here to show the possibility of usage of var-arg parameter , we replaced 1-D array with var-Arg parameter
	{
	VarArgMethods2 v1=new VarArgMethods2();
	v1.show1();
	v1.show1(55);
	/**
	 * in above statement both normal and var-arg methods will get matched , then the priority will given to normal mehtod 
	 * and note that var-arg will execute only when there are no other methods to execute
	 */
	
	v1.show1(16,22);

	}

}
