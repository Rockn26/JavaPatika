package week4.try_catch.src;

public class ornek {

    static long power(int a , int b) throws Exception{
        if (a < 0 || b < 0){
            throw new Exception("a or b should not be negative.");
        }else if( a == 0 && b == 0){
            throw new Exception("a and b should not be zero.");
        }else {
            return (long) Math.pow(a,b);
        }
    }
    public static void main(String[] args) {


            try {
                System.out.println(power(0,0));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }



    }
}
