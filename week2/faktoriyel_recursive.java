package week2;
import java.util.Scanner;

public class faktoriyel_recursive {
    static int faktoriyel(int sayi) {

        if (sayi !=0) {
            return sayi * faktoriyel(sayi-1);
        } else
            return 1; // 0 faktoriyel 1 e eşit olacaktır.

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = inp.nextInt();

        System.out.println(sayi + " faktöriyel : " + faktoriyel(sayi));



    }
}
