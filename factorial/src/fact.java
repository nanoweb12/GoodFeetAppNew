import java.util.Scanner;


public class fact {
	
	static int fact=1;
	
	public static void main(String arg[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		if(n<=0)
		{
			System.out.println("n is lees then 0");
		}
		else
		
			for(int c=1;c<=n;c++)
			
			fact=fact*c;
			
		
		System.out.print("fact of "+fact);
		
	}


}
