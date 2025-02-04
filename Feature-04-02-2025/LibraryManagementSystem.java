class LibraryManagementSystem{
	public static void main(String[]args){
		Book book = new Book("HC Verma","Physics Everywhere",11000215);
		book.displayDetails(book);
		Book.displayLibraryName();
	}
}
class Book{
	private static String libraryName = "ABC Library";
	private String author, title;
	private final int isbn;
	Book(String author, String title, int isbn){
		this.author = author;
		this.title = title;
		this.isbn = isbn;
	}
	public void displayDetails(Book book){
		if(book instanceof Book){
			System.out.println("Author of Book is: "+author);
			System.out.println("Title of Book is: "+title);
			System.out.println("ISBN Number of Book is: "+isbn);
		}
	}
	public static void displayLibraryName(){
		System.out.println("Name of Library is: "+libraryName);
	}
}