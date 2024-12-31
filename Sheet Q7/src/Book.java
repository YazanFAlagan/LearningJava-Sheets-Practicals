public class Book {
    private String title;
    private String author;
    private double price;

    // Default
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0;
    }

    // Title & Author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Title, Author & Price
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printBookDetails() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Book Author: " + this.author);
        System.out.println("Book Price: " + this.price + " EGP");
    }
}
