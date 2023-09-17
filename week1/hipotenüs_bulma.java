package week1;
import java.util.Scanner;
import java.lang.Math;


public class hipotenüs_bulma {
    public static void main(String[] args) {

        // Dik kenarlarının toplamının karesi 90 dereceye karşılık gelen kenarın karesine eşittir.
        // a^2 * b^2 = c^2
        Scanner inp = new Scanner(System.in);

        int a, b;
        double c;

        System.out.print("Birinci kenarı giriniz : ");
        a = inp.nextInt();
        System.out.print("İkinci kenarı giriniz : ");
        b = inp.nextInt();


        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs değeri : " + c);



    }
}
