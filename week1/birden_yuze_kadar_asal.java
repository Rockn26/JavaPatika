package week1;

public class birden_yuze_kadar_asal {
    public static void main(String[] args) {
        // Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.



        // 2 den 100 e kadar oaln sayıları yazdırdık.
        for (int i = 2; i <= 100; i++) {
            int n = 0;

            // sayıların asal olma koşuluna bakıyoruz
            for (int j = 2; j<=i; j++) {
                // i değeri j değerine tam bölünüyorsa eğer n  bölen sayısını bir artıyor.
                if (i % j == 0){
                    n++;
                }
            }



            // asal sayılar yalnızca kendisi ve 1 e bölünürler o yüzden bölen sayısı 2 den az olmalıdır
            if (n < 2) {
                System.out.print(" " + i);
            }
        }
    }
}
