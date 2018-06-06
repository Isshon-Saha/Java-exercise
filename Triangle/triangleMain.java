public class triangleMain
{
	public static void main(String[] args)
	{
		Triangle t1=new Triangle();
		t1.showInfo();
		t1.testTriangle();
		Triangle t2=new Triangle(12,13,12);
		t2.showInfo();
		t2.testTriangle();
	}
}