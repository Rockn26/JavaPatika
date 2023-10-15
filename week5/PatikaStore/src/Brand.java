package week5.PatikaStore.src;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Brand implements Comparable<Brand>{
    private String branName;
    private int id;

    static Map<Integer, String> brands = new HashMap<>();


    static {
        brands.put(1,"Lenova");
        brands.put(2,"Asus");
        brands.put(3, "Apple");
        brands.put(4, "Casper");
        brands.put(5, "Hp");
        brands.put(6, "Xiaomi");
        brands.put(7, "Monster");
        brands.put(8, "Huawei");
        brands.put(9, "Samsung");
    }


    public static void showBrand(){
        TreeSet<String> brandsName = new TreeSet<>(String::compareTo);
        brandsName.addAll(brands.values());
        for (String b : brandsName){
            System.out.println(b);
        }
    }


    public Brand(String branName, int id) {
        this.branName = branName;
        this.id = id;
    }

    public String getBranName() {
        return branName;
    }

    public void setBranName(String branName) {
        this.branName = branName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Brand o) {
        return branName.compareTo(o.branName);
    }
}
