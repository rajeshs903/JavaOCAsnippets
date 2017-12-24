import java.io.*;
public class MergeFiles {

	public static void main(String[] args) throws IOException
	{
		
		PrintWriter pw=new PrintWriter("C:\\rough\\merge.txt");
		
		BufferedReader br1=new BufferedReader(new FileReader("C:\\rough\\file1.txt"));
		String s1=br1.readLine();
		while(s1!=null)
		{
			pw.println(s1);
			s1=br1.readLine();
		}
		br1.close();
		
		
		BufferedReader br2=new BufferedReader(new FileReader("C:\\rough\\file2.txt"));
		String s2=br2.readLine();
		while(s2!=null)
		{   
			pw.println(s2);
			s2=br2.readLine();
		}
		br2.close();
		
	
		pw.flush();
		
		pw.close();
		
	}

}
