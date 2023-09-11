package java101;
import java.util.Scanner;

public class kdv_tutari_hesaplayan_program {
    public static void main(String[] args) {

        double tutar, kdvOran, kdvTutar, toplam;

        Scanner inp = new Scanner(System.in);

        System.out.print("Alınacak ürünün fiyatını giriniz : ");
        tutar = inp.nextInt();

        kdvOran = tutar < 1000 ? 0.18 : 0.08;
        kdvTutar = tutar * kdvOran;
        toplam = tutar + kdvTutar;

        System.out.println("KDV siz tutar : " + tutar);
        System.out.println("KDV oranı : " + kdvOran);
        System.out.println("KDV tutarı : " + kdvTutar);
        System.out.println("KDV dahil fiyat :" + toplam);






    }
}
