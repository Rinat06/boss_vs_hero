package kg.geektech.les5.Createboss;

public class CreateBoss {
    private int bossHealth;
    private int bossDamege;
    private String bossClass;


    public CreateBoss(int bossHealth, int bossDamege, String bossClass) {
        this.bossClass = bossClass;
        if (bossHealth < 700) {
            System.out.println("Wrong value for height field");
            this.bossHealth = getbossHealth();
        } else this.bossHealth = bossHealth;{

        }
        if (bossDamege < 50) {
            System.out.println("Wrong value for height field");
            this.bossDamege = getbossDamege();
        } else this.bossDamege = bossDamege;{

        }
    }


    public int getbossHealth() {
        return bossHealth;
    }

    public int getbossDamege() {
        return bossDamege;
    }

    public String getbossClass() {
        return bossClass;
    }

}

