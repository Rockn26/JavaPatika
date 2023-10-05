package week4.Macera_Oyunu.src.dungeon;

import week4.Macera_Oyunu.src.Player;
import week4.Macera_Oyunu.src.location.BattleLoc;
import week4.Macera_Oyunu.src.obstacle.Snake;

public class Mine extends BattleLoc {

    public Mine(Player player) {
        super(player, "Maden", new Snake(), "Süpriz", 5);
    }
}
