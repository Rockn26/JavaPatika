package week1;
import java.util.Scanner;

public class ucak_bileti {
    public static void main(String[] args) {

        int km =0, age=0, tripType=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz : ");
        km = inp.nextInt();
        System.out.print("Yolculuk tipini giriniz.\n1-Gidiş\n2-Gidiş-Dönüş : ");
        tripType = inp.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = inp.nextInt();

        if (km > 0 && age > 0 && (tripType == 1 || tripType == 2)) {
            // çalışacak kod bloğu. Koşullar sağlandı.
            double total = km*0.10;
            double ageDiscount = 0;
            double tripDiscount = 0;


            if (age < 12) {
                ageDiscount = 0.5;
            } else if (age < 24) {
                ageDiscount = 0.1;
            } else if (age > 65) {
                ageDiscount = 0.3;
            }


            total -= total*ageDiscount;

            if (tripType == 2) {
                tripDiscount = 0.2;
                total*=2; // burada yolcu iki tane bilet almış oluyor hem gidiş hem geliş
            }

            total -= total*tripDiscount;
            System.out.println("Toplam tutar : " + total + " Tl");


        } else {
            // koşullar sağlanmadı
            System.out.println("Hatalı veri girdiniz. Tekrar deneyiniz.");


        }
    }
}
