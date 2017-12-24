package langaugeFundamentals;
import java.io.*;

public class ArraySortingDesc {

	public static void main(String[] args) throws Exception, IOException
	{
		int i,temp;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[5];
	
		System.out.println("Enter the 5 elements to be sorted \n ");
		for(i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
			
		}
		for (int arr:a)
		{
		System.out.print(arr+" , ");
		}
		 System.out.println("\n and the Sorting of above numbers are \n");
		
		for(i=0;i<a.length;i++)
		{
		
			for(int j=0;j<a.length;j++)
			{
				if(a[i] < a[j]) 
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					
					
				}
				
			}
		}
		for(int sortedArray:a)
		{
			System.out.println(sortedArray);
		}
		
		
		/*int[] numbers = { 5, 8, 14, 1, 5678 };
		int tempVar;
		for (int i = 0; i < numbers.length; i++)
		{
		       for(int j = 0; j < numbers.length; j++)
		       {
		                if(numbers[j] > numbers[i])
		                {
		                       tempVar = numbers [j];
		                       numbers [j]= numbers [i];
		                       numbers [i] = tempVar;
		                }
		       }
		}
		for (int i = 0; i < numbers.length; i++)
		{
		         System.out.println(numbers[i]);
		}
		*/
		
		
	}

}
