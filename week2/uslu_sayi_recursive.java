package week2;
import java.util.Scanner;

public class uslu_sayi_recursive {
    static int usHesabı(int tabanSayisi, int usSayisi) {
        if (usSayisi == 0) {
            return 1;
        } else {
            return tabanSayisi * usHesabı(tabanSayisi, usSayisi-1);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int tabanSayisi = inp.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int usSayisi = inp.nextInt();

        System.out.println("Sonuç : " + usHesabı(tabanSayisi,usSayisi));


    }


}
