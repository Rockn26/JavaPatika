package java101;
import java.util.Scanner;
public class cin_zodyak {
    public static void main(String[] args) {
        int year;
        String burc = "";

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz : ");
        year = inp.nextInt();

        // switch case yöntemini seçtiğim için girdiyle mod alma işlemini bir araya getirip switch e koydum.

        int result = year % 12;

        switch (result) {
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
            default:
                System.out.println("Hatalı veri girişi");
                break;
        }

        System.out.println("Çin zodyak burcunuz : " + burc);



        // bu işlemi if else kullanarak yapabilirdik fakat switch case kullanarak kod fazlalığından kaçındım.

        /*
        if (year % 12 == 0) {
            burc = "Maymun";
        } else if (year % 12 == 1) {
            burc = "Horoz";
        } else if ( year % 12 == 2 {
            burc = "Köpek";
        }
        System.out.println("Çin Zodyağı burcunuz : " + burc);
         */

    }
}
