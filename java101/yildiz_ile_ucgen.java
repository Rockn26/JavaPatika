package java101;
import java.util.Scanner;

public class yildiz_ile_ucgen {
    public static void main(String[] args) {

        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        n = inp.nextInt();

        // burada aşağıya ln komutuyla beraber 6 satır indik.
        for (int i = 1; i <= 6; i++) {
            // burada ln komutunu kaldırdık ve her satıra boşluk ekledik.
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            // burada ln kullanarak satıra yıldızları bastırıyoruz.
            for (int k = 1; k <= ((2*i)-1); k++) {
                System.out.print("*");
            }
            // en son boş bir ln koyuyoruz, bunu yapmazsak yıldızlar alt satıra inmez.
            System.out.println();
        }
    }
}
