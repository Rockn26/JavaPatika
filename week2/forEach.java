package week2;

import java.util.Arrays;

public class forEach {
    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };


        for (int[] satir : matris) {
            for (int sutun : satir) {
                System.out.print(sutun + " ");
            }
            System.out.println();
        }


        // for each kullanmak yapısı ise bu şekilde.
        /*
        for (int i = 0; i < matris.length; i++) { // sütunu burada bulduk.
            for (int j = 0; j < matris[i].length; j++) { // satırları da burada aradık.
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }


         */


    }
}
