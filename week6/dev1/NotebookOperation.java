package week6.dev1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class NotebookOperation {
    public static Scanner inp = new Scanner(System.in);
    static ArrayList<Notebook> notebooks = new ArrayList<>();

    static {
        notebooks.add(new Notebook(1, "Huwaei", 7000, 10, 150, "HUAWEI Matebook 14", 128, 512, 14));
        notebooks.add(new Notebook(2, "Lenova", 1024, 10, 150, "LENOVA V14 IGL", 64, 248, 14));
        notebooks.add(new Notebook(3, "Asus", 8199, 10, 150, "ASUS TUF Gaming", 256, 512, 21));
    }

    public void notebookMenu() {
        boolean isTrue = true;
        while (isTrue) {
            System.out.println();
            System.out.println("Notebook işlemleri");
            System.out.println("----------------------");
            System.out.println("1- Notebookları listele");
            System.out.println("2- Notebookları filtrele");
            System.out.println("3- Notebookları Ekle");
            System.out.println("4- Notebookları sil");
            System.out.println("5- Çıkış yap");
            int selected = inp.nextInt();
            switch (selected) {
                case 1:
                    showNotebook();
                    break;
                case 2:
                    filterNotebook();
                    break;
                case 3 :
                    addNotebook();
                    break;
                case 4 :
                    deleteNotebook();
                    break;
            }
        }
    }

    public void deleteNotebook(){
        showNotebook();
        System.out.println("Silmek istenilen Notebook Id si seçin");
        int selected = inp.nextInt() - 1 ;

        for (Notebook notebook : notebooks){
            if (notebook.getId() == selected){
                notebooks.remove(selected);
            }
        }
        showNotebook();


    }

    public void addNotebook(){
        System.out.println("Urun Id");
        int id = inp.nextInt();

        System.out.println("Marka Adı");
        inp.nextLine();
        String name = inp.nextLine();
        System.out.println("Ürün Fiyatı : ");
        int unitPrice = inp.nextInt();
        System.out.println("İndirim Oranı : ");
        int discountRate = inp.nextInt();
        System.out.println("Stok Sayısı : ");
        int stock = inp.nextInt();

        System.out.println("Depolama : ");
        int storage = inp.nextInt();
        System.out.println("Ürün adı : ");
        inp.nextLine();
        String brand = inp.nextLine();
        System.out.println("Ekran : ");
        int screen = inp.nextInt();
        System.out.println("Ram : ");
        int ram = inp.nextInt();

        notebooks.add(new Notebook(id,name,unitPrice,discountRate,stock,brand,storage,screen,ram));
        showNotebook();
        System.out.println("--------------------");


    }

    public void showNotebook() {
        System.out.println();
        System.out.println("Notebook listesi>>>>");
        System.out.println("----------------------");

        System.out.printf("--------------------------------------------------------%n");
        System.out.printf("| %4s | %20s | %6s | %6s | %8s | %6s | %6s |%n", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Ram");
        System.out.printf("--------------------------------------------------------%n");

        for (Notebook n : notebooks) {
            System.out.printf("| %4d | %20s | %6d | %6s | %8s | %6s | %6s |%n",
                    n.getId(), n.getProductName(), n.getUnitPrice(), n.getName(),
                    n.getStorage(), n.getScreenSize(), n.getRam());
        }

    }

    public void filterNotebook() {
        boolean isTrue = true;
        while (isTrue) {
            System.out.println();
            System.out.println("1- ID ye göre listele");
            System.out.println("2- Markaya göre listele");
            System.out.print("Lütfen bir işlem seçiniz : ");
            int selected = inp.nextInt();
            switch (selected) {
                case 1:
                    filterById();
                    break;
                case 2 :
                    filterByBrand();
                    break;
            }
        }
    }


    public void filterByBrand(){
        showNotebook();

        boolean isTrue = true;

        while (isTrue){
            System.out.println("Tercih ettiğiniz marka numarası : ");
            int select = inp.nextInt();

            if (select >0 && select < 10){
                isTrue = false;
                ArrayList<Notebook> filtredNotebook = new ArrayList<>();

                for (Notebook notebook: notebooks){
                    if (notebook.getId() == select){
                        filtredNotebook.add(notebook);
                    }
                }

                for (Notebook n : filtredNotebook) {
                    System.out.printf("| %4d | %20s | %6d | %6s | %8s | %6s | %6s |%n",
                            n.getId(), n.getProductName(), n.getUnitPrice(), n.getName(),
                            n.getStorage(), n.getScreenSize(), n.getRam());
                }


            } else {
                System.out.println("Hatalı giriş !! ");
            }


        }
    }


    public void filterById() {
        showNotebook();

        System.out.println("Tercih ettiğiniz ID");
        int selected = inp.nextInt() - 1 ;

        while (selected  <0 || selected >= notebooks.size()){
            System.out.println("Geçersiz bir seçim!");
            selected = inp.nextInt() - 1 ;
        }

        Notebook n = notebooks.get(selected);

        System.out.printf("| %4d | %20s | %6d | %6s | %8s | %6s | %6s |%n",
                n.getId(), n.getProductName(), n.getUnitPrice(), n.getName(),
                n.getStorage(), n.getScreenSize(), n.getRam());
    }


    }





