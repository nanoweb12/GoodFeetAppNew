import java.security.acl.Owner;
import java.util.Scanner;


public class bank_balance
{
	
	public static String owner;
	public int balance1;
	
	private static int balance; 

	
	
	
	public bank_balance( String name, int dollars )
	{
		owner = name;

		if (dollars >= 0)
			balance = dollars;
	
		else
			dollars =0;
	
	}

	public int getBalance()
	{
		return balance;
	}

	public void setBalance(int dollars)
	{
		if (dollars >= 0)
			balance = dollars;
		else
			dollars = 0;		

	}
	
	public static class mytest
	{
		
		public static void main(String[]arg)
		{
			
			
			System.out.println("Plese enter the balance:");
			bank_balance bl=new bank_balance(owner, balance);
			bl.getBalance();
			System.out.println("this is the response :"+balance);
		}
	}
	
}