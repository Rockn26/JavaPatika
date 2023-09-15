package java101;
import java.util.Scanner;

public class yildiz_ile_ucgen {
    public static void main(String[] args) {

        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) { // girilen n sayısı kadar satır çıkardık; n =5 => 1-2-3-4-5 örnek olarak gösterdim.
            for (int j = 1; j <= (n-i); j++) { // girilen n-i sayısı kadar boşluk komutu verdik.
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2*i)-1); k++) { // 2i - 1 kadar yıldız bastık.
                System.out.print("*");
            }
            // en son boş bir ln koyuyoruz, bunu yapmazsak yıldızlar alt satıra inmez.
            System.out.println();
        }
    }
}
