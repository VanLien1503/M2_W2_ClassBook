public class Book {
    private int bookID;
    private int price; // gia
    private String name;
    private String author;// tac gia

    public Book() {
    }
    public Book(int bookID, int price, String name, String author) {
        this.bookID = bookID;
        this.price = price;
        this.name = name;
        this.author = author;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "A book, There are code: " + getBookID() + ", Name: " + getName() +
                ", Price: " + getPrice() + ", Author: " + getAuthor();
    }
}
