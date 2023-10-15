package week5.PatikaStore.src;

import java.util.Scanner;

public class PatikaStore {
    static Scanner inp = new Scanner(System.in);
    public void run(){
        System.out.println("PATİKA STORE'A HOŞGELDİNİZ !");
        boolean isShow = true;
        while (isShow){
            System.out.println("İşlemler ->>>>>");
            System.out.println();
            System.out.println("1 - Akıllı telefon işlemleri : ");
            System.out.println("2 - Notebook işlemleri : ");
            System.out.println("3 - Markaları Listele : ");
            System.out.println("0 - Çıkış yap  ");
            System.out.print("İŞLEM YAPMAK İSTEDİĞİNİZ NUMARAYI GİRİNİZ : ");
            int select = inp.nextInt();
            switch (select){
                case 1 :
                    SmartPhoneOp s = new SmartPhoneOp();
                    s.smartPhoneProcess();
                    break;
                case 2 :
                    NotebookOp n = new NotebookOp();
                    n.notebookProcess();
                    break;
                case 3 :
                    Brand.showBrand();
                    System.out.println();
                    break;
                case 0:
                    isShow = false;
                    break;
                default:
                    System.out.println("Çıkış yaptınız..");
            }
        }
    }

}
