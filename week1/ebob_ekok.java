package week1;
import java.util.Scanner;


public class ebob_ekok {
    public static void main(String[] args) {
        int i = 1, n1,n2, ebob = 1, ekok;
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        n1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = inp.nextInt();

        while ((i <= n1) && (i <= n2)) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;


        }
        ekok = ((n1*n2)/ebob);
        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok :" + ekok);

    }
}
