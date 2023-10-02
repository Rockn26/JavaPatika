package week4.Kalitim2.src;

public class Lab_Asistan extends Asistan{

    public Lab_Asistan(String adSoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }

    public void lablaraGir(){
        System.out.println(getAdSoyad() + " lablara girdi.");
    }

    @Override
    public void derseGir(String saat){
        System.out.println(getAdSoyad() + " derse giriş yaptı");
    }

}
