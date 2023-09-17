package week1;

import java.util.Scanner;

public class atm_switch {
    public static void main(String[] args) {

        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int select;
        int balance = 1500;

        while (right > 0) {
            System.out.print("Kullanıcı adını giriniz : ");
            userName = inp.nextLine();
            System.out.print("Şifrenizi giriniz : ");
            password = inp.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.print("Patika bankasına hoş geldiniz.");

                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye sorgulama\n" +
                            "4-Çıkış yapma");
                    System.out.print("Lütfen seçmek istediğiniz işlemi tuşlayınız : ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırılacak para miktarını giriniz : ");
                            int price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekilecek para miktarını giriniz : ");
                            price = inp.nextInt();
                            if (balance < price) {
                                System.out.println("Yetersiz bakiye");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Görüşmek üzere");
                break;
            } else {
                right--;
                System.out.println("Şifreniz yanlış. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Bankanızla iletişime geçin");
                } else {
                    System.out.println("Kalan hakkınız : " + right);

                }
            }

        }
    }
}