package week1;

import java.util.Scanner;

public class sinif_gecme {
    public static void main(String[] args) {
        double mat, fizik, turkce, kimya, muzik;
        double ortalama = 0, sayac = 0, sonuc=0;


        Scanner inp = new Scanner(System.in);
        System.out.print("Mat notunu giriniz : ");

        // if koşullu ifadesini oluşturdum ve koşula uyuyorsa her seferinde sonucu ortalamaya ekledim ve sayacı 1 arttırdım.
        // sayacı 1 arttırmamın nedeni eğer koşula uymuyorsa bölümü 1 azaltmak için

        mat = inp.nextDouble();
        if (mat>=0 && mat<=100) {
            ortalama+=mat;
            ++sayac;
        }

        System.out.print("Fizik notunu giriniz : ");
        fizik = inp.nextDouble();
        if (fizik>=0 && fizik<=100) {
            ortalama+=fizik;
            ++sayac;
        }

        System.out.print("Türkçe notunu giriniz : ");
        turkce = inp.nextDouble();
        if (turkce>=0 && turkce<=100) {
            ortalama += turkce;
            ++sayac;
        }

        System.out.print("Kimya notunu giriniz : ");
        kimya = inp.nextDouble();
        if (kimya>=0 && kimya<=100) {
            ortalama += kimya;
            ++sayac;
        }

        System.out.print("Müzik notunu giriniz : ");
        muzik = inp.nextDouble();
        if (muzik>=0 && muzik<=100) {
            ortalama+=muzik;
            ++sayac;
        }

        sonuc = ortalama/sayac;



        if (sonuc > 55) System.out.println("Başarıyla geçtiniz! ");
        else System.out.println("Dönem tekrarı");

        System.out.println("Ortalamanız : " + sonuc);


    }
}
