package week2;

import java.util.Scanner;

public class hesap_makinasıi {

    static int plus(int n1, int n2) {
        int result = n1 + n2;
        System.out.println("Toplam :" + result);
        return result;
    }

    static int minus(int n1, int n2) {
        int result = n1 - n2;
        System.out.println("Çıkarma :" + result);
        return result;
    }


    static int times(int n1, int n2) {
        int result = n1 * n2;
        System.out.print("Çarpma : " + result);
        return result;
    }

    static int diveded(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("İkinci sayı bu işlem için 0 olamaz.");
            return 0;
        }
        int result = n1 / n2;
        System.out.println("Bölme : " + result);
        return result;
    }

    static int power(int n1, int n2){
        int result = 1;
        for (int i = 1; i <= n2; i++) {
            result*=n1;
        }
        System.out.println("Üs alma :" + result);

        return  result;
    }

    static int mod(int n1, int n2) {
        int result = n1 % n2;
        System.out.println("Mod alma : " + result);
        return result;
    }

   static void alanCevre(int n1, int n2) {
       System.out.println("Çevresi : " + (2*(n1+n2)));
       System.out.println("Alanı :" + n1*n2);
   }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;

        String menu = "1-Toplama\n" +
                "2-Çıkarma\n" +
                "3-Çarpma\n" +
                "4-Bölme\n" +
                "5-Üs alma\n" +
                "6-Mod alma\n" +
                "7-Dikdörtgen çevre\n" +
                "0- Çıkış yap";


        while (true) {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz : ");
            select = inp.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("Birinci sayıyı giriniz : ");
            int n1 = inp.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            int n2 = inp.nextInt();

            switch (select) {
                case 1:
                    plus(n1, n2);
                    break;
                case 2:
                    minus(n1, n2);
                    break;
                case 3:
                    times(n1, n2);
                    break;
                case 4:
                    diveded(n1, n2);
                    break;
                case 5:
                    power(n1,n2);
                    break;
                case 6:
                    mod(n1,n2);
                    break;
                case 7:
                    alanCevre(n1,n2);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem yaptınız.");
                    break;
            }
        }
        System.out.println("Güle güle");

    }
}
