package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class HyderabadLibrary implements Library {
 Scanner sc=new Scanner(System.in);
	
private static	ArrayList<Book> l=new ArrayList<Book>();
	@Override
	public void addBook(Book b) {
		l.add(b);
	}

	@Override
	public void displayBookDetails(String a) {
		boolean status=false;
		for(Book i:l)
		{
			if(i.getAuthorName().equalsIgnoreCase(a))
			{
				status=true;
				System.out.println(i);
			}
		}
		if(status==false)
		{
			throw new AuthorNotFoundException();
		}
		
	}

	@Override
	public void removeBook(int id) {
		boolean status =false;
		for(Book x:l)
		{
			if(x.getBookid()==id)
			{   
				l.remove(x);
				status=true;
				System.out.println("book removed successfully");
			}
		}
		if(status==false)
		{
			System.err.println("No such record found");
		}
	}

	@Override
	public void updateBookDetails(int id) {
		for(Book x: l)
		{
			if(x.getBookid()==id)
			{
				boolean start=true;
				while(start)
				{
					System.out.println("\n > Press a to update bookid \n > Press b to update book title \n > Press c to update book author name \n > Press d to update book genre");
					char ch=sc.next().charAt(0);
					switch(ch)
					{
					case 'a':{
						System.out.println("Enter new book id");
						x.setBookid(sc.nextInt());
						System.out.println("> Enter 1 to return to main menu \n > Enter 2 to exit");
		                if(sc.nextInt()==2)
		                {
		                	start=false;
		                }
					}
					break;
					case 'b':{
						System.out.println("Enter new book title");
						x.setTitle(sc.next());
						System.out.println("> Enter 1 to return to main menu \n > Enter 2 to exit");
		                if(sc.nextInt()==2)
		                {
		                	start=false;
		                }
					}
					break;
					case 'c':{
						System.out.println("Enter new Author name");
						x.setAuthorName(sc.next());
						System.out.println("> Enter 1 to return to main menu \n > Enter 2 to exit");
		                if(sc.nextInt()==2)
		                {
		                	start=false;
		                }
					}
					break;
					case 'd':{

						System.out.println("Enter new book Genre");
		                x.setGenre(sc.nextLine());
		                System.out.println("> Enter 1 to return to main menu \n > Enter 2 to exit");
		                if(sc.nextInt()==2)
		                {
		                	start=false;
		                }
					}
					
					}
				}
				
				
			}
		}
		
	}

	@Override
	public void bookSummary() {
		for(Book x: l)
		{
			System.out.println(x.getBookid());
			System.out.println(x.getTitle());
			System.out.println(x.getAuthorName());
			System.out.println("-----------------------------------");
		}
		
	}

}
