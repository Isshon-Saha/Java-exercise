import java.io.*;

public class Calculator
{
	private double x;
	private double y;
	
	public Calculator()
	{
		System.out.println("Default constructor");
	}
	
	public Calculator(double x,double y) 
	{
		this.x=x;
		this.y=y;
	}
	
	public double add(double x,double y) throws ArithmeticException,IOException
	{
		return (x+y);
	}
	
	public double sub(double x,double y) throws ArithmeticException,IOException
	{
		return (x-y);
	}
	
	public double mul(double x,double y) throws ArithmeticException,IOException
	{
		return x*y;
	}
	
	public double div(double x,double y) throws ArithmeticException,IOException
	{
		return x/y;
	}
}