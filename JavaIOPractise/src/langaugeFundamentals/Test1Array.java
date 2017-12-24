package langaugeFundamentals;

public class Test1Array {

	public static void main(String[] args) 
	{
		int[] r;
		int[] a,b; //a is 1D ,b is 1D
		int[] []a1,b1; //2D,1D
		//int[] A2[],[]B2; 
		// CE : Syntax error on token ",", Identifier expected after this token
		//Syntax error on token "B2", delete this token 
		
		int x[]=new int[5];
		int x1[][]=new int[5][2];
		byte x2[]=new byte [5];
		short x3[]=new short[5];
		double x4[]=new double[5];
		boolean x5[]=new boolean[5];
		
		//int[] y=new int[]; //CE
		int[] y1=new int[5];
		int[] y2=new int[0];
	//	int[] y3=new int[-2]; //No CE , but Runtime Error java.lang.NegativeArraySizeException
		int[] y4=new int['a'];
		
		
		System.out.println(x.getClass().getName()+"\n"+x1.getClass().getName()+"\n"+x2.getClass().getName()+"\n"+x3.getClass().getName()+"\n"+x4.getClass().getName()+"\n"+x5.getClass().getName()+"\n");
		
 		// how many of below are valid ? 
 		/*
 		int[] t=new int[];
 		int[] t1=new int[3];
 		int[][] t2=new int[3][];
 		int[][] t3=new int[][4];
 		int[][] t4=new int[3][6];
 		int[][] t5=new int[][];
 		int[][][] t6=new int[3][][];
 		int[][][] t7=new int[3][4][];
 		int[][][] t8=new int[][4][];
 		int[][][] t9=new int[][][7];
 		int[][][] t10=new int[][][];
		*/	
		
 		/*int[] c=new int[3];
 		System.out.println("default value for c[0] is  "+c[0]);
 		*/
 		
 	/*	int[][] c1=new int[3][3];
 		
 		System.out.println("default value for c1[0] is  "+c1[0]); // its a referece for the 1D array inside of it of size 3
 		System.out.println("default value for c1[1] is  "+c1[1]);// its a referece for the 1D array inside of it of size 3
 		System.out.println("default value for c1[2] is  "+c1[2]);// its a referece for the 1D array inside of it of size 3
 		System.out.println("default value for c1[0][0] is  "+c1[0][0]);
 		System.out.println("default value for c1[0][0] is  "+c1[0][1]);
 		System.out.println("default value for c1[0][0] is  "+c1[1][0]);
 		System.out.println("default value for c1[0][0] is  "+c1[1][1]);
 	*/
 		
 		
 		
 	/*	int[][] c2=new int[3][];
 		
 		System.out.println("default value for c2[0] is  "+c2[0]); // no further size is specified so it has no referece so this will be null
 		System.out.println("default value for c2[1] is  "+c2[1]);// no further size is specified so it has no referece so this will be null
 		System.out.println("default value for c2[2] is  "+c2[2]); // no further size is specified so it has no referece so this will be null
// 		System.out.println("default value for c2[2] is  "+c2[2][0]); // it will be NullPointerException as we are performing retrival from null 
 		*/
 		
 		
 		
 		
 		/*
 		int[] c3=new int[6];
 		System.out.println(c3[6]); // java.lang.ArrayIndexOutOfBoundsException
 		System.out.println(c3[-6]); // java.lang.ArrayIndexOutOfBoundsException even if it is negative also
 		*/
	
	
 		/*
 		int[][] c4= new int[2][3];
 		c4[0][0]=10;
 		c4[0][1]=12;
 		c4[0][2]=-5;
 		c4[1][0]=30;
 		c4[1][1]=40;
 		c4[1][2]=50;
 			System.out.println("the values of c4[0][0] is"+c4[0][0]);
 			System.out.println("the values of c4[0][1] is"+c4[0][1]);
 			System.out.println("the values of c4[0][2] is"+c4[0][2]);
 			System.out.println("the values of c4[1][0] is"+c4[1][0]);
 			System.out.println("the values of c4[1][1] is"+c4[1][1]);
 			System.out.println("the values of c4[1][2] is"+c4[1][2]);
 			*/
 			

 		
		String[] args1={"A","B","C"};
		args=args1;
 		
			for(String s:args)
			{
	 			System.out.println(s);
	 		}
	 		
 		
 	
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
	
	
	}

}
