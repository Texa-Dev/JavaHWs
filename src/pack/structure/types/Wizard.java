package pack.structure.types;

import pack.structure.specialities.Mage;

public final class Wizard extends Mage {
    public Wizard(String name, int hpCf, int attackCf, int manaCf) {
        super(name,80*hpCf, 100*attackCf, 70*manaCf);
    }

}
