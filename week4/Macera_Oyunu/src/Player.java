package week4.Macera_Oyunu.src;

import week4.Macera_Oyunu.src.characters.Archer;
import week4.Macera_Oyunu.src.characters.GameChar;
import week4.Macera_Oyunu.src.characters.Knight;
import week4.Macera_Oyunu.src.characters.Samurai;
import week4.Macera_Oyunu.src.items.Weapon;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int orjinalHealth;
    private int money;
    private String name;
    private String charName;
    private Scanner inp = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0){
            health = 0;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public void selectChar() {
        Samurai samurai = new Samurai();
        Knight knight = new Knight();
        Archer archer = new Archer();

        GameChar[] charlist = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Karakterler");
        System.out.println("---------------------------------------------------------------------------------------");
        for (GameChar gameChar : charlist) {
            System.out.println("ID : " + gameChar.getId() +
                    "\t Karakter:" + gameChar.getName() +
                    "\t\t Hasar: " + gameChar.getDamage() +
                    "\t\t Sağlık : " + gameChar.getHealth() +
                    "\t\t Para : " + gameChar.getMoney());
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.print("Lütfen bir karakter seçiniz : ");
        int selectChar = inp.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
                break;
        }
       /* System.out.println("Karakter : " + this.getCharName() +
                ", Hasar : " + this.getDamage() +
                ", Sağlık : " + this.getHealth() +
                ", Para : " + this.getMoney());

        */
    }


    public void printInfo() {
        System.out.println("Silah : " + this.getInventory().getWeapon().getName() +
                ", Zırh : " + this.getInventory().getArmor().getName() +
                ", Bloklama: " + this.getInventory().getArmor().getBlock() +
                ", Hasarınız : " + this.getTotalDamage() +
                ", Sağlık : " + this.getHealth() +
                ", Para : " + this.getMoney());
    }


    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOrjinalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    public Weapon getWeapon(){
        return this.getInventory().getWeapon();
    }

    public int getOrjinalHealth() {
        return orjinalHealth;
    }

    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }
}
