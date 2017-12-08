//import java.util.Scanner;
import java.io.*;
import java.nio.charset.Charset;

public class importChar {
	
	String File_value = new String();
	
	public String IMPORT(String FileName) throws IOException
	{
		
		int count = 0;
		char Next_Char;

		File_value = "";
		
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(FileName)),Charset.forName("UTF-8")));
			int c;
			while((c = reader.read()) != -1) {
			  Next_Char = (char) c;
			  
			  File_value = File_value + Next_Char;
			 count ++;
			  
			}
		
		if (count < 1)
			{
			reader.close();
			return ("");
			}
		
		else
		{
			reader.close();
			return File_value;
		}
		
		
	}

}
