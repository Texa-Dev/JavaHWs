package pack.group;

import pack.structure.Types;
import pack.structure.base.Hero;
import pack.structure.types.*;

import java.util.Arrays;
import java.util.Random;

public class Squad {
    //TODO Баланс героев
    private final Random random;
    //private int size; --> конвертирована в локальную переменную
    private final Hero[] heroes;

    private final String[] names = new String[]{"Orrin", "Valeska", "Edrik", "Silvia", "Lord Hart", "Sorsha", "Cristian", "Tiris",
                                                "Fiona", "Urash", "Marius", "Ignat", "Octavia", "Calx", "Pair", "Nimus",
                                                "Yog", "Gurrison", "Baraka", "Shiva", "Grec", "Krellion", "Kreg Hek", "Tiraksor",
                                                "Corkes", "Jeremy", "Illor", "Almor", "Lina", "Anabel", "Cassiopeia", "Miriam"};

    public Squad(int size) {
        random = new Random();
        this.heroes = new Hero[size];
        fill();
    }
  public String getHeroName(){
   return names[random.nextInt(names.length)];
  }

    private void fill() {
        Hero hero;
        for (int i = 0; i < heroes.length; i++) {
            switch (random.nextInt(Types.MAX)) {
                case Types.PALADIN -> hero = new Paladin(getHeroName(), 1, 2, 3);
                case Types.BERSERKER -> hero = new Berserker(getHeroName(), 1, 3, 2);
                case Types.ELF -> hero = new Elf(getHeroName(), 2, 1, 3);
                case Types.HUNTER -> hero = new Hunter(getHeroName(), 2, 3, 1);
                case Types.WARLOCK -> hero = new Warlock(getHeroName(), 2, 3, 1);
                case Types.WIZARD -> hero = new Wizard(getHeroName(), 2, 1, 3);
                default -> throw new RuntimeException("Wrong hero type");
            }
            heroes[i] = hero;
        }
    }

    public boolean anyAlive() {
        for (Hero hero : heroes) {
            if (hero.isAlive()) {
                return true;
            }
        }
        return false;
    }

    public Hero hero() {
        if (!anyAlive()) {
            throw new RuntimeException("All die");
        }
        Hero hero;
        while (true) {
            hero = heroes[random.nextInt(heroes.length)];
            if (hero.isAlive())
                return hero;
        }
    }

    @Override
    public String toString() {
        return "Squad{" +
                "heroes=" + Arrays.toString(heroes) +
                '}';
    }
}
