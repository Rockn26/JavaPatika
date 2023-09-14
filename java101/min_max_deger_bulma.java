package java101;

import java.util.Scanner;

public class min_max_deger_bulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = inp.nextInt();
        int max =0, min = 0, sayi;


        // burada kullanıcıdan kaç sayı girdisi alacağımızı hesapladık.
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " . sayıyı giriniz : ");
            sayi = inp.nextInt();

            // i değerine 1 vermezsem eğer min değeri her seferinde 0 çıkıypr.
            if (i == 1) {
                max = sayi;
                min = sayi;
            }

            if (sayi > max) {
                max = sayi;
            }
            if (sayi < min) {
                min = sayi;
            }
        }

        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
}