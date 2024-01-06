package libraryManagementSystem;
import java.util.ArrayList;
import java.util.ListIterator;
public class Library {
	private Book b;
	ArrayList <Book> book=new ArrayList<Book>();
	public void add(Book b)
	{
		book.add(b);
		System.out.println("Book Added succesfully:)");
	}
	public void displayBook()
	{
		if(book.isEmpty())
		{
			System.out.println("Their is NO Book");
		}
		else
		{
			for(Book b:book)
			{
				System.out.println(b);
			}
		}
	}
	public void findBook(int bookId)
	{
		for(Book b:book)
		{
			if(b.getId() == bookId)
			{
				System.out.println("Book Found:"+b.getTitle());
			}
		}
	}
	public void borrowBook(int bookId)
	{
		ListIterator<Book> i = book.listIterator();
		while (i.hasNext()) {
			Book book = (Book) i.next();
			if(book.getId()==bookId) {
				i.remove();
				System.out.println("book of id "+bookId+ " is been borrowed from the library");
			}
		}

	}
	public void returnBook(Book b)
	{
		book.add(b);
		System.out.println("Book Returned succesfully:)");

	}
	}

