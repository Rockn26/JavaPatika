package week6.dev1;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Brand implements Comparable<Brand>{
    private int id;
    private String name;

    static TreeSet<Brand> brandTreeSet = new TreeSet<>();

    static {
        brandTreeSet.add(new Brand(1,"Samsung"));
        brandTreeSet.add(new Brand(2,"Lenova"));
        brandTreeSet.add(new Brand(3,"Apple"));
        brandTreeSet.add(new Brand(4,"Huwaei"));
        brandTreeSet.add(new Brand(5,"Casper"));
        brandTreeSet.add(new Brand(6,"Asus"));
        brandTreeSet.add(new Brand(7,"HP"));
        brandTreeSet.add(new Brand(8,"Xiaomi"));
        brandTreeSet.add(new Brand(9,"Monster"));


    }


    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }



    @Override
    public int compareTo(Brand o) {
        return this.getName().compareTo(o.getName());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
