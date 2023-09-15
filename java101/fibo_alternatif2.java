package java101;

public class fibo_alternatif2 {
    public static int fibo (int n) {

        // 1 1 2 3 5 8
        //n1n2n3..  nn

        if (n == 1 || n == 2) return 1;
        return  fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {

        System.out.println(fibo(5));

    }
}
