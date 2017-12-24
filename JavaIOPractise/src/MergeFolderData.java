import java.io.*;
public class MergeFolderData {

	public static void main(String[] args) throws IOException
	{
		PrintWriter pw=new PrintWriter("C:\\rough\\output.txt");
		File f=new File("C:\\rough\\new1");
		
		String[] s=f.list();
		
		for(String s1:s)
		{
			
			/*System.out.println(s1);*/
			
			
			File f1=new File(f,s1);
			BufferedReader br=new BufferedReader(new FileReader(f1));
			String line=br.readLine();
			while(line!=null)
			{
				pw.println(line);
				line=br.readLine();
			}
			
			
		}
		pw.flush();
		pw.close();
		
		
				
		

	}

}
