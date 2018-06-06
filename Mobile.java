public class Mobile
{
	public String mobileownerName;
	public String mobileNumber;
    public int mobileBalance;
    public String mobileOSName;
	public boolean lock;
	
	public Mobile()
	{
		this("dummy","dummy",0,"dummy");
	}
	
	public Mobile(String mobileownerName,String mobileNumber,int mobileBalance,String mobileOSName)
	{
		this.mobileownerName=mobileownerName;
		this.mobileNumber=mobileNumber;
		this.mobileBalance=mobileBalance;
		this.mobileOSName=mobileOSName;
		lock=true;
	}
	
	public void showInfo()
	{
		if(lock==false)
		{
			System.out.println("Owner Name:" +mobileownerName);
		    System.out.println("Number: " +mobileNumber);
			System.out.println("Balance: " +mobileBalance);
			System.out.println("OS: " +mobileOSName );
		}
		else
		{
			System.out.println("Unlock phone to perform requested acton");
		}
		
	}	
	
	public void recharge(int amount)
	{
		if(lock==false)
		{
			if(amount>0)
			{
				mobileBalance=mobileBalance+amount;
			}
		}
		
		else
	    {
		    System.out.println("Unlock phone to perform requested acton");
	    }
	}
	
	public void callSomeone(int timeDuration)
	{
		if(lock==false)
		{
			mobileBalance=mobileBalance-timeDuration;
		}
		else
		{
			System.out.println("Unlock phone to perform requested acton");
		}
	}

}