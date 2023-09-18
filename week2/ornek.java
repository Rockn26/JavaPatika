package week2;

import java.util.Scanner;

public class ornek {

    static boolean asalMi() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = inp.nextInt();
        boolean durum = true;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                durum = false;
                break;
            }
        }
        return durum;
    }

    public static void main(String[] args) {
        boolean durum = asalMi();
        if (durum == true) {
            System.out.println("Sayı asaldır.");
        } else {
            System.out.println("Sayı asal değildir");
        }
    }

}