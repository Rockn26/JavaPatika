package week5.week5.Kitap_Siralayici.src;

public class Book implements Comparable<Book>{

    String name;
    String authorName;
    String rDate;
    int pageN;


    public Book(String name, String authorName, String rDate, int pageN) {
        this.name = name;
        this.authorName = authorName;
        this.rDate = rDate;
        this.pageN = pageN;
    }


    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getrDate() {
        return rDate;
    }

    public int getPageN() {
        return pageN;
    }

    @Override
    public int compareTo(Book o) {
        return getName().compareTo(o.getName());
    }
}
