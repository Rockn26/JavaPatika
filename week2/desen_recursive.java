package week2;

import java.util.Scanner;

public class desen_recursive {

    static void pattern(int number) {
        // number 0 veya 0 dan küçük hale gelirse number değeri ekrana yazılır ve return işlemiyle fonksiyon sonlanır
        if (number<= 0) {
            System.out.print(number + " ");
            return;
        }
        System.out.print(number + " ");
        pattern(number-5);
        System.out.print(number + " ");

        // başlangıç sayısından başlayacak ve negatif veya 0 olana kadar devam edecek. Ardından kendi sayısına kadar +5
        // eklenecek. 
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int number = inp.nextInt();

        pattern(number);
    }
}
