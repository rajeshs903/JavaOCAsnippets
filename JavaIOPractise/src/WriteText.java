
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteText {
	static PrintWriter out;

private static String getCountFromDatabase() {
	return "123456";
}
public static void main(String[] args) {
	 String fileName = "C:\\rough\\word\\file11.docx";
	    PrintWriter printWriter = null;
	    File file = new File(fileName);
	    try {
	    	if (!file.exists()) file.createNewFile();
	        printWriter = new PrintWriter(new FileOutputStream(fileName, true));
	        printWriter.write(getCountFromDatabase());
	    } catch (IOException ioex) {
	        ioex.printStackTrace();
	    } finally {
	        if (printWriter != null) {
	            printWriter.flush();
	            printWriter.close();
	        }
	    }

}
}  
