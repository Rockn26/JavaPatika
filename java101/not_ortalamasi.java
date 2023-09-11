package java101;
import java.util.Scanner;
public class not_ortalamasi {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunu giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunu giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunu giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunu giriniz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunu giriniz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        int ortalama = toplam / 6;

        System.out.println("Not ortalamanız : " + ortalama);

        System.out.println((ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı");


    }
}
