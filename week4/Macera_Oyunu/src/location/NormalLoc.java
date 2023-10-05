package week4.Macera_Oyunu.src.location;

import week4.Macera_Oyunu.src.Player;
import week4.Macera_Oyunu.src.location.Location;

public abstract class NormalLoc extends Location {

    public NormalLoc(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation(){
        return true;
    }
}
