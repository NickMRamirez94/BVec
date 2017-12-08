import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;

public class testmain {

	public static void main(String[] args) throws IOException 
	{
		importChar GETFILE = new importChar();
		String test;
		
		test = GETFILE.IMPORT("Text.txt");
		
		//System.out.print(test);
		
		BVector Bvec = new BVector();
		
		Bvec.add_String(test);
		
		Bvec.print();
		
		System.out.print('\n');
		
		Boolean[] testb =  (Bvec.RetunBV()) ;
		int i = 0;
		while(i < Array.getLength(testb))
		{
			
			
			if (testb[i]==true)
			{
				System.out.print(1);		
			}
			else
			{
				System.out.print(0);
			}
			i++;
		}
		
		
		
	

	}

}
