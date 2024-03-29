package week4.Macera_Oyunu.src;

import week4.Macera_Oyunu.src.items.Armor;
import week4.Macera_Oyunu.src.items.Weapon;

public class Inventory {
    private Weapon weapon;
    private Armor armor;

    private boolean food = false;
    private boolean firewood = false;
    private boolean water = false;

    public Inventory() {
       this.weapon = new Weapon("Yumruk",-1,0,0);
       this.armor = new Armor(-1,"Paçavra",0,0);
    }


    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
