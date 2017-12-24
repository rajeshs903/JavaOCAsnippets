package langaugeFundamentals;

public class TypeOfVarStatic2 {

	static int x=100;
	int y=200;
	
	public static void main(String[] args)
	{
		TypeOfVarStatic2 t1=new TypeOfVarStatic2();
		TypeOfVarStatic2 t2=new TypeOfVarStatic2();
		
		t1.x=33;
		t1.y=44;
		
		System.out.println("t2.x = "+t2.x+" t2.y = "+t2.y+"\n t1.x = "+t1.x+" t1.y = "+t1.y+"\n x = "+x);

	}

}
