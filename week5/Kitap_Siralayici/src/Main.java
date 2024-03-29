package week5.Kitap_Siralayici.src;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // ilk sıralamamızı books da yaptık.
        TreeSet<Book> books = new TreeSet<>();

        Book b1 = new Book("Philosopher's Stone", "J.K. Rowling", "1997", 223);
        Book b2 = new Book("Chamber of Screts", "J.K. Rowling", "1998", 251);
        Book b3 = new Book("Prisoner of Azkaban", "J.K. Rowling", "1999", 317);
        Book b4 = new Book("Goblet of Fire", "J.K. Rowling", "2000", 636);
        Book b5 = new Book("Order of the Phoenix", "J.K. Rowling", "2003", 766);

        // ekleme işlemleri
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        // bastırma işlemleri
        for (Book book : books) {
            System.out.println("Book name : " + book.getName() +
                    "\nAuthor name : " + book.getAuthorName() +
                    "\nPublication date : " + book.getrDate() +
                    "\nPage number : " + book.getPageN());
            System.out.println("======================================");
        }
        System.out.println();


        // sayfa no ya göre sıralamayı bu sınıftan yapıyoruz :  OrderNumberComparator
        TreeSet<Book> books2 = new TreeSet<>(new OrderNumberComparator());

        books2.add(b1);
        books2.add(b2);
        books2.add(b3);
        books2.add(b4);
        books2.add(b5);

        for (Book book : books2) {
            System.out.println("Book name : " + book.getName() +
                    "\nAuthor name : " + book.getAuthorName() +
                    "\nPublication date : " + book.getrDate() +
                    "\nPage number : " + book.getPageN());
            System.out.println("======================================");
        }
        System.out.println();

    }
}