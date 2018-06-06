public class Library
{
	private String libName;
	private String libAddress;
	private Book[] listOfBook;
	private int totalBook;
	
	public Library()
	{
		this("x","x",0);
	}
	
	public Library(String libName,String libAddress,int cap)
	{
		this.libName=libName;
		this.libAddress=libAddress;
		listOfBook=new Book[cap];
	}
	
	public void addNewBook(Book book)
	{
		if(totalBook<listOfBook.length)
		{
			listOfBook[totalBook]=book;
			totalBook++;
		}
	}
	
	public void deleteBook(Book book)
	{
		if(totalBook>-1)
		{
			totalBook--;
			int tr=totalBook;
			for(int i=0;i<=totalBook;i++)
			{
				if(listOfBook[tr].bookName==book.bookName)
				{
                    listOfBook[tr]=listOfBook[totalBook];
					break;
				}
				else
				{
					tr--;
				}
			}
		}
	}
	
	public void addNewBookCopy(Book book,int copy)
	{
		book.addBookCopy(copy);
	}
	
	public void showLibinfo()
	{
		System.out.println("Library name:" +libName);
		System.out.println("Library address:" +libAddress);
		System.out.println("Total book:" +totalBook);
		for(int i=0;i<totalBook;i++)
		{
			if(listOfBook[i]!=null)
			{
			   listOfBook[i].showInfo();
			}
		}
	}
}