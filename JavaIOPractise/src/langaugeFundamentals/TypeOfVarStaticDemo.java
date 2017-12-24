package langaugeFundamentals;

public class TypeOfVarStaticDemo 
{
	static int x=100;
	int y=200;
	static int a;
	static boolean b;
	static byte b1;
	static float f;
	static double d;
	static long l;
	static char ch;
	
	public static void main(String[] args) 
	{
		TypeOfVarStaticDemo t1=new TypeOfVarStaticDemo();
		TypeOfVarStaticDemo t2=new TypeOfVarStaticDemo();
		System.out.println(x);
		System.out.println(t1.x);
		System.out.println(TypeOfVarStaticDemo.x);
		
		System.out.println("\n "+t1.a+"\n "+t1.b+"\n "+t1.b1+"\n "+t1.f+"\n "+t1.d+"\n "+t1.l+"\n "+t1.ch);
		
		
		
		t1.x=33;
		t1.y=44;
		
		System.out.println(t2.x+" "+t2.y+"\n"+t1.x+" "+t1.y);
	}

}

class Test1
{
	
	
}