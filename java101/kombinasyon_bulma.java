package java101;
import java.util.Scanner;

public class kombinasyon_bulma {
    public static void main(String[] args) {

       // C(n,r) = n! / (r! * (n-r)!)
        int n, r;
        int total = 1;
        int total1= 1;
        int total2= 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kombinasyonu alınacak sayı : ");
        n = inp.nextInt();
        System.out.print("Kombinasyon sayısı : ");
        r = inp.nextInt();

        // n! hesabı
        for (int i = 1; i<=n; i++) {
            total *=i;
        }
        // r! hesabı
        for (int k = 1; k<=r; k++) {
            total1 *=k;
        }

        // n-r! hesabı
        int z = n-r;
        for (int f = 1; f<=z; f++) {
            total2 *=f;
        }

        System.out.println(total/(total1*(total2)));

    }
}
