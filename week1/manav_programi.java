package week1;
import java.util.Scanner;

public class manav_programi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, total =0.0;

        System.out.print("Armutun kilosu : ");
        double armutK = inp.nextDouble();



        System.out.print("Elmanın kilosu : ");
        double elmaK = inp.nextDouble();


        System.out.print("Domatesin kilosu : ");
        double domatK = inp.nextDouble();


        System.out.print("Muzun kilosu : ");
        double muzK = inp.nextDouble();


        System.out.print("Patlıcanın kilosu : ");
        double patlK = inp.nextDouble();

        total += (armutK * armut);
        total += (elmaK * elma);
        total += (domatK * domates);
        total += (muzK * muz);
        total += (patlK * patlican);

        System.out.println("Toplam Tutar : " + total + " Tl");



    }
}
