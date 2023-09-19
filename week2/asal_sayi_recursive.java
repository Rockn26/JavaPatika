package week2;

import java.util.Scanner;

public class asal_sayi_recursive {
    static boolean asalMi(int sayi, int bolen) {
        System.out.println("Sayı " + sayi);
        System.out.println("---------------");
        System.out.println("bolen " + bolen);
        if (sayi < 2) return false;
        if (bolen == 1) return true;
        if (sayi % bolen == 0) return false;

        return asalMi(sayi, bolen - 1);

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = inp.nextInt();

        if (asalMi(sayi, sayi - 1)) {
            System.out.println(sayi + " asaldır.");
        } else {
            System.out.println(sayi + " asal değildir.");


        }
    }

}