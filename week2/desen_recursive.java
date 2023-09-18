package week2;

import java.util.Scanner;

public class desen_recursive {
    static void pozitif(int sayi, int temp) {
        if (sayi > 0) {
            System.out.print(sayi + " ");
            pozitif(sayi-5,temp);
        } else if (sayi <= 0) {
            negatif(sayi,temp);
        }
    }

    static void negatif(int sayi, int temp) {
        if (temp >= sayi) {
            System.out.print(sayi + " ");
            negatif(sayi+5, temp);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = inp.nextInt();
        int temp;
        temp = sayi;
        pozitif(sayi,temp);

    }
}
