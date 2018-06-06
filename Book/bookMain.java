public class bookMain
{
	public static void main(String[] args)
	{
		Book b1=new Book("dunno","dunno","dunno","dunno",1);
		Book b2=new Book("b2","11","1234","horror",10);
		b1.showInfo();
		b2.showInfo();
		b1.showTotalBookInfi();
		b2.showTotalBookInfi();
	}
}