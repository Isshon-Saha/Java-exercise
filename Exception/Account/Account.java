public class Account
{
	private String accName;
	private String acid;
	private int balance;
	
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
	
	public int deposit(int amount) throws ZeroAsParameterException,NegativeResultException
	{
		if(amount==0)
		{
			throw new NegativeResultException();
		}
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
	
	public int Withdraw(int amount) throws ZeroAsParameterException,NegativeResultException
	{
		if(amount==0)
		{
			throw new ZeroAsParameterException();
		}
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
	
	public void transfer(int amount,Account receiver) throws ZeroAsParameterException,NegativeResultException
	{
		if(amount==0)
		{
			throw new ZeroAsParameterException();
		}
		if(this.balance>amount)
		{
		receiver.balance=receiver.balance+amount;
		this.balance=this.balance-amount;
		}
		else
		{
			System.out.println("Not possible");
		}
		
	}
	
	
	public void showinfo()
	{
		System.out.println("Account Name: " +accName);
		System.out.println("Account Id: " +acid);
		System.out.println("Balance: " +balance);
	}
	
}