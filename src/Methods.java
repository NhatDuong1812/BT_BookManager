import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {

    static List<Book> bookList = new ArrayList<>();

    public void add(Book book){
        bookList.add(book);
    }

    public void show(){
        for (Book book: bookList
             ) {
            book.display();
        }
    }

    public void delete(int idDelete){
        for (Book b : bookList){
            if (idDelete == b.id){
                bookList.remove(b);
                System.out.println("!!Delete complete!!");
                break;
            }
        }
    }
    public boolean search(int idSearch){
//        Book book = new Book();
        for (Book book:bookList
             ) {
            if (idSearch == book.id){
//                book = b;
                book.display();
            }
        }
        return true;
    }

    public float tinhTrungBinh(){
        float sum = 0;
        float i = 0;
        for (Book b: bookList
             ) {
           sum= (i += b.tbPrice )/bookList.size();
        }
        return sum;
    }
}
