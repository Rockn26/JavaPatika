package week5.Try_Catch.src;

import java.util.Scanner;


public class Main {

    public static int Array(int[] arr , int index){
        if (index < 0 || index >= arr.length)
            throw new ArrayIndexOutOfBoundsException("İndeksin dışında olamaz!");
        return arr[index];
    }

    public static void main(String[] args) {

        // 10 elemanlı dizimiz

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        Scanner inp = new Scanner(System.in);
        System.out.println("Dizideki almak istediğiniz eleman : ");
        int num = inp.nextInt();


        try {
            int secilen = Array(arr,num);
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