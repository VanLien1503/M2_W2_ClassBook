
public class ProgrammingBook extends Book {
    private String lenguage;
    private String fameWork;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String lenguage, String fameWork) {
        this.lenguage = lenguage;
        this.fameWork = fameWork;
    }

    public ProgrammingBook(int bookID, int price, String name, String author, String lenguage, String fameWork) {
        super(bookID, price, name, author);
        this.lenguage = lenguage;
        this.fameWork = fameWork;
    }

    public String getLenguage() {
        return lenguage;
    }

    public void setLenguage(String lenguage) {
        this.lenguage = lenguage;
    }

    public String getFameWork() {
        return fameWork;
    }

    public void setFameWork(String fameWork) {
        this.fameWork = fameWork;
    }
    @Override
    public String toString(){
        return super.toString()+", Language: "+getLenguage()+" and Framework: "+getFameWork();
    }
}
