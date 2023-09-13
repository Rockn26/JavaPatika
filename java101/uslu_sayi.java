package java101;
import java.util.Scanner;

public class uslu_sayi {
    public static void main(String[] args) {
        int sayi, us, total = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        sayi = inp.nextInt();
        System.out.print("Üs olacak sayı : ");
        us = inp.nextInt();

        for (int i = 1; i<=us; i++) {
            total*=sayi;
        }
        System.out.println("Sonuç : " + total);

    }
}
