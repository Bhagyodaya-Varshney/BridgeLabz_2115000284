public class Book{
    private String title, author;
    private double price;
	public Book(){
		this.title = "Physics EveryWhere";
		this.author = "HC Verma";
		this.price = 1900.0;
	}
	public Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void setDetails(String title,String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
        return title;
    }
	public String getAuthor() {
        return author;
    }
	public double getPrice() {
        return price;
    }
	public static void main(String[]args){
		Book book1 = new Book();
		System.out.println("Book 1: " + book1.getTitle() + ", " + book1.getAuthor() + book1.getPrice()+"Rs.");
		Book book2 = new Book("Chemistry EveryWhere", "AP Sharma", 2000.0);
		System.out.println("Book 2: " + book2.getTitle() + ", " + book2.getAuthor() + book2.getPrice()+"Rs.");
		book2.setDetails("Mathmatics EveryWhere", "RD Sharma", 2500.0);
		System.out.println("Book 2: " + book2.getTitle() + ", " + book2.getAuthor() + book2.getPrice()+"Rs.");

	}
}