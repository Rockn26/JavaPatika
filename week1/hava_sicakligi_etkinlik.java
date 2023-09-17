package week1;
import java.util.Scanner;

public class hava_sicakligi_etkinlik {
    public static void main(String[] args) {

        int heat;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz : ");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsin");
        } else if (heat <=25) {
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsin.");
            } if (heat >= 15) {
                System.out.println("Pikniğe gidebilirsin.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsin.");
        }


    }
}
