package java101;
import java.util.Scanner;

public class ters_ucgen {
    public static void main(String[] args) {
        int n = 10;
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        n = inp.nextInt();

        // burada satırımızı 10 dan 1 e inecek şekilde sıraladık.
        for (int i = n; i>= 1; i--) {
            // boşlukları oluşturduk
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            // yıldızları koyduk.
            for (int j = 1; j <= (2 * i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
