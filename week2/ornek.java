package week2;

import java.util.Scanner;

public class ornek {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int input = inp.nextInt();
        int sonuc = topla(input);
        System.out.println(sonuc);


    }

    private static int topla(int input) {
        if (input == 1){
            return 1;
        } else {
            return input + topla(input-1);
        }
    }

}