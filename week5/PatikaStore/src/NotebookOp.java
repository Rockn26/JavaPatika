package week5.PatikaStore.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotebookOp {
    private static Scanner inp = new Scanner(System.in);

    public void notebookProcess() {
        System.out.println("Notebook Telefon İşlemleri : ");
        System.out.println();
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("1- Ürünleri listele  ");
            System.out.println("2- Ürünleri ekle  ");
            System.out.println("3- Ürünleri sil  ");
            System.out.println("4- ID'ye göre sırala  ");
            System.out.println("5- Marka ismine göre sırala  ");
            System.out.println("0- Ana ekrana dön");
            System.out.print("İŞLEM YAPMAK İSTEDİĞİNİZ NUMARAYI GİRİNİZ : ");
            int selected = inp.nextInt();
            switch (selected) {
                case 1:
                    showNotebook();
                    break;
                case 2:
                    addNotebook();
                    break;
                case 3:
                    deleteNotebook();
                    break;
                case 4:
                    shortById();
                    break;
                case 5:
                    shortByBrandName();
                    break;
                case 0:
                    isTrue = false;
                    break;
                default:
                    System.out.println("Geçersiz bir işlem seçtiniz ! ");
                    break;
            }
        }
    }


    public void shortByBrandName(){
     List<Notebook> notebookList = new ArrayList<>();
        System.out.println("Filtrelemek istediğniz Markayı yazın : ");
        String brand = inp.nextLine();

        for (Notebook n : Notebook.getNotebooks()){
            if (n.getBrand().getBranName().equalsIgnoreCase(brand)){
                notebookList.add(n);
            }
        }

        System.out.printf("--------------------------------------------------------%n");
        System.out.printf("| %4s | %20s | %6s | %6s | %8s | %6s | %6s |%n", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Ram");
        System.out.printf("--------------------------------------------------------%n");

        for (Notebook n : notebookList){
            System.out.printf("| %4d | %20s | %6d | %6s | %8s | %6s | %6s |%n",
                    n.getBrand().getId(), n.getProductName(), n.getUnitPrice(), n.getBrand().getBranName(),
                    n.getStorage(), n.getScreenSize(), n.getRam());
        }



    }


    public void shortById() {
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("Sıralamak istediğiniz NUMARAYI giriniz : ");
            int selected = inp.nextInt();

            System.out.printf("--------------------------------------------------------%n");
            System.out.printf("| %4s | %20s | %6s | %6s | %8s | %6s | %6s |%n", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Ram");
            System.out.printf("--------------------------------------------------------%n");


            for (Notebook n : Notebook.getNotebooks()) {
                System.out.printf("| %4d | %20s | %6d | %6s | %8s | %6s | %6s |%n",
                        n.getBrand().getId(), n.getProductName(), n.getUnitPrice(), n.getBrand().getBranName(),
                        n.getStorage(), n.getScreenSize(), n.getRam());
                isTrue = false;
            }

        }
    }

    public void deleteNotebook() {
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("Silmek istediğiniz ürünün NUMARASINI giriniz : ");
            int selected = inp.nextInt();
            for (int i = 0; i < Notebook.getNotebooks().size(); i++) {
               if (Brand.brands.get(selected).equals(Notebook.getNotebooks().get(i).getBrand().getBranName())){
                   Notebook.getNotebooks().remove(i);
                   System.out.println(selected + " başarılı şekilde silinmiştir !");
                   isTrue = false;
               }else {
                   System.out.println("Lütfen geçerli bir NUMARA giriniz! ");
               }
            }
        }
    }


    void addNotebook() {
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("1 - Samsung");
            System.out.println("2 - Lenova");
            System.out.println("3 - Apple");
            System.out.println("4 - Huawei");
            System.out.println("5 - Casper");
            System.out.println("6 - Asus");
            System.out.println("7 - Hp");
            System.out.println("8 - Xiaomi");
            System.out.println("9 - Monster");
            System.out.print("İŞLEM YAPMAK İSTEDİĞİNİZ NUMARAYI GİRİNİZ : ");
            int selected = inp.nextInt();
            if (selected >= 1 & selected <= 9) {
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
                Notebook.getNotebooks().add(new Notebook(new Brand(Brand.brands.get(selected), selected), unitPrice, discountRate, stock, productName, ram, storage, screenS));
                showNotebook();
                System.out.println();
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("ÜRÜNLER BAŞARIYLA EKLENDİ ! ");
                isTrue = false;
            } else {
                System.out.println("Lütfen geçerli bir NUMARA giriniz! ");
            }
        }
    }


    static void showNotebook() {
        System.out.println("Notebook Listesi ->>>>");
        System.out.println();
        System.out.printf("--------------------------------------------------------%n");
        System.out.printf("| %4s | %20s | %6s | %6s | %8s | %6s | %6s |%n", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Ram");
        System.out.printf("--------------------------------------------------------%n");
        for (Notebook n : Notebook.getNotebooks()) {
            System.out.printf("| %4d | %20s | %6d | %6s | %8s | %6s | %6s |%n",
                    n.getBrand().getId(), n.getProductName(), n.getUnitPrice(), n.getBrand().getBranName(),
                    n.getStorage(), n.getScreenSize(), n.getRam());
        }
    }


}
