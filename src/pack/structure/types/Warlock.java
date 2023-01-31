package pack.structure.types;

import pack.structure.specialities.Mage;

public final class Warlock extends Mage {
    public Warlock(String name, int hpCf, int attackCf, int manaCf) {
        super(name,80*hpCf, 120*attackCf, 50*manaCf);
    }
}