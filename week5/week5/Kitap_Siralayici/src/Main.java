package week5.week5.Kitap_Siralayici.src;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>();

        Book b1 = new Book("Philosopher's Stone", "J.K. Rowling", "1997", 223);
        Book b2 = new Book("Chamber of Screts", "J.K. Rowling", "1998", 251);
        Book b3 = new Book("Prisoner of Azkaban", "J.K. Rowling", "1999", 317);
        Book b4 = new Book("Goblet of Fire", "J.K. Rowling", "2000", 636);
        Book b5 = new Book("Order of the Phoenix", "J.K. Rowling", "2003", 766);

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        for (Book book : books) {
            System.out.println("Book name : " + book.getName() +
                    "\nAuthor name : " + book.getAuthorName() +
                    "\nPublication date : " + book.getrDate() +
                    "\nPage number : " + book.getPageN());
            System.out.println("======================================");
        }
        System.out.println();

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