package week4.try_catch.src;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);


        try{
            int a = inp.nextInt();
            int  b = inp.nextInt();
            System.out.println(a/b);
        } catch (InputMismatchException i){
            System.out.println(i.getClass().getName());
        } catch (ArithmeticException a){
            System.out.println(a.getClass().getName() + ": / by zero");
        }
    }
}
