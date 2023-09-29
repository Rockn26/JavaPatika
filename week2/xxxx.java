package week2;

import java.util.Arrays;
public class xxxx {

    public static void main(String[] args) {

        int [][] matrix = new int[3][4];
        int number = 1;

       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               matrix[i][j] = number++;
           }
       }

        for (int []row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }



    }

}

