package week2;

import java.util.Scanner;

public class fibo_recursive {
    static int fibo(int n) {
       if (n == 1 || n == 2){
           return 1;
       }
       return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = inp.nextInt();


        System.out.println(fibo(n));
    }
}
