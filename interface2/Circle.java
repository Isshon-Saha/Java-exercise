public class Circle implements GeometricObject
{
	protected double radious=1.0;
	
	public Circle(double radious)
	{
		this.radious=radious;
	}
	public double getPerimeter()
	{
		double perimeter=2*3.1416*radious;
		System.out.println("Perimeter:" +(2*3.1416*radious));
		return perimeter;
	}
	public double getArea()
	{
		double area=3.1416*(radious*radious);
		System.out.println("Area:" +(3.1416*(radious*radious)));
		return area;
	}
}
	
	