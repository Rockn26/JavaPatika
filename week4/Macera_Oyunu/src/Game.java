package week4.Macera_Oyunu.src;

import java.util.Scanner;
import java.util.SortedMap;

public class Game {

    private final Scanner inp = new Scanner(System.in);

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
            System.out.println("3- Mağara --> Ödül <Food>, dikkatli ol canavar çıkabilir!");
            System.out.println("4- Orman --> Ödül <Firewood>, dikkatli burası mağaradan daha tehlikeli");
            System.out.println("5- Nehir --> Ödül <Water>, dikkatli ol burası son seviye ! Ayı çıkabilir.");
            System.out.println("6- Maden --> Ödül <Suprise>, dikkatli ol burası yılanlarla çevrili!");
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
                    if (!player.getInventory().isFood()) {
                        System.out.println("Mağaraya giriş yaptınız!");;
                        location = new Cave(player);
                    }else {
                        System.out.println("Ödülü aldın, buraya giremezsin!");
                    }
                    break;
                case 4:
                    if (!player.getInventory().isFirewood()){
                        System.out.println("Ormana giriş yaptınız!");
                        location = new Forest(player);
                    }else {
                        System.out.println("Ödülü aldın, buraya giremezsin!");
                    }
                    break;
                case 5:
                    if (!player.getInventory().isWater()){
                        System.out.println("Göle giriş yaptınız!");
                        location = new River(player);
                    }else {
                        System.out.println("Ödülü aldın, buraya giremezsin!");
                    }
                    break;
                case 6:
                    location = new Mine(player);
                    break;
                default:
                    System.out.println("Lütfen geçerli bir bölge giriniz ! ");
            }

            if (player.getInventory().isWater() && player.getInventory().isFood() && player.getInventory().isFirewood()){
                System.out.println("KAZANDINIZ. TÜM ÖZEL ÖDÜLLERİ TOPLADINIZ");
                break;
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