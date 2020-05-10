public class FictionBook extends Book {
    private String category;// theloai

    public FictionBook() {
    }

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(int bookID, int price, String name, String author, String category) {
        super(bookID, price, name, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "A book, There are name: " + super.getName() + ", Price: " + super.getPrice() + " and Category: " + getCategory();
    }
}
