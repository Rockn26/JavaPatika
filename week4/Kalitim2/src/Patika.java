

public class Patika {
    public static void main(String[] args) {

        // Ata Sınıfı
        // Calisan c1 = new Calisan("İrfan Anık", "0555","irfan@gmail.com");

        // Baba sınıf
        // Akademisyen a1 = new Akademisyen("abc", " 0555", "ir@gmail.com", "CENG", "DOÇENT");
        //Memur m1 = new Memur("ads","055","m1@gmail.com","CENG", "09-18");

        // Çocuk sınıf
        OgretimGorevlisi o1 = new OgretimGorevlisi("ASd", "055","o1@gmail.com","CENG","Doçent","123");
       //  Asistan as1 = new Asistan("Ada","055","asi@gmail.com","CENG","Asistan","09-18");
        Bilgi_Islem b1 = new Bilgi_Islem("Bilgi", "055","b1@gmail.com", "CENG","09-18","Network");

        // Torun sınıf
        Lab_Asistan l1 = new Lab_Asistan("Arda", "055"," l1@gmail.com","CENG", "Lab-Asistan","09-18");
        // overriding (Metod Ezme)
        /*
        l1.derseGir();
        a1.derseGir();

         */
        // polimotfizm (çok bişimlilik)
        // override edilmiş methodları çağırabiliyoruz bu başlıkta..
        //int[] loginUser = new int[5];
        //Calisan[] loginUser = {c1,a1,m1,o1};
        //Calisan.girisYapanlar(loginUser);

        // Abstraction (soyutlama)

        o1.derseGir("10.00");



    }
}
