package week4.Macera_Oyunu.src.dungeon;

import week4.Macera_Oyunu.src.Player;
import week4.Macera_Oyunu.src.location.BattleLoc;
import week4.Macera_Oyunu.src.obstacle.Bear;

public class River extends BattleLoc {

    public River(Player player) {
        super(player,"Nehir",new Bear(),"water",2);
    }
}
