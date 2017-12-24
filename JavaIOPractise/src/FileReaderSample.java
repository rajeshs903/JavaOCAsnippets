import java.io.*;
public class FileReaderSample {

	public static void main(String[] args) throws IOException {
		FileReader fr =new FileReader("C:\\rough\\task3.txt");
		int content=fr.read();
		
		while(content!=-1)
		{
			System.out.println((char)content);
			content=fr.read();
			
		}
		//System.out.println();
		fr.close();

	}

}
