package week2;

import java.util.Scanner;

public class desen_recursive {

    static int pattern(int number, int temp, boolean stop) {
        System.out.print(number + " ");
        if (number < 0 || number == 0 || stop == false) {
            stop = false;
            if (number != temp) {
                return pattern(number + 5, temp, stop);
            } else {
                return 0;
            }
        } else {
            return pattern(number - 5, temp, stop);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, temp;
        System.out.print("Number sayısını giriniz :  : ");
        number = inp.nextInt();
        temp = number;

        pattern(number,temp,true);

    }
}
