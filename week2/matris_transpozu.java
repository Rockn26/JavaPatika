package week2;

import java.util.Arrays;

public class matris_transpozu {

    //  kod fazlalığından kurtulmak için print metodu yazdık.
    static void print(int[][] arr) {
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matris = {
                {1, 5, 3},
                {4, 8, 6}
        };

        // burada yeni çok boyutlu dizi oluşturduk ve onu matris dizisine eşitledik
        // buradaki durumda x indeksini y indeksine eşitledik.
        int[][] transpoz;
        transpoz = new int[matris[0].length][matris.length];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris : ");
        print(matris); // dizinin matrisi
        System.out.println("Transpozu : ");
        print(transpoz); // dizinin transpozu


    }

}
