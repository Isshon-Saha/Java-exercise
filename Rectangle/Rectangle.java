public class Rectangle
{
	private int w,x,y,z;
	
	public Rectangle()
	{
		w=0;
		x=0;
		y=0;
		z=0;
	}
	
	public Rectangle(int w,int x,int y,int z)
	{
		this.w=w;
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public void showInfo()
	{
		System.out.println("W: " +w);
		System.out.println("X: " +x);
		System.out.println("Y: " +y);
		System.out.println("Z: " +z);
	}
	
	public void recCheck()
	{
		if(w==x && x==y && y==z && z==w && w==y && x==z)
		{
			System.out.println("Square");
		}
		else if(w!=x && x!=y && y!=z && z!=w && w!=y && x!=z)
		{
			System.out.println("What did u do!!!!");
		}
		else
		{
			System.out.println("Rectangle");
		}
	}
}