
/*import java.io.*;

public class FileInputSample {

	public static void main(String[] args) throws IOException
	{
		File f=new File("C:\\rough\\sample.txt");
		FileInputStream fis = new FileInputStream(f);
		int content =0;
		while((content=fis.read())!=-1)
		{
			System.out.println((char)content);
		}
			
		fis.close();
	}

}
*/
import java.io.*;  
class FileInputSample{  
 public static void main(String args[]){  
  try{  
    FileInputStream fin=new FileInputStream("C:/rough/sample.txt");  
    int i=0;  
    while((i=fin.read())!=-1){  
     System.out.println((char)i);  
    }  
    fin.close();  
  }catch(Exception e){System.out.println(e);}  
 }  
}  