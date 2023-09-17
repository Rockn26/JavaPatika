package week1;

import java.util.Scanner;

public class hacker_rank {
    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz : ");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int i = 1; i<=10; i++) {
            int result = i*n;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
