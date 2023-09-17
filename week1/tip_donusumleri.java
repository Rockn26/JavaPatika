package week1;
import java.util.Scanner;

public class tip_donusumleri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        System.out.print("Integer bir değer giriniz : ");
        int sayiInt = inp.nextInt();

        System.out.print("Double bir değer giriniz : ");
        double sayiDouble = inp.nextDouble();

        double tip1 = sayiInt;
        int tip2 = (int) sayiDouble;

        System.out.println(tip1);
        System.out.println(tip2);

    }
}
