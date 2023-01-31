package pack.structure.types;

import pack.structure.specialities.Warrior;

public final class Paladin extends Warrior {

    public Paladin(String name, int hpCf, int attackCf, int armorCf) {
        super(name,150*hpCf, 50*attackCf, 80*armorCf);
    }
}
