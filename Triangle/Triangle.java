public class Triangle
{
	private int x;
	private int y;
	private int z;
	
	public Triangle()
	{
		this.x=0;
		this.y=0;
		this.z=0;		
	}
	
	public Triangle(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public  void showInfo()
	{
		System.out.println("X: " +x);
		System.out.println("Y: " +y);
		System.out.println("Z: " +z);
	}
	
	public void testTriangle()
	{
		if(x==y && y==z && z==x)
		{
			System.out.println("Equilateral");
		}
		else if(x!=y && y!=z && x!=z)
		{
			System.out.println("scalene");
		}
		else
		{
			System.out.println("isosceles");
		}
	}
}