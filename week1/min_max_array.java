package week1;
import java.util.Scanner;

public class min_max_array {
    public static void main(String[] args) {


        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = inp.nextInt();

        if (n > 0 ) {

            int[] sayilar = new int[n];


            for (int i = 1; i<=n; i++) {
                System.out.print(i + " . sayıyı giriniz : ");
                sayilar[i - 1] = inp.nextInt();
            }
            System.out.println("En büyük sayı : " + sayilar[n-1]);
            System.out.println("En küçük sayı : " + sayilar[0]);


        } else  {
            System.out.println("Hatalı veri girişi.");

        }

    }
}
