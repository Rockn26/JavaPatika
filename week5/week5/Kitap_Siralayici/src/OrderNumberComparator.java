package week5.week5.Kitap_Siralayici.src;

import java.util.Comparator;

public class OrderNumberComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPageN() - o2.getPageN();
    }
}
