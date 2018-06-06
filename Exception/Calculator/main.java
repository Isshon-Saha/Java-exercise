import java.util.Scanner;
import java.io.*;

public class main
{
	public static void main(String[] args)
	{
		try
		{
			Calculator c1=new Calculator();
			Scanner sc=new Scanner(System.in);
			int a;
			System.out.println("Enter what u want to do: \n 1 for add\n 2 for subtraction \n 3 for multiplication \n 4 for division");
			a=sc.nextInt();
			if(a==1)
			{
				System.out.println("Enter the numbers:");
				double b=sc.nextDouble();
				double c=sc.nextDouble();
				System.out.println("Result:" +c1.add(b,c));
			}
			else if(a==2)
			{
				System.out.println("Enter the number u want to subtract from:\n");
				double b=sc.nextDouble();
				System.out.println("Enter the number u want to subtract:\n");
				double c=sc.nextDouble();
				System.out.println("Result:" +c1.sub(b,c));				
			}
			else if(a==3)
			{
				System.out.println("Enter the numbers:");
				double b=sc.nextDouble();
				double c=sc.nextDouble();
				System.out.println("Result:" +c1.mul(b,c));
			}
			else if(a==4)
			{
				System.out.println("Enter the Divident:\n");
				double b=sc.nextDouble();
				System.out.println("Enter the Divider:\n");
				double c=sc.nextDouble();
				System.out.println("Result:" +c1.div(b,c));				
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