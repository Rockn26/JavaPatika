package week2;


import java.util.Arrays;

public class tekrar_eden_cift_sayilar {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] list = {3,7,3,3,2,9,10,2,9,10,6,33,6};
        int[] duplicate = new int[list.length];
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0) && (list[j] % 2 == 0)){
                    if (!isFind(duplicate, list[i])) {
                        duplicate[count++] = list[i];
                    }
                }
            }
        }

        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value +  " ");
            }
        }

    }
}


