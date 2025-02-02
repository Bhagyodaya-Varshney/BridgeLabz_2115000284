public class Book1{
    private String title, author;
    private double price;
	private boolean availability;

	public Book1(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = true;
	}
	public String BorrowBook(){
		if(availability){
			availability = false;
			return "Your Book is Issued Successfully";
		}
		else{
			return "Sorry! We Can't Issue the Mentioned Book"; 
		}
	}
	public String returnBook(){
		availability = true;
		return "Your Book is Returned Successfully";
	}
	public static void main(String[]args){
		Book1 book = new Book1("Physics EveryWhere","HC VERMA",1900.0);
		
		System.out.println(book.BorrowBook());
		System.out.println(book.BorrowBook());
		System.out.println(book.returnBook());
		System.out.println(book.BorrowBook());

	}
}