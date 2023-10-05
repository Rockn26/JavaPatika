package week4.Macera_Oyunu.src;

import java.util.Objects;
import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();
        System.out.println("Şu an buradasınız : " + this.getName());
        System.out.println("Dikkatl Ol! Burada " + obsNumber + " tane " + this.getObstacle().getName() + " yaşıyor!");
        System.out.print("<S>avaş veya <K>aç : ");
        String selectCase = inp.nextLine();
        selectCase = selectCase.toUpperCase(); // büyük harflerle işlem yapacağız.
        if (selectCase.equals("S") && combat(obsNumber)) {
            System.out.println("Savaşılıyor...");
            // Savaşma işlemi yapılacak.
            System.out.println(this.getName() + " tüm düşmanları yendiniz !");
            stringAward();
            return true;
        }
        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("Öldünüz ! ");
            return false;
        }
        return true;
    }

    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOrjinalHealth());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.println("<V>ur veya <K>aç");
                String selectCombat = inp.nextLine().toUpperCase(); // kısa hali

                if (selectCombat.equals("V")) {
                    firstAttack();
                } else {
                    return false;
                }
            }

            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                if (this.getName().equals("Maden"))
                    supriseAward();
                if (this.getObstacle().getName().equals("Yılan")) {
                    this.getObstacle().setAward(this.getObstacle().getOrjinalAward());
                } else {
                    System.out.println("Düşmanı yendiniz ! ");
                    System.out.println(this.getObstacle().getAward() + " para kazandınız !");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                    System.out.println("Güncel paranız : " + this.getPlayer().getMoney());
                    System.out.println("Özel ödünülüz : " + this.getAward());

                }


            } else {
                return false;
            }
        }
        return true;
    }

    public void stringAward() {
        if (this.getAward().equals("food")) {
            this.getPlayer().getInventory().setFood(true);
        }
        if (this.getAward().equals("firewood")) {
            this.getPlayer().getInventory().setFirewood(true);
        }
        if (this.getAward().equals("water")) {
            this.getPlayer().getInventory().setWater(true);
        }
    }

    public void supriseAward() {
        double suprise = Math.random() * 100;
        if (suprise >= 0 && suprise <= 15) {
            System.out.println("---Bir silah düştü!---");
            double silahSans = Math.random() * 100;
            if (silahSans >= 0 && silahSans <= 20) {

                this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(3));
                System.out.println("Kazandığınız silah : " + this.getPlayer().getInventory().getWeapon().getName());
            } else if (silahSans >= 21 && silahSans <= 50) {
                this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(2));
                System.out.println("Kazandığınız silah : " + this.getPlayer().getInventory().getWeapon().getName());
            } else {
                this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(1));
                System.out.println("Kazandığınız silah : " + this.getPlayer().getInventory().getWeapon().getName());
            }
        } else if (suprise >= 16 && suprise <= 30) {
            System.out.println("---Bir zırh düştü!---");
            double zirhSans = Math.random() * 100;
            if (zirhSans >= 0 && zirhSans <= 20) {
                this.getPlayer().getInventory().setArmor(Armor.getArmorObjByID(3));
                System.out.println("Kazandığınız zırh : " + this.getPlayer().getInventory().getWeapon().getName());
            } else if (zirhSans >= 21 && zirhSans <= 50) {
                this.getPlayer().getInventory().setArmor(Armor.getArmorObjByID(2));
                System.out.println("Kazandığınız zırh : " + this.getPlayer().getInventory().getArmor().getName());
            } else {
                this.getPlayer().getInventory().setArmor(Armor.getArmorObjByID(1));
                System.out.println("Kazandığınız zırh : " + this.getPlayer().getInventory().getArmor().getName());
            }

        } else if (suprise >= 31 && suprise <= 55) {
            System.out.println("---Para kazandınız---");
            double paraSans = Math.random() * 100;
            if (paraSans >= 0 && paraSans <= 20) {
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 10);
                System.out.println("Kazanılan para : 10 ");
            } else if (paraSans >= 21 && paraSans <= 50) {
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 5);
                System.out.println("Kazanılan para : 5");
            } else {
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 1);
                System.out.println("Kazanılan para : 1");
            }
        } else {
            System.out.println("---ŞANSSIZSIN. HİÇBİR ŞEY DÜŞMEDİ!!---");
        }
    }

    public void afterHit() {
        System.out.println("Canınız : " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Canı : " + this.getObstacle().getHealth());
        System.out.println("-------");
    }

    public void firstAttack() {
        if (randomAttack()) {
            System.out.println("----SİZ VURDUNUZ----!");
            this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
            afterHit();
            if (this.getObstacle().getHealth() > 0) {
                System.out.println("----CANAVAR SİZE VURDU----!");
                int obstacleDamage = this.getObstacle().getDamage() - getPlayer().getInventory().getArmor().getBlock();
                if (obstacleDamage < 0) obstacleDamage = 0;
                this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                afterHit();
            }
        } else {
            if (this.getObstacle().getHealth() > 0) {
                System.out.println("----CANAVAR SİZE VURDU----!");
                int obstacleDamage = this.getObstacle().getDamage() - getPlayer().getInventory().getArmor().getBlock();
                if (obstacleDamage < 0) obstacleDamage = 0;
                this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                afterHit();
            }
            if (this.getPlayer().getHealth() > 0) {
                System.out.println();
                System.out.println("----SİZ VURDUNUZ----!");
                this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                afterHit();
            }
        }
    }


    public boolean randomAttack() {
        double randNumber = Math.random() * 100;
        return (randNumber >= 50);
    }

    public void playerStats() {
        System.out.println("Oyuncu Değerleri");
        System.out.println("---------------------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth());
        System.out.println("Silah :" + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Zırh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para : " + this.getPlayer().getMoney());
        System.out.println();
    }

    public void obstacleStats(int i) {
        System.out.println(i + "." + this.getObstacle().getName() + " Değerleri");
        System.out.println("---------------------------");
        System.out.println("Sağlık : " + this.getObstacle().getHealth());
        System.out.println("Hasar : " + this.getObstacle().getDamage());
        System.out.println("Ödül : " + this.getObstacle().getAward());
        System.out.println();
    }


    public int randomObstacleNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1; // 3 dediğimde 0-1-2 sayıları geliyor. O yüzden + 1 ekledik.
    }

}
