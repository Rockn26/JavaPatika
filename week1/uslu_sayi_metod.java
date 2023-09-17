package week1;

public class uslu_sayi_metod {

    static void string() {
        System.out.println("String");
    }
    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result*=base;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sonuç : " + power(3,2));
        string();
    }
}
