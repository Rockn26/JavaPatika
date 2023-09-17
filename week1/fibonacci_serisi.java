package week1;
import java.util.Scanner;

public class fibonacci_serisi {
    public static void main(String[] args) {
        // Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.


        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz  : ");
        n = inp.nextInt();
        int n1 = 0;
        int n2 = 1;
        int toplam ;
        System.out.print(n + " elemanlı fibo serisi : ");
        // 0 1 1 2 3 5 8 13 21 34..
        for (int i = 1; i <= n; i++) {  // int girişi kadar döndürdük.
            System.out.print(n1 + " ");
            toplam = n1 + n2;
            n1 = n2;   // sayıları tek tek kaydırıyoruz.
            n2 = toplam; // sayıları tek tek kaydırıyoruz.
        }



    }
}
