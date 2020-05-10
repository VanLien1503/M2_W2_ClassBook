public class CountBook {
    public int countBook(Book[]books,String language){
        int countBook=0;
        for (int i=0;i<books.length;i++){

            if (books[i] instanceof ProgrammingBook ){// tai sao can kiem tra dieu kien nay
                ProgrammingBook programmingBook=(ProgrammingBook)books[i];// tai sao phai ef kieu
                if (programmingBook.getLenguage().equals(language)){
                    countBook++;
                }
            }

        }
        return countBook;
    }

}
