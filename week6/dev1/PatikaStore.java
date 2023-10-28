package week6.dev1;

import java.util.Scanner;

public class PatikaStore {
    public static Scanner inp = new Scanner(System.in);

    public  void printMenu(){

        boolean isTrue = true;
        System.out.println();
        System.out.println("Patika Store'a hoşgeldiniz");

        while (isTrue){
            System.out.println();
            System.out.println("Patika Store Menü");
            System.out.println("1- Notebook işlemleri");
            System.out.println("2- SmartPhone işlemleri");
            System.out.println("3- Marka listele");
            System.out.println("4- Çıkış yap");
            System.out.println("Bir işlem seçiniz : ");
            int selected = inp.nextInt();
            switch (selected){
                case 1 :
                    NotebookOperation nb = new NotebookOperation();
                    nb.notebookMenu();
                    break;
                case 4 :
                    isTrue = false;
                    System.out.println();
                    System.out.println(">>>>>>><<<<<<<");
            }
        }


    }


}
