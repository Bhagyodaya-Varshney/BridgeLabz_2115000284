public class LibraryManagementSystem {
    public static void main(String[] args) {
		
        Book book = new Book("Physics Everywhere", "HC VERMA", "Physics", 101012, true);
        book = Book.addBookAtEnd("Chemistry EveryWhere", "RK Gupta", "Chemistry", 102000, false, book);
        book = Book.addBookAtEnd("MathMatics Full Of Numbers", "KM Agrawal", "Mathmatics", 102001, true, book);
		
		System.out.println("Forward:");
        Book.displayBooksForward(book);
		System.out.println("Backward:");
        Book.displayBooksReverse(book);
		
		Book.removeBook(102000,book);
		
		Book.displayBooksForward(book);
    }
}

class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    Book next;
    Book prev;

    public Book(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }

    public static Book addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable, Book book) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (book != null) {
            newBook.next = book;
            book.prev = newBook;
        }
        return newBook;
    }

    public static Book addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable, Book book) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (book == null) {
            return newBook;
        }
        Book temp = book;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newBook;
        newBook.prev = temp;
        return book;
    }

    public static Book removeBook(int bookId, Book book) {
        if (book == null) {
            return null;
        }
        if (book.bookId == bookId) {
            book = book.next;
            if (book != null) {
                book.prev = null;
            }
            return book;
        }
        Book temp = book;
        while (temp.next != null && temp.next.bookId != bookId) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            if (temp.next != null) {
                temp.next.prev = temp;
            }
        }
        return book;
    }

    public static void searchBookByTitle(String title, Book book) {
        while (book != null) {
            if (book.title.equals(title)) {
                System.out.println("Book Title: "+book.title);
				System.out.println("Book Author: " + book.author);
				System.out.println("Book Genre: " + book.genre);
				System.out.println("Book Available: " + book.isAvailable);
                return;
            }
            book = book.next;
        }
        System.out.println("Book not found.");
    }

    public static void updateAvailability(int bookId, Book book, boolean status) {
        while (book != null) {
            if (book.bookId == bookId) {
                book.isAvailable = status;
                System.out.println("Availability Updated.");
                return;
            }
            book = book.next;
        }
        System.out.println("Book not found.");
    }

    public static void displayBooksForward(Book book) {
        while (book != null) {
            System.out.println("Book Title: "+book.title);
            System.out.println("Book Author: " + book.author);
            System.out.println("Book Genre: " + book.genre);
            System.out.println("Book Available: " + book.isAvailable);
            System.out.println();
            book = book.next;
        }
    }

    public static void displayBooksReverse(Book book) {
        if (book == null) return;
        Book temp = book;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
			System.out.println("Book Title: "+temp.title);
            System.out.println("Book Author: " + temp.author);
            System.out.println("Book Genre: " + temp.genre);
            System.out.println("Book Available: " + temp.isAvailable);  
			System.out.println();
			temp = temp.prev;
        }
    }
}