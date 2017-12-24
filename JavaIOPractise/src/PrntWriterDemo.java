import java.io.*;
public class PrntWriterDemo {

	public static void main(String[] args) throws IOException {

		FileReader fr=new FileReader("C:\\rough\\sample.txt");
		
		// C:\\rough\\sample.txt
		
		PrintWriter pw=new PrintWriter("C:\\rough\\sample.txt");
		
		pw.println("rajesh santha");
		pw.print(100);
		pw.println();
		pw.println(1111);
		pw.close();
		
		
		System.out.println("done writing these things\n\n\n\n*************\n\n\n\n");
		
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}

		br.close();

	}

}