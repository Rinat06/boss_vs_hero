package kg.geektech.les5.CreateHero;

import java.util.Random;

public class CreateHero {
    private int heroesHealth;
    private int heroesDamege;
    private String heroesClass;


    public CreateHero(int heroesHealth,int heroesDamege,String heeroesClass) {
        this.heroesClass = heeroesClass;
        if (heroesHealth <100) {
            this.heroesHealth = getHeroesHealth();
            System.out.println("Wrong value for height field");
        } else {
            this.heroesHealth = heroesHealth;
        }
        if (heroesDamege <3) {
            this.heroesHealth = getHeroesDamege();
            System.out.println("Wrong value for height field");
        } else {
            this.heroesDamege = heroesDamege;
        }



    }
        public int getHeroesHealth () {
            return heroesHealth;
        }

        public int getHeroesDamege () {
            return heroesDamege;
        }

        public String getHeroesClass () {
            return heroesClass;
        }

}