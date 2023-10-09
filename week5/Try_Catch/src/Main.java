package week5.Try_Catch.src;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // 10 elemanlı dizimiz

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        Scanner inp = new Scanner(System.in);
        System.out.println("Dizideki almak istediğiniz eleman : ");
        int num = inp.nextInt();


        try {
            int secilen = arr[num];
            System.out.println("Seçilen indeksteki eleman : " + secilen);
        } catch (ArrayIndexOutOfBoundsException a) {
            // burada hatayı yakaladık ve hem kendimiz mesaj yazdık hem sınıfın mesajını yazdırdık.
            System.out.println("BİR HATA YAKALANDI. DİZİNİN BOYU AŞILDI.");
            System.out.println(a.getMessage());
        } finally {
            System.out.println("Her zaman çalışacak kod bloğum");
        }

        System.out.println("Deneme, program bitti.");




    }
}