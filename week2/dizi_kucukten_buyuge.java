package week2;

import java.util.Arrays;
import java.util.Scanner;

public class dizi_kucukten_buyuge {

    public static void main(String[] args) {

        int[] list = {15,12,788,1,-1,-778,2,0};


        Scanner inp = new Scanner(System.in);
        System.out.print("Girilen sayı : ");
        int n = inp.nextInt();
        int min = n;
        int max = n;

        Arrays.sort(list);
        System.out.println("Sıralı liste : " + Arrays.toString(list));

        for (int i : list) {
           if (i > n) {
               max = i;
               break;
           }
        }

        for (int i = list.length-1; i>=0 ; i--) {
            if (list[i] < n) {
                min = list[i];
                break;
            }
        }

        System.out.println(max);
        System.out.println(min);


    }
}
