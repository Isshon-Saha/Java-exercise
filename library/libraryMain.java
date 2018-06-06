public class libraryMain
{
	public static void main(String args[])
	{
		Library l1=new Library("A","B",4);
		Book b1=new Book("b2","11","1234","horror",10);
		Book b2=new Book("b3","111","12344","horror",10);
		l1.addNewBook(b1);
		l1.addNewBook(b2);
		l1.deleteBook(b1);
		l1.addNewBookCopy(b1,10);
		l1.showLibinfo();
		
	}
}
