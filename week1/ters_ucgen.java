package week1;
import java.util.Scanner;

public class ters_ucgen {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        n = inp.nextInt();


        for (int i = n; i>= n; i--) { // burada n sayısı kadar satır indik. Örn: n = 5 ; 5-4-3-2-1
            for (int k = 1; k <= n - i; k++) { // burada n sayısının 1 eksiği kadar boşluk komutu verdik.
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++){ // burada 2n*1 -1 kadar yıldız bıraktık.
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
