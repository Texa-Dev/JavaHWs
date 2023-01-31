package pack.structure.types;

import pack.structure.specialities.Warrior;

public final class Berserker extends Warrior {
    public Berserker(String name, int hpCf, int attackCf, int armorCf) {
       super(name,150*hpCf, 80*attackCf, 50*armorCf);
    }

    @Override
    public int attack() {
       // if (random)
        return super.attack();
    }
}
