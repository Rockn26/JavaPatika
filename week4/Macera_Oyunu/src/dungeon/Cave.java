package week4.Macera_Oyunu.src.dungeon;

import week4.Macera_Oyunu.src.Player;
import week4.Macera_Oyunu.src.location.BattleLoc;
import week4.Macera_Oyunu.src.obstacle.Zombie;

public class Cave extends BattleLoc {
    public Cave(Player player) {
        super(player, "Mağara", new Zombie(), "food",3);
    }
}
