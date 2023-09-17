package week2;


public class polidrom_sayi {
    static boolean isPolidrom(int sayi) {
        int temp = sayi, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }


        if (sayi == reverseNumber) {
            return true;
        } else {
            return  false;
        }


    }

    public static void main(String[] args) {
        System.out.println(isPolidrom(9889));

    }
}
