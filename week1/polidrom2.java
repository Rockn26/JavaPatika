package week1;

public class polidrom2 {
    public static boolean isPolidrom(int number) {
        // iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılar
        // 101 = 101 gibi..
        int geciciSayi = number, reverseNumber = 0, lastNumber;

        while (geciciSayi != 0) {
            lastNumber = geciciSayi % 10;  // sondaki basamağı buldum 101 = 1
            reverseNumber = (reverseNumber * 10) + lastNumber; // 101 => 0 * 10 + 1 = 1
            geciciSayi /= 10;  // 101 / 10 = 10


        }
        if (number == reverseNumber) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {

        System.out.println(isPolidrom(123));


    }
}
