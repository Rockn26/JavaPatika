package week1;
import java.util.Scanner;

public class ters_ucgen_alternatif {
    public static void main(String[] args) {
        int n=10;
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        n = inp.nextInt();

        for (int i = n; i>0; i--) {
            for (int j = n-i; j>0; j--){
                System.out.print(" ");
            }
            for (int k = 0; k<(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
