package week1.day2;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Library l1=new Library();
l1.addBook("JAva");
l1.issueBook();
	}

	public String addBook(String bookTitle)
	{
		System.out.println("Book Added Successfully");
		return bookTitle;
	}
	public void issueBook()
	{
		System.out.println("Book Issued Successfully");
	}
}
