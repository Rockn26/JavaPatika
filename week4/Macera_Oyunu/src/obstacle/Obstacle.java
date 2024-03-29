package week4.Macera_Oyunu.src.obstacle;

public class Obstacle {
    private int id;
    private int damage;
    private int health;
    private String name;
    private int award;
    private int orjinalAward;
    private int orjinalHealth;

    public Obstacle(int id, int damage, int health, String name, int award) {
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.orjinalHealth = health;
        this.name = name;
        this.award = award;
        this.orjinalAward = award;
    }

    public int getOrjinalHealth() {
        return orjinalHealth;
    }

    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getOrjinalAward() {
        return orjinalAward;
    }

    public void setOrjinalAward(int orjinalAward) {
        this.orjinalAward = orjinalAward;
    }

    public void setHealth(int health) {
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }
}
