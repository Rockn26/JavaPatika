package week4.Macera_Oyunu.src.location;

import week4.Macera_Oyunu.src.Player;
import week4.Macera_Oyunu.src.location.NormalLoc;

public class SafeHouse extends NormalLoc {

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evdesiniz!");
        System.out.println("Canınız yenilendi!");
        this.getPlayer().setHealth(this.getPlayer().getOrjinalHealth());
        return true;
    }
}
