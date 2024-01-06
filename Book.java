package libraryManagementSystem;

public class Book {
	
		private String title;
		private int id;
		private int cost;
		private String Author;
		private int noOfPage;
	 public Book()
	 {
		 
	 }
	public Book(String title, int id, int cost, String author, int noOfPage) {
		
		this.title = title;
		this.id = id;
		this.cost = cost;
		Author = author;
		this.noOfPage = noOfPage;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getNoOfPage() {
		return noOfPage;
	}
	public void setNoOfPage(int noOfPage) {
		this.noOfPage = noOfPage;
	}
	 public void bookDetails()
	 {
		 System.out.println("title of the Book:"+getTitle());
		 System.out.println("id of the Book:"+getId());
		 System.out.println("cost of the Book:"+getCost());
		 System.out.println("author of the Book:"+getAuthor());
		 System.out.println("NoOfPage in the Book:"+getNoOfPage());
	 }
	@Override
	public String toString() {
		return "Book [title=" + title + ", id=" + id + ", cost=" + cost + ", Author=" + Author + ", noOfPage=" + noOfPage
				+"]";
	}
	}


