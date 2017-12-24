import java.io.*;
public class MergeAlternative {
	
	public static void main(String[] args) throws IOException 
	{
		PrintWriter pw=new PrintWriter("C:\\rough\\rough22\\merge.txt");
		
		BufferedReader br1=new BufferedReader(new FileReader("C:\\rough\\rough22\\file1.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("C:\\rough\\rough22\\file2.txt"));
		
		String line1=br1.readLine();
		String line2=br2.readLine();
		
		while(line1!=null || line2!=null )
		{
			if(line1!=null)
			{
				pw.print(line1); 
		      //pw.print(") ");
				line1=br1.readLine();
			}
			if(line2!=null)
			{
				pw.println(line2);
				line2=br2.readLine();
			}
			
			
		}
		pw.flush();
		pw.close();
		
		
		
	}

}
