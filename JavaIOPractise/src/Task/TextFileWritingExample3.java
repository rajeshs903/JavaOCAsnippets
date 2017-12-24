package Task;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TextFileWritingExample3 {

	public static void main(String[] args) 
	{
		try {
	FileOutputStream outputStream = new FileOutputStream("C:\\rough\\word\\file11.docx");
	OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");

	BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
	bufferedWriter.write("hi this is the content");
	bufferedWriter.newLine();
	bufferedWriter.write("againnnnn");
	bufferedWriter.close();
		}
 catch(Exception e)
		{
	e.printStackTrace();
		}
	}
}