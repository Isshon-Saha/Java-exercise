public class Book
{
	public String bookName,bookAuthor,bookId,bookType;
	private int bookCopy;
	private static int bookCounter;
	
	public Book()
	{
		bookName="empty";
		bookAuthor="empty";
		bookId="empty";
		bookType="empty";
		bookCopy=0;
		bookCounter++;
	}
	
	public Book(String bookName,String bookAuthor,String bookId,String bookType,int bookCopy)
	{
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookId=bookId;
		this.bookType=bookType;
		this.bookCopy=bookCopy;
		bookCounter++;
	}
	
	public void showInfo()
	{
		System.out.println("Book name:" +bookName);
		System.out.println("Book author:" +bookAuthor);
		System.out.println("Book Id:" +bookId);
		System.out.println("Book type:" +bookType);
		System.out.println("Number of copies :" +bookCopy);
	}
	
	public void addBookCopy(int x)
	{
		bookCopy=bookCopy+x;
	}
	
	
	public static  void showTotalBookInfi()
	{
		System.out.println("Total number of books:" +bookCounter);
	}
	

	
	
}