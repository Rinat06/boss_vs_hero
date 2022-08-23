package kg.geektech.les5.general;

import kg.geektech.les5.CreateHero.CreateHero;

public class Main {

    public static void main(String[] args) {
        {
            CreateHero createHero = new CreateHero(200, 20, "Tor");
            System.out.println("Health:" + createHero.getHeroesHealth() + " Damage:" + createHero.getHeroesDamege() + " Classhero:" + createHero.getHeroesClass());

        }
        {
            CreateHero createHero = new CreateHero(150, 7, "Medic");
            System.out.println("Health:" + createHero.getHeroesHealth() + " Damage:" + createHero.getHeroesDamege() + " Classhero:" + createHero.getHeroesClass());
        }
        {
            CreateHero createHero = new CreateHero(180, 15, "Pyhical");
            System.out.println("Health:" + createHero.getHeroesHealth() + " Damage:" + createHero.getHeroesDamege() + " Classhero:" + createHero.getHeroesClass());
        }


        CreateBoss boss=new CreateBoss();
        boss.setBossHealth(333);
        boss.setBossDamege(50);
        System.out.println("Health: " + boss.getBossHealth() + " Damage: " + boss.getBossDamege() + " Classboss: " + boss.getBossClass());
        boss.getWeapon().setWeaponName("weapon");
        boss.getWeapon().setWeaponType("cold");
        System.out.println("WeaponName: "+ boss.getWeapon().getWeaponName() + " WeaponType: "+ boss.getWeapon().getWeaponType());


    }
}


