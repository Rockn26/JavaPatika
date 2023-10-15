package week5;

import java.util.Scanner;

public class time_convert {

    public static String TimeConvert(int num){
        int hours = num / 60;
        int minutes = num % 60;

        return hours + ":" + minutes;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int input = inp.nextInt();
        String result = TimeConvert(input);

        System.out.println(result);


    }
}
