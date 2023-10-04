package week4.Macera_Oyunu.src;

import java.util.Scanner;
import java.util.SortedMap;

public class Game {

    private Scanner inp = new Scanner(System.in);

    public void start() {
        System.out.println("Macera oyununa hoşgeldiniz!");
        System.out.println("Lütfen bir isim giriniz : ");
        //String playerName = inp.nextLine();
        Player player = new Player("irfan");
        System.out.println("Sayın " + player.getName() + " bu korkunç adaya hoşgeldiniz! Burada yaşananların hepsi gerçek!");
        System.out.println("Lütfen bir karakter seçiniz ! ");
        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println();
            System.out.println("############ Bölgeler ############");
            System.out.println();
            System.out.println("1- Güvenli Ev ---> Burası sizin için güvenli bir ev, düşman yoktur!");
            System.out.println("2- Eşya Dükkanı --> Silah veya Zırh satın alabilirsiniz ! ");
            System.out.println("3- Mağara --> Ödül <YEMEK>, dikkatli ol canavar çıkabilir!");
            System.out.println("4- Orman --> Ödül <ODUN>, dikkatli burası mağaradan daha tehlikeli");
            System.out.println("5- Nehir --> Ödül <Su>, dikkatli ol burası son seviye ! Ayı çıkabilir.");
            System.out.println("0- Çıkış yap --> Oyunu sonlandır.");
            System.out.println("Lütfen gitmek istediğiniz bölgeyi sseçiniz : ");
            int selectLoc = inp.nextInt();
            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Lütfen geçerli bir bölge giriniz ! ");
            }

            if (location == null){
                System.out.println("Oyun bitti yine bekleriz ^^");
                break;
            }

            if (!location.onLocation()) {
                System.out.println("Game Over");
                break;
            }
        }
    }
}