package week4.try_catch.src;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Program başladı!");
        Scanner inp = new Scanner(System.in);

        int a = 1;
        int b = 20;
        int c;

        try {
            System.out.println("Bölme işlemi");
            System.out.println(b / a);
            System.out.println("Bölme işlemi bitti");
            c = inp.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bu kod bloğu kesinlikle çalışacak");
        }

        System.out.println("Program bitti!");

    }
}