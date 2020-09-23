import java.util.List;
import java.util.Scanner;

public class Methods {

    int[] priceList = new int[5];

    public Book add(List<Book> bookList) {
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

    public void show(List<Book> bookList) {
        for (Book b : bookList
        ) {
            b.display();
        }
    }

    public void delete(List<Book> bookList, int idDelete) {
        for (Book b : bookList) {
            if (idDelete == b.id) {
                bookList.remove(b);
                break;
            }
        }
    }

    public Book search(List<Book> bookList, int idSearch) {
        Book book = new Book();
        for (Book b : bookList
        ) {
            if (idSearch == b.id) {
                book = b;
            }
        }
        return book;
    }

    public float tinhTrungBinh(List<Book> bookList) {
        float sum = 0;
        float i = 0;
        for (Book b : bookList
        ) {
            sum = (i += b.tbPrice) / bookList.size();
        }
        return sum;
    }
}
