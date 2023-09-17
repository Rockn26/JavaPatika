package week1;
import java.util.Scanner;

public class harmonik_sayilar {
    public static void main(String[] args) {

        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = inp.nextInt();
        double result = 0.0;

        for (double i = 1; i <= n; i++) {
            result += (1/i);
        }

        System.out.println("Sonuç: " + result);

    }
}
