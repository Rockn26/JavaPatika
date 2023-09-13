package java101;
import java.util.Scanner;

public class dort_ve_bes_kuvvetleri {
    public static void main(String[] args) {

        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sınır sayısı giriniz : ");
        n = inp.nextInt();

        for (int i = 1; i<=n; i*=4) {
            System.out.println(i);
        }
        System.out.println("------------------------");
        for (int z = 1; z<=n; z*=5) {
            System.out.println(z);
        }

    }
}
