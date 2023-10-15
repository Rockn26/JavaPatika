package week5.PatikaStore.src;

import java.util.ArrayList;

public class Notebook extends Product{
    private static ArrayList<Notebook> notebooks = new ArrayList<>();
    public Notebook(Brand brand, int unitPrice, int discountRate, int stock, String productName, int ram, int storage, double screenSize) {
        super(brand, unitPrice, discountRate, stock, productName, ram, storage, screenSize);
    }

    public static ArrayList<Notebook> getNotebooks() {
        return notebooks;
    }

    public static void setNotebooks(ArrayList<Notebook> notebooks) {
        Notebook.notebooks = notebooks;
    }
}
