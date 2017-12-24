import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Task1 {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\rough\\word\\file11.docx");
		FileReader fr=new FileReader(f);
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