package week2;

import java.util.Scanner;

public class asal_sayi_recursive {
    static boolean asalMi(int sayi, int bolen){


        if (sayi <= 2) {
            return sayi == 2;
        }

        if (sayi % bolen == 0) {
            return false;
        }
        if (bolen * bolen > sayi) {
            return true;
        }
        return asalMi(sayi, bolen+1);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = inp.nextInt();

        if (asalMi(sayi,2)){
            System.out.println(sayi + " asal sayıdır.");
        } else {
            System.out.println(sayi + " asal sayı değildir.");
        }
    }
}
