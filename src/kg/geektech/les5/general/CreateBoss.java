package kg.geektech.les5.general;

import kg.geektech.les5.Weapon.Weapon;

public class CreateBoss {
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    private int bossHealth;

    public String getBossClass() {
        return bossClass;
    }

    public void setBossClass(String bossClass) {
        this.bossClass = bossClass;
    }

    public int getBossDamege() {
        return bossDamege;
    }

    public void setBossDamege(int bossDamege) {
        this.bossDamege = bossDamege;
    }

    private int bossDamege;
    private String bossClass;

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }
}