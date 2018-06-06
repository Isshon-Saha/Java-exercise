public class NegativeResultException extends RuntimeException
{
	public NegativeResultException()
	{
		System.out.println("Result cannot be negative");
	}
}