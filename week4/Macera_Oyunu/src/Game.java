package week4.Macera_Oyunu.src;

import java.util.Scanner;

public class Game {

    private Scanner inp = new Scanner(System.in);

    public void start(){
        System.out.println("Macera oyununa hoşgeldiniz!");
        System.out.println("Lütfen bir isim giriniz : ");
        //String playerName = inp.nextLine();
        Player player = new Player("irfan");
        System.out.println("Sayın " + player.getName() + " bu korkunç adaya hoşgeldiniz! Burada yaşananların hepsi gerçek!");
        System.out.println("Lütfen bir karakter seçiniz ! ");
        player.selectChar();
    }

}