
public class star {
	
	public static void main(String arg[])
	{
		for(int i=0;i<6;i++)
		{
			
			
			for(int j=0;j<6-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1;k++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
			
		}
		
		
	}

}
