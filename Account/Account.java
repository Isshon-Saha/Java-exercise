public class Account
{
	public String accName;
	public String acid;
	public int balance;
	
	public Account()
	{
		accName="empty";
		acid="empty";
		balance=0;
	}
	
	public Account(String accName,String acid,int balance)
	{
		this.accName=accName;
		this.acid=acid;
		this.balance=balance;
	}
	
	public int deposit(int amount)
	{
		if(amount>0)
		{
		   balance=balance+amount;
		   System.out.println("Balance: " +balance);
	    }
        else
        {
			System.out.println("Unknown amount");
		}
        return balance;		
	}
	
	public int Withdraw(int amount)
	{
		if(amount>balance)
		{
			System.out.println("NOPE");
		}
		else
		{
			balance=balance-amount;
			System.out.println("Balance: " +balance);
		}
		return balance;
	}
	
	public void showinfo()
	{
		System.out.println("Account Name: " +accName);
		System.out.println("Account Id: " +acid);
		System.out.println("Balance: " +balance);
	}
	
}