package java101;

import java.util.Scanner;

public class hesap_makinesi {
    public static void main(String[] args) {


        int n1, n2, select;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        n1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = inp.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sonuç : " + (n1+n2));
                break;
            case 2:
                System.out.println("Sonuç : " + (n1-n2));
                break;
            case 3:
                System.out.println("Sonuç : " + (n1*n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Bölünen 0 olamaz!");
                } else {
                    System.out.println("Sonuç : " + (n1/n2));
                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız.");
                break;
        }

    }
}
