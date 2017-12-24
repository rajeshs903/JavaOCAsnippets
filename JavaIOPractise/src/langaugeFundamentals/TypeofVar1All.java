package langaugeFundamentals;

public class TypeofVar1All 
{
	static int x=103; 			// instance primitive variable
	String s="Rajesh";	// instance reference variable
	
	int[] bb;
	
	public void show(int x)
	{
		this.x=x;
		System.out.println("hello world and x= "+x);
		 int a[];
		 System.out.println();
		
		
		
	}
	public static void main(String[] args) 
	{
		TypeofVar1All t=new TypeofVar1All();
		t.show(TypeofVar1All.x);
		
		
		int[] a=new int[3]; // Local reference variable
		int c=100;			// local primitive variable
		
		/**
		 * now below we are checking the possibility of printing the default values of array without intialzing  
		 */
		
		System.out.println("the  Local reference variable 'a' pointing at the address = "+a);
		System.out.println("In the Local reference variable 'a' , a[0] having the value = "+a[0]);
		
		
		System.out.println("\n\t now we will try it local refernce array \n");		

		
		
		System.out.println("the  instance reference variable 'bb' pointing at the address = "+t.bb);
		
		/*
		we get java.lang.NullPointerException in below line
		
		System.out.println("In the instance reference variable 'bb' , bb[0] having the value = "+t.bb[0]);  
	    */
	}

}
class Test2
{
	int x;
	
}
