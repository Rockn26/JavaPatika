package week2;

import java.util.Arrays;

public class sayilarin_frekansi {
    public static void frekans(int[] arr) {

        System.out.println("Diziler : " + Arrays.toString(arr));
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int counter = 1;
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && arr[i] == arr[j]) {
                    counter++;
                }
            }
            System.out.println(arr[i] + " dizisinin " + counter + " tekrar etti");
            i++;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
        frekans(numbers);
    }
}
