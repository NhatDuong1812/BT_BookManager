import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        do {
            System.out.println("1. Add");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Show");
            System.out.println("5. Tinh Trung binh");
            System.out.print("Your choice: ");
            Scanner sc = new Scanner(System.in);
            Methods mt = new Methods();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    bookList.add(mt.add(bookList));
                    System.out.println("Add complete!!! ");
                    break;
                case 2:
                    System.out.println("Enter id want search: ");
                    int idSearch = Integer.parseInt(sc.nextLine());
                    mt.search(bookList,idSearch);
                    break;
                case 3:
                    System.out.println("Enter if want delete: ");
                    int idDelete = Integer.parseInt(sc.nextLine());
                    mt.delete(bookList,idDelete);
                    System.out.println("Delete complete!!");
                    break;
                case 4:
                    mt.show(bookList);
                    break;
                case 5:
                    System.out.println("Trung binh la: " + mt.tinhTrungBinh(bookList));
                    break;
                default:
                    System.out.println("Loi!!");
            }
        }while (true);
    }
}
