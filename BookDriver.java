package libraryManagementSystem;
import java.util.Scanner;
public class BookDriver {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Library l=new Library();
		boolean start=true;
		while(start)
		{
			System.out.println("Enter the Choice:\n 1.Add Book \n 2.Display Book \n 3.find Book \n 4.Borrow Book \n 5.Return Book \n 6.exit");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println("Enter the Book Title");
			String title = sc.next();
			System.out.println("Enter the Book Id");
			int id=sc.nextInt();
			System.out.println("Enter the Book Cost");
			int cost=sc.nextInt();
			System.out.println("Enter the Book Author");
			String author = sc.next();
			System.out.println("Enter the NoOfPages");
			int noOfPages =sc.nextInt();
			l.add(new Book(title,id,cost,author,noOfPages));
		}
		break;
		case 2:
		{
			l.displayBook();
		}
		break;
		case 3:
		{
			System.out.println("Enter the Book Id");
			int bookId=sc.nextInt();
			l.findBook(bookId);
		}
		break;
		case 4:
		{
			System.out.println("Enter the Book Id");
			int bookId=sc.nextInt();
			l.borrowBook(bookId);
		}
		break;
		case 5:
		{
			System.out.println("Enter the Book Title ");
			String title = sc.next();
			System.out.println("Enter the Book Id");
			int id=sc.nextInt();
			System.out.println("Enter the Book Cost");
			int cost=sc.nextInt();
			System.out.println("Enter the Book Author");
			String author = sc.next();
			System.out.println("Enter the NoOfPages");
			int noOfPages =sc.nextInt();
			l.returnBook(new Book(title,id,cost,author,noOfPages));
		}
		break;
		case 6:
		{
			start = false;
			System.out.println("Thank you................");
		}
		break;
		default:System.out.println("Enter valid Choice");
		}
		}
	}
	}

