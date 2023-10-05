package week4.Macera_Oyunu.src.dungeon;

import week4.Macera_Oyunu.src.Player;
import week4.Macera_Oyunu.src.location.BattleLoc;
import week4.Macera_Oyunu.src.obstacle.Vampire;

public class Forest extends BattleLoc {

    public Forest(Player player) {
        super(player,"Orman",new Vampire(),"firewood",3);
    }
}
