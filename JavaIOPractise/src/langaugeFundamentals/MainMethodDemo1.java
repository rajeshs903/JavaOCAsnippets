package langaugeFundamentals;

public class MainMethodDemo1 
{
	public static int Main1(int x) // its not main()
	{
		return x;
		
	}
	/**
	 * below are the possible valid main() method declarations 
	 */
	/*static public  void main(String[] args) // Standard Valid declaration
	{
		System.out.println(Main1(1234));
		//Main1(10);
	}*/
	
	/*
	public static  void main(String[] args)  	// Valid declaration
	{
		System.out.println(Main1(1234));
	}
    */
	
	/*
	public static  void main(String []args)  	// Valid declaration
	{
		System.out.println(Main1(1234));
	}
    */
	
	/*
	public static  void main(String args[])  	// Valid declaration
	{
		System.out.println(Main1(1234));
	}
    */
	
	
	/*
	public static  void main(String[] rajesh)  	// Valid declaration
	{
		System.out.println(Main1(1234));
	}
    */

	/*
	public static  void main(String...rajesh)  	// Valid declaration
	{
		System.out.println(Main1(1234));
	}
    */

	
	/*
	public static  synchronized strictfp final void main(String ...rajesh) // Valid declaration
	{
		System.out.println(Main1(1234));
	}
	*/
	
	/*
	public final static  synchronized strictfp void main(String ...rajesh) // Valid declaration
	{
		System.out.println(Main1(1234));
	}
	*/
	
	/*
	public static final synchronized strictfp void main(String ...rajesh) // Valid declaration
	{
		System.out.println(Main1(1234));
	}
	*/
	
	/*
	public static synchronized final strictfp void main(String ...rajesh) // Valid declaration
	{
		System.out.println(Main1(1234));
	}
	*/
	
	
	/*
	public static strictfp synchronized final void main(String ...rajesh) // Valid declaration
	{
		System.out.println(Main1(1234));
	}
	*/
	
	/*
	static strictfp synchronized public final void main(String ...rajesh) // Valid declaration
	{
		System.out.println(Main1(13232));
	}
	*/
	/*
	static strictfp synchronized final public void main(String ...rajesh) // Valid declaration
	{
		System.out.println(Main1(1323332));
	}
	
	*/
	
	public static final strictfp synchronized void main(String ...rajesh) // Valid declaration
	{
		System.out.println(Main1(132532));
	}
	
}
