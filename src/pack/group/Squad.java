package pack.group;

import pack.structure.Types;
import pack.structure.base.Hero;
import pack.structure.types.*;

import java.awt.print.Pageable;
import java.util.Random;

public class Squad {
    private final Random random;
    private int size;
    private final Hero[] heroes;

    public Squad(int size) {
        random = new Random();
        this.size = size;
        this.heroes = new Hero[size];
        fill();
    }

    private void fill() {
        Hero hero;
        for (int i = 0; i < heroes.length; i++) {
            switch (random.nextInt(Types.MAX)) {
                case Types.PALADIN -> {
                    hero = new Paladin("Pal", 2, 2, 3);
                    break;
                }
                case Types.BERSERKER -> {
                    hero = new Berserker("Ber", 1, 3, 2);
                    break;
                }
                case Types.ELF -> {
                    hero = new Elf("Elf", 2, 2, 3);
                    break;
                }
                case Types.HUNTER -> {
                    hero = new Hunter("Hunt", 2, 3, 1);
                    break;
                }
                case Types.WARLOCK -> {
                    hero = new Warlock("War", 2, 3, 1);
                    break;
                }
                case Types.WIZARD -> {
                    hero = new Wizard("Wiz", 2, 1, 3);
                    break;
                }
                default -> throw new RuntimeException("Wrong hero type");

            }
            heroes[i] = hero;
        }
    }

    private boolean anyAlive() {
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
        while (true){
            hero = heroes[random.nextInt(heroes.length)];
            if (hero.isAlive()) return hero;
        }
    }
}
