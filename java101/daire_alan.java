package java101;
import java.util.Scanner;

public class daire_alan {
    public static void main(String[] args) {

        double pi = 3.14, r, a, alan;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz : ");
        r = inp.nextInt();

        System.out.print("Merkez açısının ölçüsünü giriniz : ");
        a = inp.nextInt();


        alan =((pi*(r*r)*a)/360);


        System.out.println("Daire diliminin alanı : " + alan);



    }
}
