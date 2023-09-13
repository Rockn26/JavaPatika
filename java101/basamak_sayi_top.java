package java101;

import java.util.Scanner;

public class basamak_sayi_top {
    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        sayi = inp.nextInt();

        int tempSayi = sayi;
        int total =0;

        // sayıyı mod 10 a bölüyoruz ki rakamları bulalım. Bunu sayı 0 lanana kadar yapacağız.
        // sayıyı temp e atamamızın nedeni sayıyı kaybetmeyelim diye.
        while (tempSayi !=0) {
            total += tempSayi % 10;
            tempSayi /= 10;
        }

        System.out.println("Sayısının basamakları toplamı : " + total);

    }
}
