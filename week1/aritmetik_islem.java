package week1;
import java.util.Scanner;

public class aritmetik_islem {
    public static void main(String[] args) {



        // Kullanıcıdan sayıları alıyoruz.
        int n1, n2, n3;
        Scanner inp = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz : ");
        n1 = inp.nextInt();
        System.out.print("2. Sayıyı giriniz : ");
        n2 = inp.nextInt();
        System.out.print("3. Sayıyı giriniz : ");
        n3 = inp.nextInt();

        // İşlem sırası şöyle olsun: a+b*c-b. İşlem tamamladıktan sonra sonucu ekrana yazdırın.

        int result = n1 +n2 * n3 -n2;
        System.out.println("Cevap : " + result);

    }
}
