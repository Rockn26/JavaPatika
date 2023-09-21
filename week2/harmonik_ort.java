package week2;

public class harmonik_ort {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};

        /*
      double result = 0.0;
        for (int number : numbers) {
            result += (double) 1 / number;
        }
         */

        double result = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            result+= (double) 1 / numbers[i];
        }

        System.out.println(numbers.length / result);

    }
}
