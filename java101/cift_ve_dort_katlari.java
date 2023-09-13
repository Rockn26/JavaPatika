package java101;
import java.util.Scanner;

public class cift_ve_dort_katlari {
    public static void main(String[] args) {

        int n, total=0;
        Scanner inp = new Scanner(System.in);

       do {
           System.out.print("Sayı giriniz : ");
           n = inp.nextInt();
           if (n % 4 == 0) {
               total += n;
           }
       }while (n % 2 == 0);
        System.out.println("Total : " + total);

    }
}
