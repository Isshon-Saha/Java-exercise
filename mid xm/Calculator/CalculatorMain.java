import java.util.*;
import java.io.*;
public class CalculatorMain
{
	public static void main(String[] args)
	{
		try
		{
			Calculator Cl= new Calculator();
			Scanner sc = new Scanner(System.in);
		    System.out.println("\nDo you want to \n Addition if then Press 'A',\n Substraction if then press 'S',\n Multiplication if then press 'M',\n Division then press 'D'");
		    String y = sc.nextLine();
			if(y.equals("A"))
			{
				System.out.println("Enter Your Numbers:");
				double a= sc.nextDouble();
				double b= sc.nextDouble();
				System.out.println("Result:" + Cl.add(a,b));
			}
			else if(y.equals("S"))
			{
				System.out.println("Enter the Minuend Number:");
				double a= sc.nextDouble();
				System.out.println("Enter the Subtrahend Number:");
				double b= sc.nextDouble();
				System.out.println("Result:" + Cl.sub(a,b));
			}
			else if(y.equals("M"))
			{
				System.out.println("Enter Your Numbers:");
				double a= sc.nextDouble();
				double b= sc.nextDouble();
				System.out.println("Result:" + Cl.mul(a,b));
			}
			else if(y.equals("D"))
			{
				System.out.println("Enter the Dividend Number:");
				double a= sc.nextDouble();
				System.out.println("Enter the Divisor Number:");
				double b= sc.nextDouble();
				System.out.println("Result:" + Cl.div(a,b));
			}
		}
		
		catch(ArithmeticException a)
		{
			a.toString();
		}
		catch(IOException i)
		{
			i.toString();
		}
		
	}
}