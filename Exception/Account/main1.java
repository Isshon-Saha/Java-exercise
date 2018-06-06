public class main1
{
	public static void main(String[] args)
	{
		try
		{
			 Account s = new Account("E-shaun","122320",5000);
             s.deposit(0);
             s.Withdraw(7000);
             s.showinfo();
             Account p=new Account("Ashok","106321",20001023);
             p.showinfo();
             p.transfer(10000,s);
             s.showinfo();
             p.showinfo();
		}
		
		catch(ZeroAsParameterException z)
		{
			z.toString();
		}
		
		catch(NegativeResultException n)
		{
			n.toString();
		}
	}
}