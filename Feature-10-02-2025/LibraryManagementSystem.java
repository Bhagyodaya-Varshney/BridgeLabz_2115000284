import java.util.*;

class LibraryManagementSystem {
    public static void main(String[] args) {
        List<Reservable> reservableItems = new ArrayList<>();

        Book book = new Book(10101, "Physics", "HC VERMA");
        Magazine magazine = new Magazine(20022, "AI is Monster", "John Byden");
        DVD dvd = new DVD(300333, "Shaktiman", "RP Singh");

        reservableItems.add(book);
        reservableItems.add(magazine);
        reservableItems.add(dvd);

        for (Reservable item : reservableItems) {
            LibraryItem libItem = (LibraryItem) item;
            libItem.getItemDetails();
            System.out.println("Loan Time: " + libItem.getLoanDuration() + " days");
            System.out.println("Availability: " + (item.checkAvailability() ? "Available" : "Not Available"));
            System.out.println(item.reserveItem());
            System.out.println();
        }
    }
}

// Abstract class for Library Items
abstract class LibraryItem {
    private int itemId;
    private String title, author;

    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Book extends LibraryItem implements Reservable {
    private boolean isReserved;

    Book(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    int getLoanDuration() {
        return 10;
    }

    @Override
    public String reserveItem() {
        if (!isReserved) {
            isReserved = true;
            return "Book Reserved successfully!";
        }
        return "Book is Already Reserved.";
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved;

    Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    int getLoanDuration() {
        return 10;
    }

    @Override
    public String reserveItem() {
        if (!isReserved) {
            isReserved = true;
            return "Magazine Reserved successfully!";
        }
        return "Magazine is Already Reserved.";
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

    DVD(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    int getLoanDuration() {
        return 5;
    }

    @Override
    public String reserveItem() {
        if (!isReserved) {
            isReserved = true;
            return "DVD Reserved successfully!";
        }
        return "DVD is Already Reserved.";
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

interface Reservable {
    String reserveItem();
    boolean checkAvailability();
}
