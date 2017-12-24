import java.io.*;
public class ByteInputSample {

	public static void main(String[] args) throws IOException 
	{//  example for ByteArrayOutputStream class
		
		 FileOutputStream fout1=new FileOutputStream("C:/rough/sample.txt");  
		 FileOutputStream fout2=new FileOutputStream("C:/rough/sample2.txt");
		 
		 ByteArrayOutputStream baos=new ByteArrayOutputStream();
		 baos.write(123);
		 baos.writeTo(fout1);
		 baos.writeTo(fout2);
		 
		 baos.flush();
		 //baos.close();
		 System.out.println("success");
		
		
	}

}
