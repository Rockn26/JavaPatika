package java101;

import java.util.Scanner;

public class kullanici_girisi {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int select = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = inp.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı");

        } else {
            System.out.println("Hatalı giriş");
            System.out.println("Şifrenizi sıfırlamak ister misiniz ?\n1-Evet\n2-Hayır");
            select = inp.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Yeni şifrenizi giriniz : ");
                    newPassword = inp.next();
                    if (!newPassword.equals("java123")){
                        System.out.println("Şifreniz belirlendi.");
                    } else {
                        System.out.println("Yeni şifreniz eski şifreniz olamaz\nTekrar deneyiniz");
                    }
                    break;
                case 2:
                    System.out.println("Giriş sayfasına yönlendiriliyorsunuz");
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız. Tekrar deneyin");
                    break;
            }


        }
    }

}
