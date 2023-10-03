package week4.Macera_Oyunu.src;

import java.util.Scanner;

public class Game {

    private Scanner inp = new Scanner(System.in);

    public void start(){
        System.out.println("Macera oyununa hoşgeldiniz!");
        System.out.print("Lütfen bir isim giriniz : ");
        String playerName = inp.nextLine();
    }

}