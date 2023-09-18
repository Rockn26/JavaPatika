package week2;

public class toplama_recursive_ornek {
    static int f(int x){
        if (x == 10) return 10;
        System.out.println("x:"+x);
        return x + f(x+1);




    }
    public static void main(String[] args) {

        System.out.println("x:"+f(0));

    }
}
