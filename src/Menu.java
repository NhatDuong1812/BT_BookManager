import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public Book add(List<Book> bookList){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter publishDate:");
        String publishDate = sc.nextLine();
        System.out.println("Enter author:");
        String author = sc.nextLine();
        System.out.println("Enter language:");
        String language = sc.nextLine();
        System.out.println("Enter tbPrice:");
        float tbPrice = Float.parseFloat(sc.nextLine());
        Book book = new Book(id, name, publishDate, author, language, tbPrice);
        return book;
    }
}
