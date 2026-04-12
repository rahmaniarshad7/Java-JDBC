package OOPs;

// Abstract class
abstract class LibraryItem {
    protected String title;
    protected String author;
    protected boolean isAvailable;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public abstract void issueItem();
    public abstract void returnItem();

    public void showDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
}

// Book class
class Book extends LibraryItem {
    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    public void issueItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book issued: " + title);
        } else {
            System.out.println("Book not available!");
        }
    }

    @Override
    public void returnItem() {
        isAvailable = true;
        System.out.println("Book returned: " + title);
    }
}

// Magazine class
class Magazine extends LibraryItem {
    public Magazine(String title, String author) {
        super(title, author);
    }

    @Override
    public void issueItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Magazine issued: " + title);
        } else {
            System.out.println("Magazine not available!");
        }
    }

    @Override
    public void returnItem() {
        isAvailable = true;
        System.out.println("Magazine returned: " + title);
    }
}

// Main Application
public class LibraryApp {
    public static void main(String[] args) {
        LibraryItem book1 = new Book("Java Basics", "James Gosling");
        LibraryItem mag1 = new Magazine("Tech Monthly", "Editorial Team");

        book1.showDetails();
        book1.issueItem();
        book1.showDetails();
        book1.returnItem();
        book1.showDetails();

        mag1.showDetails();
        mag1.issueItem();
        mag1.showDetails();
    }
}

