package java101;
import java.util.Scanner;

public class vucut_kitle_index {
    public static void main(String[] args) {
        double kilo, boy;
        double index;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = inp.nextDouble();

        // vücut kitle indexi = kilo(kg)/boy(m)*boy(m)
        index = kilo / (boy*boy);

        System.out.println("Vücut kitle indeksiniz : " + index);


    }
}
