package java101;
import java.util.Scanner;

public class mukemmel_sayi {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = inp.nextInt();
        int total=0;

        // ilk koşulumuz 0 dan büyük olmasıydı. Pozitif bölenlerle ilgileniyoruz.
        // İf koşulunun içinde yapacağız işlemlerimiz.
        if (n > 0) {
            //  girdiğimiz değerin bir eksiği kadar dönmesini istedik. Bu sebeple pozitif bölenlerinden
            //  kendisini almayacak.
            for (int i = 1; i <= n-1; i++) {
                if (n % i == 0) {
                    total+=i;
                }
            }
        } else {
            System.out.println("Sadece pozitif tam sayılar için!");
        }

        if (total == n) {
            System.out.println(total + " Mükkemmel sayıdır.");
        } else {
            System.out.println(total + " Mükkemmel sayı değildir.");
        }


    }
}
