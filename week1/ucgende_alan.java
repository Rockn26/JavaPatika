package week1;
import java.util.Scanner;
import java.lang.Math;

public class ucgende_alan {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double cevre,a,b,c, u, alan;

        System.out.print("Birinci kenar uzunluğunu giriniz : ");
        a = inp.nextInt();
        System.out.print("İkinci kenar uzunluğunu giriniz : ");
        b = inp.nextInt();
        System.out.print("Üçüncü kenar uzunluğunu giriniz : ");
        c = inp.nextInt();

        u = (a+b+c) / 2;
        cevre = 2*u;
        alan = Math.sqrt((u*(u-a)*(u-b)*(u-c)));

        System.out.println("Üçgenin çevresi : " + cevre);
        System.out.println("Üçgenin alanı : " + alan);


    }

}
