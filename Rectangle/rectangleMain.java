public class rectangleMain
{
	public static void main(String[] args)
	{
		Rectangle t1=new Rectangle();
		t1.showInfo();
		t1.recCheck();
		Rectangle t2=new Rectangle(12,13,12,13);
		t2.showInfo();
		t2.recCheck();
		Rectangle t3=new Rectangle(12,13,14,15);
		t3.showInfo();
		t3.recCheck();
	}
}