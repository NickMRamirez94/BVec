
public class BVector {
	
	private Boolean[] BVEC;
	private int size;
	BVector()
	{
	
	    this.BVEC= new Boolean[2];
		this.size = 0; 
	}
	
	
	public void add(Boolean B)
	{
		if(this.size == 0)
		{
			BVEC[0] = B;
			size++;
		}
		else
		{
			Boolean[] TEMP= new Boolean[size];
			for( int i =0 ;i <size;i++)
			{
				TEMP[i]=BVEC[i];
				
			}
			
			BVEC = new Boolean[(size + 1)];
			for( int i =0 ;i <size;i++)
			{
				BVEC[i]=TEMP[i];
			}
			
			BVEC[size] = B;
			
			size++;
		
		}
	}
		
	public Boolean[] RetunBV()
	{
		return BVEC;
		
	}
	public int size()
	{
		return size;
	}
	
	public void Delete_last()
	{
		size--;
	}
	
	
	private void add_letter(char in)
	{
		String Binary_val;
		
		int x;
		
		x= (int)in;
		
		Binary_val = Integer.toBinaryString(x);
		
		if(Binary_val.length() < 7)
		{
			while(Binary_val.length() < 7)
			{
				Binary_val= "0"+Binary_val;
			}
			
		}
		
		
		
		for (int i = 0;i< 7; i++)
		{
			if (Binary_val.charAt(i)== '1')
			{
				this.add(true);
			}
			else
			{
				this.add(false);
			}
		}
		
	}
	
	public void add_String(String input)
	{
		int INPUT_SIZE = input.length();
		
		for (int i = 0 ; i < INPUT_SIZE; i++)
		{
			add_letter(input.charAt(i));
			//System.out.print(input.charAt(i));
			
		}
		
		
	}
	
	public void print()
	{
		for( int i =0 ;i <size;i++)
		{
			if (BVEC[i]==true)
			{
				System.out.print(1);		
			}
			else
			{
				System.out.print(0);
			}
		}
		
	}

}


