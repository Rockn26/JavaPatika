package week2;
import java.util.Scanner;

public class uslu_sayi_recursive {
    static int usluSayi() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int tabanSayisi = inp.nextInt();
        System.out.print("Üs değerini girniz : ");
        int usSayisi = inp.nextInt();

        int result = 1;

        for (int i = 1; i <= usSayisi; i++) {

            result *= tabanSayisi;
        }

        return result;


    }
    public static void main(String[] args) {
        System.out.println("Sonuç : " + usluSayi());

    }
}
