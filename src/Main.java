
class LibraryItem {
    private int id;
    private String title;
    private int year;

    public LibraryItem(int id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}

class Book extends LibraryItem {
    private String author;

    public Book(int id, String title, int year, String author) {
        super(id, title, year);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class Magazine extends LibraryItem {
    private int issue;

    public Magazine(int id, String title, int year, int issue) {
        super(id, title, year);
        this.issue = issue;
    }

    public int getIssue() {
        return issue;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Book and Magazine
        Book book1 = new Book(1, "The Great Gatsby", 1925, "F. Scott Fitzgerald");
        Magazine magazine1 = new Magazine(2, "National Geographic", 2023, 8);

        // Display information about the items
        System.out.println("Book ID: " + book1.getId());
        System.out.println("Book Title: " + book1.getTitle());
        System.out.println("Book Year: " + book1.getYear());
        System.out.println("Book Author: " + book1.getAuthor());

        System.out.println();

        System.out.println("Magazine ID: " + magazine1.getId());
        System.out.println("Magazine Title: " + magazine1.getTitle());
        System.out.println("Magazine Year: " + magazine1.getYear());
        System.out.println("Magazine Issue: " + magazine1.getIssue());
    }
}