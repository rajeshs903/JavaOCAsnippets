package langaugeFundamentals;


/*
 *  CASE 2 : if child class doesn't have main() method , then automatically parent class's main(() methods will execute
 * 			if both are present then child class main() will executed.
 * 
 * Below is "method hiding" , not "overriding method"
 */
public class MainMethodDemo3Case2 
{

	public static void main(String[] args)
	{
		System.out.println("parent class main");
	}	

	static
	{
		System.out.println("static block");
	}
}


class Test3 extends MainMethodDemo3Case2
{
	public static void main(String[] args)
	{
		MainMethodDemo3Case2.main(null);
		System.out.println("child class main");
	}	
	
}
