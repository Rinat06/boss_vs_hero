package kg.geektech.les5.general;

import kg.geektech.les5.CreateHero.CreateHero;
import kg.geektech.les5.Createboss.CreateBoss;

import java.util.Random;

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
        CreateBoss createBoss = new CreateBoss(700,50,"boss");
        System.out.println("Helth:" + createBoss.getbossHealth() + " Damage:" + createBoss.getbossDamege() + " Classboss:" + createBoss.getbossClass());
    }
}


