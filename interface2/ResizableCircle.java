public class ResizableCircle extends Circle implements Resizable
{
	public ResizableCircle(double radious)
	{
		super(radious);
	}	
	public double resize(int percent)
	{
		double f=(double)percent/100;
		radious=radious*f;
		System.out.println("Resize successful");
		return radious;
	}
}
