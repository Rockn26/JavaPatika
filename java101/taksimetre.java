package java101;
import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int km;
        double perKm = 2.20, total,  open = 10;

        System.out.print("Gideceğiniz mesafeyi km cinsinden giriniz : ");
        km = inp.nextInt();

        total = km*perKm;

        // tutarı 0 olarak alırsak ona 10 tl açılış ücreti eklememiz gerekiyor.
        total += open;

        // total 20 den küçükse 20 gelsin değilse total in kendisi gelebilir.
        total = (total<20) ? 20 : total;

        System.out.println("Ödeyeceğiniz tutar : " + total + " Tl");

    }
}
