package java101;

import java.util.Scanner;

public class uc_ve_dort_ortalama {
    public static void main(String[] args) {
        int n, ortak=0, toplam=0, ortalama;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = inp.nextInt();

        for (int i = 1; i<=n; i ++) {
            if (i % 3 == 0 && i % 4 == 0) {
                // hem kaç tane ortak var ona bakmak lazım hemde çıkan ortakları toplamak lazım.
                ortak++;
                toplam+=i;
            }
        }

        ortalama = toplam / ortak;
        System.out.println("3 ve 4 e tam bölünen sayıların ortalaması : " + ortalama);

    }

}
