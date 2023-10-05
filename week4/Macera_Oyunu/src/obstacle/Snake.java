package week4.Macera_Oyunu.src.obstacle;

import week4.Macera_Oyunu.src.obstacle.Obstacle;

import java.util.Random;

public class Snake extends Obstacle {

    public Snake() {
        super(4,3,12,"Yılan",0);
        Random random = new Random();
        this.setDamage(random.nextInt(3,6));

    }
}
