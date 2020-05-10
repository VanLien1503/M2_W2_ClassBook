public class ArrObjectBook {
    public Book[] getArrayBook() {
        Book[] arr = new Book[10];
        arr[1] = new ProgrammingBook(1, 20000, "programmingBook1", "CodeGym", "Java", "SpringMVC");
        arr[0] = new ProgrammingBook(2, 30000, "programmingBook2", "CodeGym", "PHP", "SpringMVC");
        arr[2] = new ProgrammingBook(3, 40000, "programmingBook3", "CodeGym", "Java", "SpringMVC");
        arr[3] = new ProgrammingBook(4, 50000, "programmingBook4", "CodeGym", "C++", "SpringMVC");
        arr[4] = new ProgrammingBook(5, 60000, "programmingBook5", "CodeGym", "Java", "SpringMVC");

        arr[5] = new FictionBook(11, 220000, "fictionBook1", "Codegym", "ABC");
        arr[6] = new FictionBook(12, 230000, "fictionBook2", "Codegym", "ABC");
        arr[7] = new FictionBook(13, 240000, "fictionBook3", "Codegym", "ABC");
        arr[8] = new FictionBook(14, 250000, "fictionBook4", "Codegym", "XYZ");
        arr[9] = new FictionBook(15, 260000, "fictionBook5", "Codegym", "XYZ");
        return arr;

    }

}
