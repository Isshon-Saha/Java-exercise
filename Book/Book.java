public class Book
{
	private String bookName,bookAuthor,bookId,bookType;
	private int bookCopy;
	
	public Book()
	{
		bookName="empty";
		bookAuthor="empty";
		bookId="empty";
		bookType="empty";
		bookCopy=0;
	}
	
	public Book(String bookName,String bookAuthor,String bookId,String bookType,int bookCopy)
	{
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookId=bookId;
		this.bookType=bookType;
		this.bookCopy=bookCopy;
	}
	
	public void showInfo()
	{
		System.out.println("Book name:" +bookName);
		System.out.println("Book author:" +bookAuthor);
		System.out.println("Book Id:" +bookId);
		System.out.println("Book type:" +bookType);
		System.out.println("Nuber of copies :" +bookCopy);
	}
	
	public void addBookCopy(int x)
	{
		bookCopy=bookCopy+x;
	}
	
	public static int bookCounter;
	
	public static showTotalBookInfi()
	{
		bookCounter++;
		System.out.println("Total number of books:" +(bookCounter+1));
	}
	

	
	
}