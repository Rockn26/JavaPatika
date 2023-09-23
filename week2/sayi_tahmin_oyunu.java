package week2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sayi_tahmin_oyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner inp = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        System.out.println(number);

        while (right < 5) {
            System.out.print("Tahmininizi giriniz : ");
            selected = inp.nextInt();

            if (selected < 0 || selected > 100) {
                System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz ");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5-right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı giriş yaparsanız hakkınızdan düşecektir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin! ");
                break;
            } else {
                System.out.println("Yanlış tercih yaptınız ");
                if (selected > number) {
                    System.out.println("Tahmin ettiğin sayı gizli sayıdan büyük.");
                } else {
                    System.out.println("Tahmin ettiğin sayı gizli sayıdan küçük.");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hakkı : " + (5-right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz !");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }


    }
}
