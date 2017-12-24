import java.io.*;
public class FileExtractDemo {

	public static void main(String[] args) throws IOException
	{
		PrintWriter pw=new PrintWriter("C:\\rough\\FileExtract\\output.txt");
		
		BufferedReader br=new BufferedReader(new FileReader("C:\\rough\\FileExtract\\input.txt"));
		String line=br.readLine();
		while(line!=null)
		{
			boolean available=false;
			BufferedReader br2=new BufferedReader(new FileReader("C:\\rough\\FileExtract\\dnd.txt"));
			String dnd=br2.readLine();
			while(dnd!=null)
			{
				if(line.equals(dnd))
				{
					available=true;
					break;
					
				}
				dnd=br2.readLine();
			}
			
			if (available== false)
			{
				pw.println(line);
			}
			line=br.readLine();	
		}
		pw.flush();
		pw.close();
		

	}

}
