import java.io.*;

public class FileHandling1 {

	public static void main(String[] args) throws IOException 
	{
		
		FileOutputStream fops=new FileOutputStream("C:\\rough\\sample.txt");
		String s = "this is my first file program1";
		byte b[]=s.getBytes();
		fops.write(b);
		fops.close();
		
		System.out.println("sucess");
		
	}

}
