import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrObjectBook arrObjectBook = new ArrObjectBook();
        CountBook countBook = new CountBook();
        System.out.println("Nhap sack muon tim kiem");
        System.out.println(countBook.countBook(arrObjectBook.getArrayBook(), scanner.next()));

    }
}
