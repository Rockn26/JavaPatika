package week5.PatikaStore.src;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class SmartPhoneOp {
    static Scanner inp = new Scanner(System.in);

    public void smartPhoneProcess() {
        System.out.println("Akıllı Telefon İşlemleri : ");
        System.out.println();
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("1- Ürünleri listeli  ");
            System.out.println("2- Ürünleri ekle  ");
            System.out.println("3- Ürünleri sil  ");
            System.out.println("4- ID'ye göre sırala  ");
            System.out.println("5- Marka ismine göre sırala  ");
            System.out.println("0- Ana ekrana dön");
            System.out.print("İŞLEM YAPMAK İSTEDİĞİNİZ NUMARAYI GİRİNİZ : ");
            int selected = inp.nextInt();
            switch (selected) {
                case 1:
                    showSmartPhones();
                    break;
                case 2 :
                    addPhone();
                    break;
                case 3 :
                    deletePhone();
                    break;
                case 4 :
                    shortById();
                    break;
                case 5 :
                    shortByBrandName();
                    break;
                case 0 :
                    isTrue = false;
                    break;
                default:
                    System.out.println("Geçersiz bir işlem seçtiniz ! ");
                    break;

            }
        }
    }

    public void shortByBrandName(){
       List<SmartPhone> smartPhoneList = new ArrayList<>();
        System.out.println("Filtrelemek istediğiniz Markayı girin : ");
        String brand = inp.nextLine();

        for (SmartPhone s : SmartPhone.getSmartPhones()){
            if (s.getBrand().getBranName().equalsIgnoreCase(brand)){
                smartPhoneList.add(s);
            }
        }

        System.out.printf("---------------------------------------------------%n");
        System.out.printf("| %4s | %20s | %6s | %6s | %8s | %6s | %6s | %6s | %10s |%n", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Pil", "Ram", "Renk");
        System.out.printf("-----------------------------------------------------------%n");

        for (SmartPhone n: smartPhoneList){
            System.out.printf("| %4s | %20s | %6s | %6s | %8s | %6s | %6s | %6s | %10s |%n",
                    n.getBrand().getId(), n.getProductName(), n.getUnitPrice(), n.getBrand().getBranName(),
                    n.getStorage(), n.getScreenSize(), n.getBattery(), n.getRam(), n.getColor());
        }
    }


    public void shortById(){
        boolean isTrue = true;
        while (isTrue){
            System.out.println("Filtrelemek istediğiniz Numarayı yazın: ");

            System.out.printf("---------------------------------------------------%n");
            System.out.printf("| %4s | %20s | %6s | %6s | %8s | %6s | %6s | %6s | %10s |%n", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Pil", "Ram", "Renk");
            System.out.printf("-----------------------------------------------------------%n");

            for (SmartPhone n : SmartPhone.getSmartPhones()) {
                System.out.printf("| %4s | %20s | %6s | %6s | %8s | %6s | %6s | %6s | %10s |%n",
                        n.getBrand().getId(), n.getProductName(), n.getUnitPrice(), n.getBrand().getBranName(),
                        n.getStorage(), n.getScreenSize(), n.getBattery(), n.getRam(), n.getColor());
                isTrue = false;
            }
        }
    }

    public void deletePhone(){
        boolean isTrue = true;
        while (isTrue){
            System.out.println("Silmek istediğiniz ürünün NUMARASINI giriniz : ");
            int selected = inp.nextInt();
            for (int i = 0; i < SmartPhone.getSmartPhones().size() ; i++){
                if (Brand.brands.get(selected).equals(SmartPhone.getSmartPhones().get(i).getBrand().getBranName())){
                    SmartPhone.getSmartPhones().remove(i);
                    System.out.println(selected + " başarılı şekilde silindi");
                    isTrue = false;
                }else {
                    System.out.println("Lütfen geçerli numara giriniz.");
                }
            }
        }
    }


    void addPhone(){
        System.out.println("1 - Apple");
        System.out.println("2 - Samsung");
        System.out.println("3 - Xiaomi");
        boolean isTrue = true;
        while (isTrue){
            System.out.print("İŞLEM YAPMAK İSTEDİĞİNİZ NUMARAYI GİRİNİZ : ");
            int selected = inp.nextInt();
            if (selected >= 1 & selected <=3){
                System.out.println("Birim fiyatı : ");
                int unitPrice = inp.nextInt();
                System.out.println("İndirim oranı : ");
                int discountRate = inp.nextInt();
                System.out.println("Stok Miktarı : ");
                int stock = inp.nextInt();
                System.out.println("Ürün adı : ");
                inp.nextLine();
                String productName = inp.nextLine();
                System.out.println("RAM : ");
                int ram = inp.nextInt();
                System.out.println("Hafıza Alanı : ");
                int storage = inp.nextInt();
                System.out.println("Ekran Boyutu : ");
                double screenS = inp.nextDouble();
                System.out.println("Kamera Kalitesi : ");
                int camQuality = inp.nextInt();
                System.out.println("Batarya Boyutu : ");
                int battery = inp.nextInt();
                System.out.println("Renk : ");
                inp.nextLine();
                String color = inp.nextLine();
                SmartPhone.getSmartPhones().add(new SmartPhone(new Brand(Brand.brands.get(selected),selected),unitPrice,discountRate,stock,productName,ram,storage,screenS,camQuality,battery,color));
                showSmartPhones();
                System.out.println();
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("ÜRÜNLER BAŞARIYLA EKLENDİ ! ");
                isTrue = false;
            }else {
                System.out.println("Lütfen geçerli bir NUMARA giriniz! ");
            }
        }
    }

    static void showSmartPhones() {

        System.out.println("AKILLI TELEFON LİSTESİ->>>>");
        System.out.println();
        //System.out.println("| ID | ÜRÜN ADI \t| FİYAT \t| MARKA \t| DEPOLAMA \t| EKRAN \t| PİL \t| RAM \t| RENK \t|");
        System.out.printf("---------------------------------------------------%n");
        System.out.printf("| %4s | %20s | %6s | %6s | %8s | %6s | %6s | %6s | %10s |%n", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Pil", "Ram", "Renk");
        System.out.printf("-----------------------------------------------------------%n");
        for (SmartPhone n : SmartPhone.getSmartPhones()) {
            System.out.printf("| %4s | %20s | %6s | %6s | %8s | %6s | %6s | %6s | %10s |%n",
                    n.getBrand().getId(), n.getProductName(), n.getUnitPrice(), n.getBrand().getBranName(),
                    n.getStorage(), n.getScreenSize(), n.getBattery(), n.getRam(), n.getColor());
        }


        }
    }


