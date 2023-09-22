package week2;


import java.util.Arrays;
import java.util.Scanner;

public class xxx {
    public static void main(String[] args) {

        int[][] matris = {
                {1,5,3},
                {4,8,6}
        };

        System.out.println("Matris : ");
        for (int[] row: matris){
            for (int column : row){
                System.out.print(" " + column + " ");
            }
            System.out.println();
        }

        System.out.println("Transpozu : ");
        int column = matris[0].length;
        for (int i = 0; i < column; i++){
            for (int j = 0; j < matris.length; j++){
                System.out.println(" " + matris[j][i] + " ");
            }
            System.out.println();
        }


    }

}
