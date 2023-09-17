package week1;

import java.util.Scanner;

public class artik_yil {
    public static void main(String[] args) {
        int year;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl giriniz : ");
        year = inp.nextInt();


        // Burada ilk koşulumuz 4 e bölümünden kalanın 0 olması ve 100 e bölümünden kalanın 0 a eşit olmaması
        // 100 e bölümünden kalan 0 olursa  1700 , 1800 gibi sayıları da  doğru kabul etmiş olurduk.
        // Fakat bize 100 ün katlarından 400 e bölümünden kalan 0 olan sayılar lazım.

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " bir artık yıldır!");
        }else {
            System.out.println(year + " bir artık yıl değildir!");
        }




        }
    }
