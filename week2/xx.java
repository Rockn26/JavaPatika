package week2;


import java.util.Random;
import java.util.Scanner;

public class xx {

    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner inp = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWrong = false;

        while (right < 5) {
            System.out.println(number);
            System.out.print("Tahmin ettiğiniz sayıyı giriniz : ");
            selected = inp.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Girdiğiniz sayı 0 ile 100 arasında olmalıdır!");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = false;
                    System.out.println("Bir sonraki hatalı girişinizde hakkınız düşecek.");
                }
                continue;

            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin!");
                break;

            } else {
                right++;
                System.out.println("Yanlış bir sayı girdiniz.");
                if (selected > number) {
                    System.out.println("Girdiğiniz sayı gizli sayıdan büyük! ");
                } else {
                    System.out.println("Girdiğiniz saıy gizli sayıdan küçük!");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkınız : " + (5 - right));
            }


        }
    }

}
